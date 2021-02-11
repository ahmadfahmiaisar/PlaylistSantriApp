package com.playlistsantri.di.module

import com.playlistsantri.presentation.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributesActivity(): MainActivity
}