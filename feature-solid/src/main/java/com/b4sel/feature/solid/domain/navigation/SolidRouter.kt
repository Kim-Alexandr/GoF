package com.b4sel.feature.solid.domain.navigation

import androidx.fragment.app.Fragment

interface SolidRouter {
    fun openSrp(fragment: Fragment)
    fun openOcp(fragment: Fragment)
    fun openLsp(fragment: Fragment)
    fun openIsp(fragment: Fragment)
    fun openDip(fragment: Fragment)
}