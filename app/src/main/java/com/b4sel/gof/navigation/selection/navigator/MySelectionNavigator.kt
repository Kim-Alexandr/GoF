package com.b4sel.gof.navigation.selection.navigator

import com.b4sel.feature.selection.domain.navigation.SelectionFragmentProvider
import com.b4sel.feature.selection.domain.navigation.SelectionNavigation
import com.b4sel.shared.navigation.navigate
import javax.inject.Inject

class MySelectionNavigator @Inject constructor(
    private val selectionNavigation: SelectionNavigation
) {

    fun navigateToSolid() {
        SelectionFragmentProvider.selectionFragment?.navigate(selectionNavigation.toSolid)
    }
}