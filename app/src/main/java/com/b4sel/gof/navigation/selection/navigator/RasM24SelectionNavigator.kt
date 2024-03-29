package com.b4sel.gof.navigation.selection.navigator

import androidx.annotation.IdRes
import com.b4sel.feature.solid.ui.fragment.SolidFragment
import com.b4sel.gof.ActivityHolder
import com.b4sel.shared.navigation.forwardTo
import javax.inject.Inject

class RasM24SelectionNavigator @Inject constructor(
    @IdRes private val hostId: Int
) {
    fun navigateToSolid() {
        ActivityHolder.activity?.get()?.supportFragmentManager?.forwardTo(SolidFragment.newInstance(), hostId)
    }
}