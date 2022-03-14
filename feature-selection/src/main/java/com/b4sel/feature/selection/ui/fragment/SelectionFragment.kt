package com.b4sel.feature.selection.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.b4sel.feature.selection.R
import com.b4sel.feature.selection.ui.viewmodel.SelectionViewModel
import com.b4sel.feature.selection.databinding.SelectionFragmentBinding
import com.b4sel.shared.navigation.navigate
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class SelectionFragment : Fragment(R.layout.selection_fragment) {

    private val layout by viewBinding(SelectionFragmentBinding::bind)

    @Inject
    lateinit var viewModel: SelectionViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(layout) {
            openSolidBtn.setOnClickListener {
                navigate(viewModel.openSolid())
            }
            openPrincipalBtn.setOnClickListener {
                // will be later
            }
        }
    }
}