package com.playlistsantri.di.module

import com.playlistsantri.data.dispatcher.CoroutineDispatcherProvider
import com.playlistsantri.data.dispatcher.DispatcherProvider
import dagger.Binds
import dagger.Module

@Module
interface CoroutineDispatcherModule {
    @Binds
    fun bindDispatcher(dispatcherModule: CoroutineDispatcherProvider): DispatcherProvider
}