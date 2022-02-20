package com.b4sel.feature.solid.presentation.interactor

import com.b4sel.feature.solid.domain.usecase.*
import javax.inject.Inject

data class SolidInteractor @Inject constructor(
    val openSrpUseCase: OpenSrpUseCase,
    val openOcpUseCase: OpenOcpUseCase,
    val openLspUseCase: OpenLspUseCase,
    val openIspUseCase: OpenIspUseCase,
    val openDipUseCase: OpenDipUseCase
)