package com.playlistsantri.presentation.main

import com.playlistsantri.R
import com.playlistsantri.abstraction.BaseFragment
import com.playlistsantri.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {
    override fun getLayoutResourceId(): Int = R.layout.fragment_main
    override fun getViewModelClass(): Class<MainViewModel> = MainViewModel::class.java

}