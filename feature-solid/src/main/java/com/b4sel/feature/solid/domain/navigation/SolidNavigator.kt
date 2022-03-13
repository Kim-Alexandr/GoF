package com.b4sel.feature.solid.domain.navigation

import androidx.fragment.app.Fragment

interface SolidNavigator {
    fun navigateToSrp(fragment: Fragment)
    fun navigateToOcp(fragment: Fragment)
    fun navigateToLsp(fragment: Fragment)
    fun navigateToIsp(fragment: Fragment)
    fun navigateToDip(fragment: Fragment)
}