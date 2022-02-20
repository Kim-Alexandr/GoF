package com.b4sel.gof.di.module

import com.b4sel.gof.ui.MainActivity
import com.b4sel.gof.di.module.feature.SelectionScreenModule
import com.b4sel.gof.di.module.feature.SolidScreenModule
import com.b4sel.shared.core.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Module(
    includes = [
        AndroidSupportInjectionModule::class,
        SelectionScreenModule::class,
        SolidScreenModule::class
    ]
)
interface ApplicationModule {

    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            AppActivityModule::class
        ]
    )
    fun appActivityInjector(): MainActivity
}