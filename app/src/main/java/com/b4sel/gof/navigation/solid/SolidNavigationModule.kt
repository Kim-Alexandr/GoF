package com.b4sel.gof.navigation.solid

import com.b4sel.feature.solid.domain.navigation.SolidNavigation
import com.b4sel.feature.solid.domain.navigation.SolidNavigator
import com.b4sel.feature.solid.domain.navigation.SolidRouter
import com.b4sel.feature.solid.navigator.MyNavigator
import com.b4sel.feature.solid.navigator.RasM24Navigator
import com.b4sel.gof.R
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface SolidNavigationModule {
    @Binds
    fun bindSolidNavigation(solidNavigationImpl: SolidNavigationImpl): SolidNavigation

    @Binds
    fun bindSolidRouter(solidRouterImpl: SolidRouterImpl): SolidRouter

    @Binds
    fun bindSolidNavigator(myNavigator: MyNavigator): SolidNavigator

//    @Binds
//    fun bindSolidNavigator(rasM24Navigator: RasM24Navigator): SolidNavigator
}

@Module
class RasM24NavigatorProvider {
    @Provides
    fun provideRasM24Navigator(): RasM24Navigator {
        return RasM24Navigator(R.id.fragment_host)
    }
}