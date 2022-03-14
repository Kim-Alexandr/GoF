package com.b4sel.feature.selection.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.b4sel.feature.selection.presentation.interactor.SelectionInteractor
import javax.inject.Inject

class SelectionViewModel @Inject constructor(
    private val selectionInteractor: SelectionInteractor
) : ViewModel() {

    fun openSolid() =
        selectionInteractor.openSolidUseCase()
}