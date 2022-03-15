package com.b4sel.gof.navigation.solid

import com.b4sel.feature.solid.domain.navigation.SolidRouter
import com.b4sel.gof.navigation.solid.navigator.RasM24SolidNavigator
import javax.inject.Inject

class SolidRouterImpl @Inject constructor(
    private val navigator: RasM24SolidNavigator
) : SolidRouter {

    override fun openSrp() {
        navigator.navigateToSrp()
    }

    override fun openOcp() {
        navigator.navigateToOcp()
    }

    override fun openLsp() {
        navigator.navigateToLsp()
    }

    override fun openIsp() {
        navigator.navigateToIsp()
    }

    override fun openDip() {
        navigator.navigateToDip()
    }
}