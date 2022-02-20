package com.b4sel.gof.navigation.solid

import com.b4sel.feature.solid.domain.navigation.SolidNavigation
import dagger.Binds
import dagger.Module

@Module
interface SolidNavigationModule {
    @Binds
    fun bindSolidNavigation(solidNavigationImpl: SolidNavigationImpl): SolidNavigation
}