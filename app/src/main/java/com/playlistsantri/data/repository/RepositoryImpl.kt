package com.playlistsantri.data.repository

import com.playlistsantri.data.dispatcher.DispatcherProvider
import com.playlistsantri.data.mapper.ArticleMapper
import com.playlistsantri.data.source.ArticleRemoteDataSource
import com.playlistsantri.data.vo.Result
import com.playlistsantri.domain.entity.ArticleDetail
import com.playlistsantri.domain.entity.Articles
import com.playlistsantri.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val dispatcher: DispatcherProvider,
    private val articleRemoteDataSource: ArticleRemoteDataSource,
    private val articleMapper: ArticleMapper,
) : Repository {
    override suspend fun getArticles(): Result<List<Articles>> {
        val apiResult = articleRemoteDataSource.getArticles(dispatcher.io)
        return when (apiResult) {
            is Result.Success -> Result.Success(articleMapper.map(apiResult.data))
            is Result.Error -> Result.Error(apiResult.cause, apiResult.code, apiResult.errorMessage)
            else -> Result.Error()
        }
    }

    override suspend fun getArticleDetail(articleId: Int): Result<ArticleDetail> {
    }

}