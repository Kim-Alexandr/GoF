package com.b4sel.shared.navigation

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

private val Fragment.key: String? get() = this::class.simpleName

fun Fragment.navigate(navCommand: NavigationCommand, hostId: Int? = null) {
    val navController = if (hostId == null) {
        findNavController()
    } else {
        Navigation.findNavController(requireActivity(), hostId)
    }
    navController.navigate(navCommand.action)
}

fun FragmentManager.forwardTo(fragment: Fragment, @IdRes container: Int) {
    findFragmentById(container)?.onHiddenChanged(true)
    beginTransaction().run {
        replace(container, fragment)
        addToBackStack(fragment.key)
        commitAllowingStateLoss()
    }
}
