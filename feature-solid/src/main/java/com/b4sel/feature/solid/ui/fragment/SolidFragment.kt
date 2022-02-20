package com.b4sel.feature.solid.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.b4sel.feature.solid.R
import com.b4sel.feature.solid.databinding.SolidFragmentBinding
import com.b4sel.feature.solid.ui.adapter.SolidAdapter
import com.b4sel.shared.solid.SolidCatalog
import com.b4sel.shared.solid.domain.model.SolidItem.*

class SolidFragment : Fragment(R.layout.solid_fragment) {

    private val layout by viewBinding(SolidFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        layout.solidListRv.adapter = SolidAdapter(SolidCatalog.solidList) { item ->
            //item click
            when (item) {
                SRP -> TODO()
                OCP -> TODO()
                LSP -> TODO()
                ISP -> TODO()
                DIP -> TODO()
            }
        }
    }
}