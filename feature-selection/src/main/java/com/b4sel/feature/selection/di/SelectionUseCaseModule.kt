package com.b4sel.feature.selection.di

import com.b4sel.feature.selection.domain.usecase.OpenPrincipalUseCase
import com.b4sel.feature.selection.domain.usecase.OpenSolidUseCase
import com.b4sel.feature.selection.presentation.usecase.OpenPrincipalUseCaseImpl
import com.b4sel.feature.selection.presentation.usecase.OpenSolidUseCaseImpl
import com.b4sel.shared.core.scope.FragmentScope
import dagger.Binds
import dagger.Module

@Module
interface SelectionUseCaseModule {

	@Binds
	@FragmentScope
	fun bindOpenSolidUseCase(openSolidUseCase: OpenSolidUseCaseImpl): OpenSolidUseCase

	@Binds
	@FragmentScope
	fun bindOpenPrincipalUseCase(openPrincipalUseCase: OpenPrincipalUseCaseImpl): OpenPrincipalUseCase
}