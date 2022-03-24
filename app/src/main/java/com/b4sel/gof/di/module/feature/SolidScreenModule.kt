package com.b4sel.gof.di.module.feature

import com.b4sel.gof.navigation.solid.RasM24SolidNavigatorProvider
import com.b4sel.gof.navigation.solid.SolidNavigationModule
import dagger.Module

@Module(includes = [
    SolidNavigationModule::class,
    RasM24SolidNavigatorProvider::class
])
interface SolidScreenModule