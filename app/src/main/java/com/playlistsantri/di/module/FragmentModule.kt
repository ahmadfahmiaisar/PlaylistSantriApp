package com.playlistsantri.di.module

import com.playlistsantri.presentation.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun provideMainFragment(): MainFragment

}
