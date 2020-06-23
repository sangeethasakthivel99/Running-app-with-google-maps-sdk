package com.sangeetha.runningapp.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sangeetha.runningapp.R
import com.sangeetha.runningapp.viewModels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment: Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()
}