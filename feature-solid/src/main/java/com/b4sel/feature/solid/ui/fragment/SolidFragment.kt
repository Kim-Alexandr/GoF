package com.b4sel.feature.solid.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.b4sel.feature.solid.R
import com.b4sel.feature.solid.databinding.SolidFragmentBinding
import com.b4sel.feature.solid.ui.adapter.SolidAdapter
import com.b4sel.feature.solid.ui.viewmodel.SolidViewModel
import com.b4sel.shared.navigation.navigate
import com.b4sel.shared.solid.SolidCatalog
import com.b4sel.shared.solid.domain.model.SolidItem.*
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class SolidFragment : Fragment(R.layout.solid_fragment) {

    private val layout by viewBinding(SolidFragmentBinding::bind)

    @Inject
    lateinit var viewModel: SolidViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        layout.solidListRv.adapter = SolidAdapter(SolidCatalog.solidList) { item ->
            //item click
            when (item) {
                SRP -> navigate(viewModel.openSrp())
                OCP -> navigate(viewModel.openOcp())
                LSP -> navigate(viewModel.openLsp())
                ISP -> TODO()
                DIP -> TODO()
            }
        }
    }
}