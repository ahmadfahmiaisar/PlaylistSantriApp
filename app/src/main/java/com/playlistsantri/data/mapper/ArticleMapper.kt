package com.playlistsantri.data.mapper

import com.playlistsantri.abstraction.Mapper
import com.playlistsantri.data.response.ArticlesDto
import com.playlistsantri.domain.entity.Articles
import javax.inject.Inject

class ArticleMapper @Inject constructor() : Mapper<ArticlesDto, List<Articles>>() {
    override fun map(input: ArticlesDto): List<Articles> {
        return input.data?.map {
            Articles(
                it.categoryName ?: "",
                it.id ?: 0,
                it.title ?: ""
            )
        } ?: emptyList()
    }
}