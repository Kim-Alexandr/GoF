package com.b4sel.feature.solid.di

import androidx.lifecycle.ViewModel
import com.b4sel.feature.solid.domain.navigation.SolidRouter
import com.b4sel.feature.solid.ui.fragment.SolidFragment
import dagger.Component
import kotlin.properties.Delegates.notNull

@Component(dependencies = [SolidDependencies::class])
interface SolidComponent {
    fun inject(solidFragment: SolidFragment)

    @Component.Builder
    interface Builder {

        fun deps(dependencies: SolidDependencies): Builder

        fun build(): SolidComponent
    }
}

interface SolidDependencies {

    val solidRouter: SolidRouter
}

interface SolidDependenciesProvider {

    val dependencies: SolidDependencies

    companion object : SolidDependenciesProvider by SolidDependenciesStore
}

object SolidDependenciesStore : SolidDependenciesProvider {
    override var dependencies: SolidDependencies by notNull()
}

class SolidComponentViewModel : ViewModel() {

    val solidComponent =
        DaggerSolidComponent.builder().deps(SolidDependenciesProvider.dependencies).build()
}