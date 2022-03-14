package com.b4sel.gof.navigation.selection

import androidx.fragment.app.Fragment
import com.b4sel.feature.selection.domain.navigation.SelectionRouter
import com.b4sel.feature.selection.navigator.MySelectionRouter
import javax.inject.Inject

class SelectionRouterImpl @Inject constructor(
    private val mySelectionRouter: MySelectionRouter
) : SelectionRouter {

    override fun openSolid(fragment: Fragment) {
        mySelectionRouter.openSolid(fragment)
    }
}