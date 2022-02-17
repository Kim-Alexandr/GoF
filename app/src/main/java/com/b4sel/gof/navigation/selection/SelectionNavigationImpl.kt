package com.b4sel.gof.navigation.selection

import com.b4sel.feature.selection.navigation.SelectionNavigation
import com.b4sel.gof.R
import com.b4sel.shared.navigation.NavigationCommand
import javax.inject.Inject

class SelectionNavigationImpl @Inject constructor(): SelectionNavigation {
    override val toGoF = NavigationCommand(R.id.action_selectionFragment_to_patternsFragment)
    override val toSOLID = NavigationCommand(R.id.action_selectionFragment_to_solidFragment)
}