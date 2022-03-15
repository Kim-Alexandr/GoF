package com.b4sel.gof.navigation.selection.navigator

import com.b4sel.feature.selection.SelectionFragmentHolder
import com.b4sel.feature.selection.domain.navigation.SelectionNavigation
import com.b4sel.shared.navigation.navigate
import javax.inject.Inject

class MySelectionNavigator @Inject constructor(
    private val selectionNavigation: SelectionNavigation
) {

    fun navigateToSolid() {
        SelectionFragmentHolder.selectionFragment?.get()?.navigate(selectionNavigation.toSolid)
    }
}