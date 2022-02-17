package com.b4sel.gof.di

import android.content.Context
import com.b4sel.gof.App
import com.b4sel.gof.di.module.ApplicationModule
import com.b4sel.shared.core.scope.ApplicationScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector

@ApplicationScope
@Component(
    modules = [
        ApplicationModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance appContext: Context): AppComponent
    }
}