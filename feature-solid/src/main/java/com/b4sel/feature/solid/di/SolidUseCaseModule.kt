package com.b4sel.feature.solid.di

import com.b4sel.feature.solid.domain.usecase.*
import com.b4sel.feature.solid.presentation.usecase.*
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
    @Binds
    @FragmentScope
    fun bindOpenDipUseCase(openDipUseCase: OpenDipUseCaseImpl): OpenDipUseCase
}