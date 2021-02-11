package com.playlistsantri.di.module

import com.playlistsantri.data.repository.RepositoryImpl
import com.playlistsantri.domain.repository.Repository
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {
    @Binds
    fun bindRepository(repository: RepositoryImpl): Repository
}