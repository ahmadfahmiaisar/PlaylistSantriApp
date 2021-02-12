package com.playlistsantri.domain.repository

import com.playlistsantri.data.vo.Result
import com.playlistsantri.domain.entity.ArticleDetail
import com.playlistsantri.domain.entity.Articles

interface Repository {
    suspend fun getArticles(): Result<List<Articles>>
    suspend fun getArticleDetail(articleId: Int): Result<ArticleDetail>
}