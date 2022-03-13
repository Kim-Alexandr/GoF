package com.b4sel.feature.solid.presentation.usecase

import androidx.fragment.app.Fragment
import com.b4sel.feature.solid.domain.navigation.SolidNavigation
import com.b4sel.feature.solid.domain.navigation.SolidNavigator
import com.b4sel.shared.navigation.navigate
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MyNavigator @Inject constructor() : HasAndroidInjector, SolidNavigator {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var selectionNavigation: SolidNavigation

    override fun androidInjector(): AndroidInjector<Any> =
        androidInjector

    override fun navigateToSrp(fragment: Fragment) {
        fragment.navigate(selectionNavigation.toSrp)
    }

    override fun navigateToOcp(fragment: Fragment) {
        fragment.navigate(selectionNavigation.toOcp)
    }

    override fun navigateToLsp(fragment: Fragment) {
        fragment.navigate(selectionNavigation.toLsp)
    }

    override fun navigateToIsp(fragment: Fragment) {
        fragment.navigate(selectionNavigation.toIsp)
    }

    override fun navigateToDip(fragment: Fragment) {
        fragment.navigate(selectionNavigation.toDip)
    }
}