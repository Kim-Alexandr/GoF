package com.b4sel.gof.navigation.solid.navigator

import androidx.fragment.app.Fragment
import com.b4sel.feature.solid.domain.navigation.SolidNavigation
import com.b4sel.shared.navigation.navigate
import javax.inject.Inject

class MySolidNavigator @Inject constructor(
    private val solidNavigation: SolidNavigation
) {

    fun navigateToSrp(fragment: Fragment) {
        fragment.navigate(solidNavigation.toSrp)
    }

    fun navigateToOcp(fragment: Fragment) {
        fragment.navigate(solidNavigation.toOcp)
    }

    fun navigateToLsp(fragment: Fragment) {
        fragment.navigate(solidNavigation.toLsp)
    }

    fun navigateToIsp(fragment: Fragment) {
        fragment.navigate(solidNavigation.toIsp)
    }

    fun navigateToDip(fragment: Fragment) {
        fragment.navigate(solidNavigation.toDip)
    }
}