package com.b4sel.feature.ocp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.b4sel.feature.ocp.databinding.OcpFragmentBinding
import com.b4sel.shared.solid.SolidCatalog

class OcpFragment : Fragment(R.layout.ocp_fragment) {

    companion object {
        fun newInstance(): OcpFragment =
            OcpFragment()
    }

    private val layout by viewBinding(OcpFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(layout) {
            //todo эти данные должны быть во viewModel
            ocpNameTxt.text = SolidCatalog.ocp.name
            ocpDescTxt.text = SolidCatalog.ocp.description
            topAppBar.setNavigationOnClickListener {
                requireActivity().onBackPressed()
            }
        }
    }
}