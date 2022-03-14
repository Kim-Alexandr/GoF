package com.b4sel.feature.selection.di

import androidx.lifecycle.ViewModel
import com.b4sel.feature.selection.domain.navigation.SelectionRouter
import com.b4sel.feature.selection.ui.fragment.SelectionFragment
import dagger.Component
import kotlin.properties.Delegates

@Component(dependencies = [
    SelectionDependencies::class
])
interface SelectionComponent {

    fun inject(selectionFragment: SelectionFragment)

    @Component.Builder
    interface Builder {

        fun deps(dependencies: SelectionDependencies): Builder

        fun build(): SelectionComponent
    }
}

interface SelectionDependencies {
    val router: SelectionRouter
}

interface SelectionDependenciesProvider {

    val dependencies: SelectionDependencies

    companion object : SelectionDependenciesProvider by SelectionDependenciesStore
}

object SelectionDependenciesStore : SelectionDependenciesProvider {
    override var dependencies: SelectionDependencies by Delegates.notNull()
}

class SelectionComponentViewModel : ViewModel() {
    val selectionComponent =
        DaggerSelectionComponent.builder().deps(SelectionDependenciesProvider.dependencies).build()
}