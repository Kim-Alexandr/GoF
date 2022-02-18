package com.b4sel.feature.selection.di

import androidx.lifecycle.ViewModelProvider
import com.b4sel.feature.selection.ui.fragment.SelectionFragment
import com.b4sel.feature.selection.ui.viewmodel.SelectionViewModel
import com.b4sel.feature.selection.presentation.interactor.SelectionInteractor
import com.b4sel.shared.core.scope.FragmentScope
import com.b4sel.shared.core.viewmodel.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module(includes = [SelectionUseCaseModule::class])
class SelectionFragmentModule {

	@Provides
	@FragmentScope
	fun provideViewModel(
		owner: SelectionFragment,
		selectionInteractor: SelectionInteractor
	): SelectionViewModel = ViewModelFactory {
		SelectionViewModel(selectionInteractor)
    }.let { viewModelFactory ->
		ViewModelProvider(owner, viewModelFactory)[SelectionViewModel::class.java]
	}
}