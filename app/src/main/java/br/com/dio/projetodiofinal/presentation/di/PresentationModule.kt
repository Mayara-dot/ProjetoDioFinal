package br.com.dio.projetodiofinal.presentation.di

import br.com.dio.projetodiofinal.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object PresentationModule {

    fun load() {
        loadKoinModules(viewPresentationModule())
    }

    private fun viewPresentationModule(): Module{
        return module {
            viewModel { MainViewModel(get()) }
        }
    }

}