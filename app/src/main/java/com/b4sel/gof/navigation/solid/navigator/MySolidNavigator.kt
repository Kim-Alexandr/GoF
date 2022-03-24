package com.b4sel.gof.navigation.solid.navigator

import com.b4sel.feature.solid.SolidFragmentHolder
import com.b4sel.feature.solid.domain.navigation.SolidNavigation
import com.b4sel.shared.navigation.navigate
import javax.inject.Inject

class MySolidNavigator @Inject constructor(
    private val solidNavigation: SolidNavigation
) {

    fun navigateToSrp() {
        SolidFragmentHolder.solidFragment?.get()?.navigate(solidNavigation.toSrp)
    }

    fun navigateToOcp() {
        SolidFragmentHolder.solidFragment?.get()?.navigate(solidNavigation.toOcp)
    }

    fun navigateToLsp() {
        SolidFragmentHolder.solidFragment?.get()?.navigate(solidNavigation.toLsp)
    }

    fun navigateToIsp() {
        SolidFragmentHolder.solidFragment?.get()?.navigate(solidNavigation.toIsp)
    }

    fun navigateToDip() {
        SolidFragmentHolder.solidFragment?.get()?.navigate(solidNavigation.toDip)
    }
}