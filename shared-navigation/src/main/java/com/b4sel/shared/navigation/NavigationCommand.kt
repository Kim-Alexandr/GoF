package com.b4sel.shared.navigation

import android.os.Bundle
import androidx.navigation.NavOptions

data class NavigationCommand(
    val action: Int,
    var args: Bundle? = null,
    val navOptions: NavOptions? = null
)