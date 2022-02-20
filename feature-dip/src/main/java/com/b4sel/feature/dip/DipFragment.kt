package com.b4sel.feature.dip

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.b4sel.feature.dip.databinding.DipFragmentBinding
import com.b4sel.shared.solid.SolidCatalog

class DipFragment : Fragment(R.layout.dip_fragment) {

    private val layout by viewBinding(DipFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(layout) {
            //todo эти данные должны быть во viewModel
            dipNameTxt.text = SolidCatalog.dip.name
            dipDescTxt.text = SolidCatalog.dip.description
            topAppBar.setNavigationOnClickListener {
                requireActivity().onBackPressed()
            }
        }
    }

}