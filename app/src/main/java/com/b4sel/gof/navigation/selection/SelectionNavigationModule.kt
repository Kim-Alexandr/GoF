package com.b4sel.gof.navigation.selection

import com.b4sel.feature.selection.domain.navigation.SelectionNavigation
import com.b4sel.feature.selection.domain.navigation.SelectionRouter
import com.b4sel.gof.navigation.selection.navigator.RasM24SelectionNavigator
import com.b4sel.gof.R
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface SelectionNavigationModule {
    @Binds
    fun bindsSelectionNavigation(selectionNavigationImpl: SelectionNavigationImpl): SelectionNavigation

    @Binds
    fun bindsSelectionRouter(selectionRouter: SelectionRouterImpl): SelectionRouter
}

@Module
class RasM24SelectionNavigatorProvider {
    @Provides
    fun provideRasM24SelectionNavigator(): RasM24SelectionNavigator {
        return RasM24SelectionNavigator(R.id.fragment_host)
    }
}