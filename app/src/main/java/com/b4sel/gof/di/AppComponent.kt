package com.b4sel.gof.di

import android.app.Application
import android.content.Context
import com.b4sel.feature.selection.di.SelectionDependencies
import com.b4sel.feature.selection.domain.navigation.SelectionRouter
import com.b4sel.feature.solid.di.SolidDependencies
import com.b4sel.feature.solid.domain.navigation.SolidRouter
import com.b4sel.gof.App
import com.b4sel.gof.di.module.AppModule
import com.b4sel.shared.core.scope.ApplicationScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector

@ApplicationScope
@Component(modules = [AppModule::class])
interface AppComponent : SelectionDependencies, SolidDependencies, AndroidInjector<App> {

    override val selectionRouter: SelectionRouter
    override val solidRouter: SolidRouter

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}