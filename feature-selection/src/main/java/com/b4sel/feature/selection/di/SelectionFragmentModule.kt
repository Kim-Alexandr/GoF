package com.b4sel.feature.selection.di

import androidx.lifecycle.ViewModelProvider
import com.b4sel.feature.selection.SelectionFragment
import com.b4sel.feature.selection.SelectionViewModel
import com.b4sel.shared.core.scope.FragmentScope
import com.b4sel.shared.core.viewmodel.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class SelectionFragmentModule {

	@Provides
	@FragmentScope
	fun provideViewModel(
		owner: SelectionFragment,
	): SelectionViewModel = ViewModelFactory {
		SelectionViewModel()
    }.let { viewModelFactory ->
		ViewModelProvider(owner, viewModelFactory)[SelectionViewModel::class.java]
	}
}