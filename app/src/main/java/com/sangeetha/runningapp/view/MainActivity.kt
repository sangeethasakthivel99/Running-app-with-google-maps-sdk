package com.sangeetha.runningapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.sangeetha.runningapp.ACTION_SHOW_TRACKING_FRAGMENT
import com.sangeetha.runningapp.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    setSupportActionBar(toolbar)

    navigateToTrackingFragment(intent)

    bottomNavigationView.setupWithNavController(nav_host_fragment.findNavController())

    nav_host_fragment.findNavController().addOnDestinationChangedListener { controller, destination, arguments ->
      when (destination.id) {
        R.id.settingsFragment , R.id.runFragment , R.id.statisticsFragment ->
          bottomNavigationView.visibility = View.VISIBLE

        else -> bottomNavigationView.visibility = View.GONE
      }
    }
  }

  override fun onNewIntent(intent: Intent?) {
    super.onNewIntent(intent)
    navigateToTrackingFragment(intent )
  }

  private fun navigateToTrackingFragment(intent: Intent?) {
    if (intent?.action == ACTION_SHOW_TRACKING_FRAGMENT) {
      nav_host_fragment.findNavController().navigate(R.id.action_global_tracking_fragment)
    }
  }
}