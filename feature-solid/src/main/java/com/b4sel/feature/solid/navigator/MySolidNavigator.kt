package com.b4sel.feature.solid.navigator

import androidx.fragment.app.Fragment
import com.b4sel.feature.solid.domain.navigation.SolidNavigation
import com.b4sel.feature.solid.domain.navigation.SolidNavigator
import com.b4sel.shared.navigation.navigate
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MySolidNavigator @Inject constructor() : HasAndroidInjector, SolidNavigator {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var solidNavigation: SolidNavigation

    override fun androidInjector(): AndroidInjector<Any> =
        androidInjector

    override fun navigateToSrp(fragment: Fragment) {
        fragment.navigate(solidNavigation.toSrp)
    }

    override fun navigateToOcp(fragment: Fragment) {
        fragment.navigate(solidNavigation.toOcp)
    }

    override fun navigateToLsp(fragment: Fragment) {
        fragment.navigate(solidNavigation.toLsp)
    }

    override fun navigateToIsp(fragment: Fragment) {
        fragment.navigate(solidNavigation.toIsp)
    }

    override fun navigateToDip(fragment: Fragment) {
        fragment.navigate(solidNavigation.toDip)
    }
}