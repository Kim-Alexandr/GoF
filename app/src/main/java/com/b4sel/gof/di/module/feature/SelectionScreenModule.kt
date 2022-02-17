package com.b4sel.gof.di.module.feature

import com.b4sel.gof.navigation.selection.SelectionNavigationModule
import dagger.Module

@Module(includes = [SelectionNavigationModule::class])
interface SelectionScreenModule