package com.b4sel.feature.selection.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import by.kirich1409.viewbindingdelegate.viewBinding
import com.b4sel.feature.selection.R
import com.b4sel.feature.selection.databinding.SelectionFragmentBinding
import com.b4sel.feature.selection.di.SelectionComponentViewModel
import com.b4sel.feature.selection.SelectionFragmentHolder
import com.b4sel.feature.selection.domain.navigation.SelectionRouter
import java.lang.ref.WeakReference
import javax.inject.Inject

class SelectionFragment : Fragment(R.layout.selection_fragment) {

    companion object {
        fun newInstance(): SelectionFragment =
            SelectionFragment()
    }

    private val layout by viewBinding(SelectionFragmentBinding::bind)

    @Inject
    lateinit var router: SelectionRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SelectionFragmentHolder.selectionFragment = WeakReference(this)
        ViewModelProvider(this).get<SelectionComponentViewModel>()
            .selectionComponent.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(layout) {
            openSolidBtn.setOnClickListener {
                router.openSolid()
            }
            openPrincipalBtn.setOnClickListener {
                // will be later
            }
        }
    }
}