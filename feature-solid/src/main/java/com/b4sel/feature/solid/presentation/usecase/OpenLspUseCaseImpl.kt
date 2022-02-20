package com.b4sel.feature.solid.presentation.usecase

import com.b4sel.feature.solid.domain.navigation.SolidNavigation
import com.b4sel.feature.solid.domain.usecase.OpenLspUseCase
import com.b4sel.shared.navigation.NavigationCommand
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class OpenLspUseCaseImpl @Inject constructor() : OpenLspUseCase, HasAndroidInjector {
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var selectionNavigation: SolidNavigation

    override fun androidInjector(): AndroidInjector<Any> =
        androidInjector

    override fun invoke(): NavigationCommand =
        selectionNavigation.toLsp
}