package com.b4sel.feature.isp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.b4sel.feature.isp.databinding.IspFragmentBinding
import com.b4sel.shared.solid.SolidCatalog

class IspFragment : Fragment(R.layout.isp_fragment) {

    private val layout by viewBinding(IspFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(layout) {
            //todo эти данные должны быть во viewModel
            ispNameTxt.text = SolidCatalog.isp.name
            ispDescTxt.text = SolidCatalog.isp.description
            topAppBar.setNavigationOnClickListener {
                requireActivity().onBackPressed()
            }
        }
    }

}