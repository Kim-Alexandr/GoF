package com.b4sel.feature.selection.navigator

import androidx.fragment.app.Fragment
import com.b4sel.feature.selection.domain.navigation.SelectionNavigation
import com.b4sel.feature.selection.domain.navigation.SelectionNavigator
import com.b4sel.feature.selection.domain.navigation.SelectionRouter
import com.b4sel.shared.navigation.navigate
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MySelectionNavigator @Inject constructor() : HasAndroidInjector, SelectionNavigator {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var selectionNavigation: SelectionNavigation

    override fun navigateToSolid(fragment: Fragment) {
        fragment.navigate(selectionNavigation.toSolid)
    }

    override fun androidInjector(): AndroidInjector<Any> =
        androidInjector

}