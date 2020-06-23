package com.sangeetha.runningapp.viewModels


import androidx.lifecycle.ViewModel
import com.sangeetha.runningapp.repository.MainRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(private val mainRepository: MainRepository): ViewModel() {

}