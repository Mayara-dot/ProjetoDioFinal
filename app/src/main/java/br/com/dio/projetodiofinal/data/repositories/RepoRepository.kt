package br.com.dio.projetodiofinal.data.repositories

import br.com.dio.projetodiofinal.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
   suspend fun listRepositories(user: String): Flow<List<Repo>>
}