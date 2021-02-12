package com.playlistsantri.data.response

import com.squareup.moshi.Json

data class ArticleDetailDto(
    @field:Json(name = "content")
    val content: String?,
    @field:Json(name = "id")
    val id: Int?,
    @field:Json(name = "id_category")
    val idCategory: Int?,
    @field:Json(name = "title")
    val title: String?
)