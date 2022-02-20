package com.b4sel.feature.solid.di

import com.b4sel.feature.solid.domain.usecase.OpenIspUseCase
import com.b4sel.feature.solid.domain.usecase.OpenLspUseCase
import com.b4sel.feature.solid.domain.usecase.OpenOcpUseCase
import com.b4sel.feature.solid.domain.usecase.OpenSrpUseCase
import com.b4sel.feature.solid.presentation.usecase.OpenIspUseCaseImpl
import com.b4sel.feature.solid.presentation.usecase.OpenLspUseCaseImpl
import com.b4sel.feature.solid.presentation.usecase.OpenOcpUseCaseImpl
import com.b4sel.feature.solid.presentation.usecase.OpenSrpUseCaseImpl
import com.b4sel.shared.core.scope.FragmentScope
import dagger.Binds
import dagger.Module

@Module
interface SolidUseCaseModule {

    @Binds
    @FragmentScope
    fun bindOpenSrpUseCase(openSrpUseCase: OpenSrpUseCaseImpl): OpenSrpUseCase
    @Binds
    @FragmentScope
    fun bindOpenOcpUseCase(openOcpUseCase: OpenOcpUseCaseImpl): OpenOcpUseCase
    @Binds
    @FragmentScope
    fun bindOpenLspUseCase(openLspUseCase: OpenLspUseCaseImpl): OpenLspUseCase
    @Binds
    @FragmentScope
    fun bindOpenIspUseCase(openIspUseCase: OpenIspUseCaseImpl): OpenIspUseCase
}