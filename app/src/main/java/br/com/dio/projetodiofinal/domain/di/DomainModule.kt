package br.com.dio.projetodiofinal.domain.di

import br.com.dio.projetodiofinal.domain.ListUserRepositoriesUseCases
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory {
                ListUserRepositoriesUseCases(get())
            }
        }
    }
}