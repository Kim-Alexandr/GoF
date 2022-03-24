package com.b4sel.gof.navigation.solid

import com.b4sel.feature.solid.domain.navigation.SolidNavigation
import com.b4sel.feature.solid.domain.navigation.SolidRouter
import com.b4sel.gof.navigation.solid.navigator.RasM24SolidNavigator
import com.b4sel.gof.R
import com.b4sel.gof.navigation.solid.navigator.MySolidNavigator
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface SolidNavigationModule {
    @Binds
    fun bindSolidNavigation(solidNavigationImpl: SolidNavigationImpl): SolidNavigation

    @Binds
    fun bindSolidRouter(solidRouterImpl: SolidRouterImpl): SolidRouter
}

@Module
class RasM24SolidNavigatorProvider {
    @Provides
    fun provideRasM24SolidNavigator(): RasM24SolidNavigator {
        return RasM24SolidNavigator(R.id.fragment_host)
    }
}