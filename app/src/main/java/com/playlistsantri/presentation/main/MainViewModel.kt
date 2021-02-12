package com.playlistsantri.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.playlistsantri.abstraction.UseCase
import com.playlistsantri.data.vo.Result
import com.playlistsantri.domain.entity.Articles
import com.playlistsantri.domain.usecase.GetArticlesUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val getArticlesUseCase: GetArticlesUseCase) :
    ViewModel() {
    private val _articles = MutableLiveData<Result<List<Articles>>>()
    val articles: LiveData<Result<List<Articles>>>
        get() = _articles

    fun getArticles() {
        _articles.value = Result.Loading
        viewModelScope.launch {
            _articles.value = getArticlesUseCase(UseCase.None)
        }
    }
}