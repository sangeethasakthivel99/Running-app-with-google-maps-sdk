package com.sangeetha.runningapp.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sangeetha.runningapp.R
import com.sangeetha.runningapp.viewModels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class RunFragment: Fragment(R.layout.fragment_run) {

    private val viewModel: MainViewModel by viewModels()
}