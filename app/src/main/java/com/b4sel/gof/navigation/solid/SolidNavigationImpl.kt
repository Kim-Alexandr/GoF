package com.b4sel.gof.navigation.solid

import com.b4sel.feature.solid.domain.navigation.SolidNavigation
import com.b4sel.gof.R
import com.b4sel.shared.navigation.NavigationCommand
import javax.inject.Inject

class SolidNavigationImpl @Inject constructor(): SolidNavigation {
    override val toSrp =
        NavigationCommand(R.id.action_solidFragment_to_srpFragment)
    override val toOcp: NavigationCommand
        get() = TODO("Not yet implemented")
    override val toLsp: NavigationCommand
        get() = TODO("Not yet implemented")
    override val toIsp: NavigationCommand
        get() = TODO("Not yet implemented")
    override val toDip: NavigationCommand
        get() = TODO("Not yet implemented")
}