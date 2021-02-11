package com.playlistsantri.data.repository

import com.playlistsantri.data.dispatcher.DispatcherProvider
import com.playlistsantri.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val dispatcher: DispatcherProvider
) : Repository {
}