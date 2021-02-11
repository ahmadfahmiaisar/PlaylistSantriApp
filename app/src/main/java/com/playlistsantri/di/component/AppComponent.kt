package com.playlistsantri.di.component

import com.playlistsantri.PlaylistSantriApp
import com.playlistsantri.di.module.*
import com.playlistsantri.di.module.viewmodel.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class,
        NetworkModule::class,
        RepositoryModule::class,
        AndroidInjectionModule::class,
        ActivityModule::class,
        FragmentModule::class,
        ViewModelModule::class,
        ServiceModule::class,
        CoroutineDispatcherModule::class]
)

interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: PlaylistSantriApp): Builder

        fun build(): AppComponent
    }

    fun inject(app: PlaylistSantriApp)
}
