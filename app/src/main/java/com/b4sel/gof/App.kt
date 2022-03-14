package com.b4sel.gof

import android.app.Application
import com.b4sel.feature.selection.di.SelectionDependenciesStore
import com.b4sel.gof.di.AppComponent
import com.b4sel.gof.di.DaggerAppComponent

class App : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .application(this)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        SelectionDependenciesStore.dependencies = appComponent
    }
}