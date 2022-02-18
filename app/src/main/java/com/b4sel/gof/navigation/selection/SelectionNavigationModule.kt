package com.b4sel.gof.navigation.selection

import com.b4sel.feature.selection.domain.navigation.SelectionNavigation
import dagger.Binds
import dagger.Module

@Module
interface SelectionNavigationModule {
    @Binds
    fun bindsSelectionNavigation(selectionNavigationImpl: SelectionNavigationImpl): SelectionNavigation
}