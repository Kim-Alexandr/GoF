package com.b4sel.gof.navigation.selection.navigator

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import com.b4sel.feature.selection.domain.navigation.SelectionNavigator
import com.b4sel.feature.solid.ui.fragment.SolidFragment
import com.b4sel.gof.SingletonActivity
import com.b4sel.shared.navigation.forwardTo
import javax.inject.Inject

class RasM24SelectionNavigator @Inject constructor(
    @IdRes private val hostId: Int
) : SelectionNavigator {
    override fun navigateToSolid(fragment: Fragment) {
        SingletonActivity.activity?.supportFragmentManager?.forwardTo(SolidFragment.newInstance(), hostId)
    }
}