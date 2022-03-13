package com.b4sel.gof.navigation.solid

import com.b4sel.feature.solid.domain.navigation.SolidNavigation
import com.b4sel.feature.solid.domain.navigation.SolidNavigator
import com.b4sel.feature.solid.domain.navigation.SolidRouter
import com.b4sel.feature.solid.presentation.MyNavigator
import dagger.Binds
import dagger.Module

@Module
interface SolidNavigationModule {
    @Binds
    fun bindSolidNavigation(solidNavigationImpl: SolidNavigationImpl): SolidNavigation

    @Binds
    fun bindSolidRouter(solidRouterImpl: SolidRouterImpl): SolidRouter

    @Binds
    fun bindSolidNavigator(myNavigator: MyNavigator): SolidNavigator
}