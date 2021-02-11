package com.playlistsantri.presentation.main

import android.os.Bundle
import com.playlistsantri.R
import com.playlistsantri.abstraction.BaseActivity
import com.playlistsantri.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override fun getLayoutResourceId(): Int = R.layout.activity_main
    override fun getViewModelClass(): Class<MainViewModel> = MainViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}