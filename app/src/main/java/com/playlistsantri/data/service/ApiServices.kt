package com.playlistsantri.data.service

import com.playlistsantri.data.response.ArticleDetailDto
import com.playlistsantri.data.response.ArticlesDto
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface ApiServices {

    @Headers("mock:true")
    @GET("api/articles")
    suspend fun getArticles(): ArticlesDto

    @Headers("mock:true")
//    @GET("api/articles/detail/{idArticles}")
    @GET("api/articles/detail")
    suspend fun getArticleDetail(@Path("articleId") articleId: Int): ArticleDetailDto
}