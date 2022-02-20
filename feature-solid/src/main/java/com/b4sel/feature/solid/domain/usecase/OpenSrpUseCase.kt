package com.b4sel.feature.solid.domain.usecase

import com.b4sel.shared.navigation.NavigationCommand

interface OpenSrpUseCase {
    operator fun invoke(): NavigationCommand
}