package com.b4sel.shared.navigation

import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

fun Fragment.navigate(navCommand: NavigationCommand, hostId: Int? = null) {
    val navController = if (hostId == null) {
        findNavController()
    } else {
        Navigation.findNavController(requireActivity(), hostId)
    }
    navController.navigate(navCommand.action, navCommand.args, navCommand.navOptions)
}