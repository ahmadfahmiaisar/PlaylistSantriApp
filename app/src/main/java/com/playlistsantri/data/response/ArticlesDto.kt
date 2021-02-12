package com.playlistsantri.data.response

import com.squareup.moshi.Json

data class ArticlesDto(
    @field:Json(name = "data")
    val `data`: List<Data>?
) {
    data class Data(
        @field:Json(name = "category_name")
        val categoryName: String?,
        @field:Json(name = "id")
        val id: Int?,
        @field:Json(name = "title")
        val title: String?
    )
}