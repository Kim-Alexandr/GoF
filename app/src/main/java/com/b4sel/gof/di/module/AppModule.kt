package com.b4sel.gof.di.module

import com.b4sel.gof.di.module.feature.SelectionScreenModule
import com.b4sel.gof.di.module.feature.SolidScreenModule
import dagger.Module

@Module(
    includes = [
        SelectionScreenModule::class,
        SolidScreenModule::class
    ]
)
interface AppModule