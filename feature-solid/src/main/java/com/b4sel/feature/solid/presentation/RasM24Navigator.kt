package com.b4sel.feature.solid.presentation

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.b4sel.feature.dip.DipFragment
import com.b4sel.feature.isp.IspFragment
import com.b4sel.feature.lsp.LspFragment
import com.b4sel.feature.ocp.OcpFragment
import com.b4sel.feature.solid.domain.navigation.SolidNavigator
import com.b4sel.feature.srp.SrpFragment
import javax.inject.Inject

class RasM24Navigator @Inject constructor(
    @IdRes private val hostId: Int
) : SolidNavigator {

    override fun navigateToSrp(fragment: Fragment) {
        fragment.parentFragmentManager.forwardTo(SrpFragment.newInstance(), hostId)
    }

    override fun navigateToOcp(fragment: Fragment) {
        fragment.parentFragmentManager.forwardTo(OcpFragment.newInstance(), hostId)
    }

    override fun navigateToLsp(fragment: Fragment) {
        fragment.parentFragmentManager.forwardTo(LspFragment.newInstance(), hostId)
    }

    override fun navigateToIsp(fragment: Fragment) {
        fragment.parentFragmentManager.forwardTo(IspFragment.newInstance(), hostId)
    }

    override fun navigateToDip(fragment: Fragment) {
        fragment.parentFragmentManager.forwardTo(DipFragment.newInstance(), hostId)
    }

}

private val Fragment.key: String? get() = this::class.simpleName

fun FragmentManager.forwardTo(fragment: Fragment, @IdRes container: Int) {
    findFragmentById(container)?.onHiddenChanged(true)
    beginTransaction().run {
        replace(container, fragment)
        addToBackStack(fragment.key)
        commitAllowingStateLoss()
    }
}
