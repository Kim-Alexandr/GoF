package com.b4sel.feature.solid.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.b4sel.feature.solid.presentation.interactor.SolidInteractor
import javax.inject.Inject

class SolidViewModel @Inject constructor(
    private val solidInteractor: SolidInteractor
) : ViewModel() {

    fun openSrp() = solidInteractor.openSrpUseCase()
    fun openOcp() = solidInteractor.openOcpUseCase()
}