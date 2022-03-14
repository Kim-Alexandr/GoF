package com.b4sel.gof.navigation.selection

import com.b4sel.feature.selection.domain.navigation.SelectionNavigation
import com.b4sel.feature.selection.domain.navigation.SelectionRouter
import com.b4sel.feature.selection.navigator.MySelectionRouter
import dagger.Binds
import dagger.Module

@Module
interface SelectionNavigationModule {
    @Binds
    fun bindsSelectionNavigation(selectionNavigationImpl: SelectionNavigationImpl): SelectionNavigation

    @Binds
    fun bindsSelectionRouter(mySelectionRouter: MySelectionRouter): SelectionRouter
}