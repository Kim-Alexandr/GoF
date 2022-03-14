package com.b4sel.gof.navigation.selection

import androidx.fragment.app.Fragment
import com.b4sel.feature.selection.domain.navigation.SelectionNavigator
import com.b4sel.feature.selection.domain.navigation.SelectionRouter
import com.b4sel.feature.selection.navigator.MySelectionNavigator
import javax.inject.Inject

class SelectionRouterImpl @Inject constructor(
    private val navigator: SelectionNavigator
) : SelectionRouter {

    override fun openSolid(fragment: Fragment) {
        navigator.navigateToSolid(fragment)
    }
}