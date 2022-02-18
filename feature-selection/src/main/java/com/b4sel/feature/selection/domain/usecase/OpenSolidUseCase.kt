package com.b4sel.feature.selection.domain.usecase

import com.b4sel.shared.navigation.NavigationCommand

interface OpenSolidUseCase {
    operator fun invoke(): NavigationCommand
}