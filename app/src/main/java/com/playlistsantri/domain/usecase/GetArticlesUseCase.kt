package com.playlistsantri.domain.usecase

import com.playlistsantri.abstraction.UseCase
import com.playlistsantri.data.vo.Result
import com.playlistsantri.domain.entity.Articles
import com.playlistsantri.domain.repository.Repository
import javax.inject.Inject

class GetArticlesUseCase @Inject constructor(private val repository: Repository) :
    UseCase<UseCase.None, Result<List<Articles>>>() {
    override suspend fun invoke(params: None): Result<List<Articles>> {
        return repository.getArticles()
    }
}