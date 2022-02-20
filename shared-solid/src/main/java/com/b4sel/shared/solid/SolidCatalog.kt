package com.b4sel.shared.solid

import com.b4sel.shared.solid.domain.model.SolidItem.SRP
import com.b4sel.shared.solid.domain.model.SolidItem.OCP
import com.b4sel.shared.solid.domain.model.SolidItem.LSP
import com.b4sel.shared.solid.domain.model.SolidItem.ISP
import com.b4sel.shared.solid.domain.model.SolidItem.DIP

object SolidCatalog {
    val solidList = listOf(SRP, OCP, LSP, ISP, DIP)
}