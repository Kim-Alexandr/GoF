package com.b4sel.gof.navigation.solid.navigator

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import com.b4sel.feature.dip.DipFragment
import com.b4sel.feature.isp.IspFragment
import com.b4sel.feature.lsp.LspFragment
import com.b4sel.feature.ocp.OcpFragment
import com.b4sel.feature.srp.SrpFragment
import com.b4sel.gof.SingletonActivity
import com.b4sel.shared.navigation.forwardTo
import javax.inject.Inject

class RasM24SolidNavigator @Inject constructor(
    @IdRes private val hostId: Int
) {

    fun navigateToSrp() {
        SingletonActivity.activity?.supportFragmentManager?.forwardTo(SrpFragment.newInstance(), hostId)
    }

    fun navigateToOcp() {
        SingletonActivity.activity?.supportFragmentManager?.forwardTo(OcpFragment.newInstance(), hostId)
    }

    fun navigateToLsp() {
        SingletonActivity.activity?.supportFragmentManager?.forwardTo(LspFragment.newInstance(), hostId)
    }

    fun navigateToIsp() {
        SingletonActivity.activity?.supportFragmentManager?.forwardTo(IspFragment.newInstance(), hostId)
    }

    fun navigateToDip() {
        SingletonActivity.activity?.supportFragmentManager?.forwardTo(DipFragment.newInstance(), hostId)
    }

}