package com.b4sel.gof.di.module

import com.b4sel.feature.selection.SelectionFragment
import com.b4sel.feature.selection.di.SelectionFragmentModule
import com.b4sel.shared.core.scope.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface AppActivityModule {

    @FragmentScope
    @ContributesAndroidInjector(
        modules = [
            SelectionFragmentModule::class
        ]
    )
    fun selectionFragmentInjector(): SelectionFragment

}