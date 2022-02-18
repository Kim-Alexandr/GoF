package com.b4sel.feature.patterns

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import by.kirich1409.viewbindingdelegate.viewBinding
import com.b4sel.feature.patterns.databinding.PatternsFragmentBinding

class PatternsFragment : Fragment(R.layout.patterns_fragment) {

    private val layout by viewBinding(PatternsFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(requireActivity(), R.id.patterns_host)
        NavigationUI.setupWithNavController(layout.bottomNavigationView, navController)
    }
}