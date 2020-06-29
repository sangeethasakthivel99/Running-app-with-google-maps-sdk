package com.sangeetha.runningapp.service

import android.content.Intent
import androidx.lifecycle.LifecycleService
import com.sangeetha.runningapp.ACTION_PAUSE_SERVICE
import com.sangeetha.runningapp.ACTION_START_OR_RESUME_SERVICE
import com.sangeetha.runningapp.ACTION_STOP_SERVICE
import timber.log.Timber

class TrackingService: LifecycleService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when(it.action) {
                ACTION_START_OR_RESUME_SERVICE -> {
                    Timber.d("started or Resumed Service")
                }
                ACTION_PAUSE_SERVICE -> {
                    Timber.d("Paused Service")
                }
                ACTION_STOP_SERVICE -> {
                    Timber.d("stopped Service")
                }
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }
}