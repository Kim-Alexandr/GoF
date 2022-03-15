package com.b4sel.gof.navigation.selection.navigator

import androidx.fragment.app.Fragment
import com.b4sel.feature.selection.domain.navigation.SelectionNavigation
import com.b4sel.shared.navigation.navigate
import javax.inject.Inject

class MySelectionNavigator @Inject constructor(
    private val selectionNavigation: SelectionNavigation
) {

    fun navigateToSolid(fragment: Fragment) {
        fragment.navigate(selectionNavigation.toSolid)
    }
}