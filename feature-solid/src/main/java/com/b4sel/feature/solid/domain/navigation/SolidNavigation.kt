package com.b4sel.feature.solid.domain.navigation

import com.b4sel.shared.navigation.NavigationCommand

interface SolidNavigation {
    val toSrp: NavigationCommand
    val toOcp: NavigationCommand
    val toLsp: NavigationCommand
    val toIsp: NavigationCommand
    val toDip: NavigationCommand
}