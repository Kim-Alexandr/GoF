package com.b4sel.feature.lsp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.b4sel.feature.lsp.databinding.LspFragmentBinding

class LspFragment : Fragment(R.layout.lsp_fragment) {

    private val layout by viewBinding(LspFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(layout) {
            //todo эти данные должны быть во viewModel
            lspNameTxt.text = com.b4sel.shared.solid.SolidCatalog.lsp.name
            lspDescTxt.text = com.b4sel.shared.solid.SolidCatalog.lsp.description
            topAppBar.setNavigationOnClickListener {
                requireActivity().onBackPressed()
            }
        }
    }
}