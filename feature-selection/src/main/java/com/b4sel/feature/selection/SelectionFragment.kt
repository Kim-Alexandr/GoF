package com.b4sel.feature.selection

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.b4sel.feature.selection.databinding.SelectionFragmentBinding
import com.b4sel.feature.selection.navigation.SelectionNavigation
import com.b4sel.shared.navigation.navigate
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class SelectionFragment : Fragment(R.layout.selection_fragment), HasAndroidInjector {
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var solidNavigation: SelectionNavigation

    private val layout by viewBinding(SelectionFragmentBinding::bind)
    private val viewModel: SelectionViewModel by viewModels()

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        layout.openSolidBtn.setOnClickListener {
            navigate(solidNavigation.toSOLID)
        }
    }

    override fun androidInjector(): AndroidInjector<Any> =
        androidInjector

}