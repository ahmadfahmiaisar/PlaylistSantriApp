package com.playlistsantri.data.mapper

import com.playlistsantri.abstraction.Mapper
import com.playlistsantri.data.response.ArticleDetailDto
import com.playlistsantri.domain.entity.ArticleDetail
import javax.inject.Inject

class ArticleDetailMapper @Inject constructor() : Mapper<ArticleDetailDto, ArticleDetail>() {
    override fun map(input: ArticleDetailDto): ArticleDetail {
        return ArticleDetail(
            input.content ?: "",
            input.id ?: 0,
            input.idCategory ?: 0,
            input.title ?: "",
        )
    }
}