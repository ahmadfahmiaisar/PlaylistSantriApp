package com.playlistsantri.di.module

import android.app.Application
import android.content.Context
import com.playlistsantri.PlaylistSantriApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideContext(app: PlaylistSantriApp): Context = app

    @Provides
    @Singleton
    fun provideApplications(app: PlaylistSantriApp): Application = app
}