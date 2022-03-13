package com.b4sel.gof.navigation.solid

import androidx.fragment.app.Fragment
import com.b4sel.feature.solid.domain.navigation.SolidNavigator
import com.b4sel.feature.solid.domain.navigation.SolidRouter
import com.b4sel.feature.solid.presentation.usecase.MyNavigator
import javax.inject.Inject

class SolidRouterImpl @Inject constructor(
    private val navigator: SolidNavigator
) : SolidRouter {

    override fun openSrp(fragment: Fragment) {
        navigator.navigateToSrp(fragment)
    }

    override fun openOcp(fragment: Fragment) {
        navigator.navigateToOcp(fragment)
    }

    override fun openLsp(fragment: Fragment) {
        navigator.navigateToLsp(fragment)
    }

    override fun openIsp(fragment: Fragment) {
        navigator.navigateToIsp(fragment)
    }

    override fun openDip(fragment: Fragment) {
        navigator.navigateToDip(fragment)
    }
}