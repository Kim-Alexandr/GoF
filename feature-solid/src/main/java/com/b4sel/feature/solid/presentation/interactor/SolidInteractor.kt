package com.b4sel.feature.solid.presentation.interactor

import com.b4sel.feature.solid.domain.usecase.OpenOcpUseCase
import com.b4sel.feature.solid.domain.usecase.OpenSrpUseCase
import javax.inject.Inject

data class SolidInteractor @Inject constructor(
    val openSrpUseCase: OpenSrpUseCase,
    val openOcpUseCase: OpenOcpUseCase
)