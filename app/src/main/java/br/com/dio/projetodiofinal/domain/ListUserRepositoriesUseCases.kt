package br.com.dio.projetodiofinal.domain

import br.com.dio.projetodiofinal.core.UseCase
import br.com.dio.projetodiofinal.data.model.Repo
import br.com.dio.projetodiofinal.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCases(
    private val repository: RepoRepository,
): UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}