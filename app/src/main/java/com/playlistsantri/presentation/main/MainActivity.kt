package com.playlistsantri.presentation.main

import android.os.Bundle
import androidx.lifecycle.Observer
import com.playlistsantri.R
import com.playlistsantri.abstraction.BaseActivity
import com.playlistsantri.data.vo.Result
import com.playlistsantri.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override fun getLayoutResourceId(): Int = R.layout.activity_main
    override fun getViewModelClass(): Class<MainViewModel> = MainViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        observeGetArticlesResult()
        vm.getArticles()
    }

    private fun observeGetArticlesResult() {
        vm.articles.observe(this, {
            when (it) {
                is Result.Loading -> {
                    Timber.tag("ISINYA").d("$it")
                }
                is Result.Success -> {
                    Timber.tag("ISINYA").d("${it.data}")
                }
                is Result.Error -> {
                    Timber.tag("ISINYA").d("$it")
                }

            }
        })
    }
}