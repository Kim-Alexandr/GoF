package com.b4sel.gof.navigation.selection

import com.b4sel.feature.selection.domain.navigation.SelectionNavigation
import com.b4sel.feature.selection.domain.navigation.SelectionNavigator
import com.b4sel.feature.selection.domain.navigation.SelectionRouter
import com.b4sel.gof.navigation.selection.navigator.RasM24SelectionNavigator
import com.b4sel.gof.R
import com.b4sel.gof.navigation.selection.navigator.MySelectionNavigator
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface SelectionNavigationModule {
    @Binds
    fun bindsSelectionNavigation(selectionNavigationImpl: SelectionNavigationImpl): SelectionNavigation

    @Binds
    fun bindsSelectionRouter(selectionRouter: SelectionRouterImpl): SelectionRouter

    @Binds
    fun bindSelectionNavigator(selectionNavigator: MySelectionNavigator): SelectionNavigator

//    @Binds
//    fun bindSelectionNavigator(rasM24SelectionNavigator: RasM24SelectionNavigator): SelectionNavigator
}

@Module
class RasM24SelectionNavigatorProvider {
    @Provides
    fun provideRasM24SelectionNavigator(): RasM24SelectionNavigator {
        return RasM24SelectionNavigator(R.id.fragment_host)
    }
}