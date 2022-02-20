package com.b4sel.feature.srp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.b4sel.feature.srp.databinding.SrpFragmentBinding
import com.b4sel.shared.solid.SolidCatalog

class SrpFragment : Fragment(R.layout.srp_fragment) {

    private val layout by viewBinding(SrpFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(layout) {
            //todo эти данные должны быть во viewModel
            srpNameTxt.text = SolidCatalog.srp.name
            srpDescTxt.text = SolidCatalog.srp.description
            topAppBar.setNavigationOnClickListener {
                requireActivity().onBackPressed()
            }
        }
    }
}