package com.b4sel.gof.navigation.solid.navigator

import com.b4sel.feature.solid.domain.navigation.SolidFragmentProvider
import com.b4sel.feature.solid.domain.navigation.SolidNavigation
import com.b4sel.shared.navigation.navigate
import javax.inject.Inject

class MySolidNavigator @Inject constructor(
    private val solidNavigation: SolidNavigation
) {

    fun navigateToSrp() {
        SolidFragmentProvider.solidFragment?.navigate(solidNavigation.toSrp)
    }

    fun navigateToOcp() {
        SolidFragmentProvider.solidFragment?.navigate(solidNavigation.toOcp)
    }

    fun navigateToLsp() {
        SolidFragmentProvider.solidFragment?.navigate(solidNavigation.toLsp)
    }

    fun navigateToIsp() {
        SolidFragmentProvider.solidFragment?.navigate(solidNavigation.toIsp)
    }

    fun navigateToDip() {
        SolidFragmentProvider.solidFragment?.navigate(solidNavigation.toDip)
    }
}