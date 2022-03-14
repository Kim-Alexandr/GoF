package com.b4sel.feature.selection.presentation.interactor

import com.b4sel.feature.selection.domain.usecase.OpenSolidUseCase
import javax.inject.Inject

data class SelectionInteractor @Inject constructor(
    val openSolidUseCase: OpenSolidUseCase,
)