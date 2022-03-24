package com.b4sel.gof.navigation.selection

import com.b4sel.feature.selection.domain.navigation.SelectionRouter
import com.b4sel.gof.navigation.selection.navigator.MySelectionNavigator
import com.b4sel.gof.navigation.selection.navigator.RasM24SelectionNavigator
import javax.inject.Inject

class SelectionRouterImpl @Inject constructor(
    private val navigator: RasM24SelectionNavigator,
//    private val navigator: MySelectionNavigator,
) : SelectionRouter {

    override fun openSolid() {
        navigator.navigateToSolid()
    }
}