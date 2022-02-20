package com.b4sel.feature.solid.di

import androidx.lifecycle.ViewModelProvider
import com.b4sel.feature.solid.presentation.interactor.SolidInteractor
import com.b4sel.feature.solid.ui.fragment.SolidFragment
import com.b4sel.feature.solid.ui.viewmodel.SolidViewModel
import com.b4sel.shared.core.scope.FragmentScope
import com.b4sel.shared.core.viewmodel.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module(includes = [SolidUseCaseModule::class])
class SolidFragmentModule {

    @Provides
    @FragmentScope
    fun provideViewModel(
        owner: SolidFragment,
        solidInteractor: SolidInteractor
    ): SolidViewModel = ViewModelFactory {
        SolidViewModel(solidInteractor)
    }.let { viewModelFactory ->
        ViewModelProvider(owner, viewModelFactory)[SolidViewModel::class.java]
    }
}