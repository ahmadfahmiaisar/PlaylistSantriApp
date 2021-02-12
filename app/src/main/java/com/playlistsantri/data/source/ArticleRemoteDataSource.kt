package com.playlistsantri.data.source

import com.playlistsantri.data.response.ArticleDetailDto
import com.playlistsantri.data.response.ArticlesDto
import com.playlistsantri.data.service.ApiServices
import com.playlistsantri.data.vo.Result
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class ArticleRemoteDataSource @Inject constructor(private val services: ApiServices) :
    RemoteDataSource() {

    suspend fun getArticles(dispatcher: CoroutineDispatcher): Result<ArticlesDto> {
        return safeApiCall(dispatcher) { services.getArticles() }
    }

    suspend fun getArticleDetail(
        dispatcher: CoroutineDispatcher,
        articleId: Int
    ): Result<ArticleDetailDto> {
        return safeApiCall(dispatcher) { services.getArticleDetail(articleId) }
    }
}