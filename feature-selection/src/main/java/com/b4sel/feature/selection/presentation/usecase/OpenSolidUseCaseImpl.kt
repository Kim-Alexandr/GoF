package com.b4sel.feature.selection.presentation.usecase

import com.b4sel.feature.selection.domain.navigation.SelectionNavigation
import com.b4sel.feature.selection.domain.usecase.OpenSolidUseCase
import com.b4sel.shared.navigation.NavigationCommand
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class OpenSolidUseCaseImpl @Inject constructor() : OpenSolidUseCase, HasAndroidInjector {
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var selectionNavigation: SelectionNavigation

    override fun androidInjector(): AndroidInjector<Any> =
        androidInjector

    override fun invoke(): NavigationCommand =
        selectionNavigation.toSolid
}