package com.playlistsantri.domain.usecase

import com.playlistsantri.abstraction.UseCase
import com.playlistsantri.data.vo.Result
import com.playlistsantri.domain.entity.ArticleDetail
import com.playlistsantri.domain.repository.Repository
import javax.inject.Inject

class GetArticleDetailUseCase @Inject constructor(private val repository: Repository) :
    UseCase<Int, Result<ArticleDetail>>() {
    override suspend fun invoke(params: Int): Result<ArticleDetail> {
        return repository.getArticleDetail(params)
    }
}