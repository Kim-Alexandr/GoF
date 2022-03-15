package com.b4sel.gof.navigation.solid.navigator

import androidx.annotation.IdRes
import com.b4sel.feature.dip.DipFragment
import com.b4sel.feature.isp.IspFragment
import com.b4sel.feature.lsp.LspFragment
import com.b4sel.feature.ocp.OcpFragment
import com.b4sel.feature.srp.SrpFragment
import com.b4sel.gof.ActivityHolder
import com.b4sel.shared.navigation.forwardTo
import javax.inject.Inject

class RasM24SolidNavigator @Inject constructor(
    @IdRes private val hostId: Int
) {

    fun navigateToSrp() {
        ActivityHolder.activity?.get()?.supportFragmentManager?.forwardTo(SrpFragment.newInstance(), hostId)
    }

    fun navigateToOcp() {
        ActivityHolder.activity?.get()?.supportFragmentManager?.forwardTo(OcpFragment.newInstance(), hostId)
    }

    fun navigateToLsp() {
        ActivityHolder.activity?.get()?.supportFragmentManager?.forwardTo(LspFragment.newInstance(), hostId)
    }

    fun navigateToIsp() {
        ActivityHolder.activity?.get()?.supportFragmentManager?.forwardTo(IspFragment.newInstance(), hostId)
    }

    fun navigateToDip() {
        ActivityHolder.activity?.get()?.supportFragmentManager?.forwardTo(DipFragment.newInstance(), hostId)
    }

}