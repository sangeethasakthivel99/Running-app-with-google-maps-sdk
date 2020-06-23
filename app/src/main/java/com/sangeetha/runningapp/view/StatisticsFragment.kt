package com.sangeetha.runningapp.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sangeetha.runningapp.R
import com.sangeetha.runningapp.viewModels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment: Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}