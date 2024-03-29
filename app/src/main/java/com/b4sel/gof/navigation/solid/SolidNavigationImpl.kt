package com.b4sel.gof.navigation.solid

import com.b4sel.feature.solid.domain.navigation.SolidNavigation
import com.b4sel.gof.R
import com.b4sel.shared.navigation.NavigationCommand
import javax.inject.Inject

class SolidNavigationImpl @Inject constructor(): SolidNavigation {
    override val toSrp = NavigationCommand(R.id.action_solidFragment_to_srpFragment)
    override val toOcp = NavigationCommand(R.id.action_solidFragment_to_ocpFragment )
    override val toLsp = NavigationCommand(R.id.action_solidFragment_to_lspFragment)
    override val toIsp = NavigationCommand(R.id.action_solidFragment_to_ispFragment)
    override val toDip = NavigationCommand(R.id.action_solidFragment_to_dipFragment)
}