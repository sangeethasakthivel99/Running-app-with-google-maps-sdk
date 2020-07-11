package com.sangeetha.runningapp

import android.graphics.Color

const val RUNNING_DATABASE = "running_database"
const val REQUEST_CODE_LOCATION_PERMISSION = 0

const val ACTION_START_OR_RESUME_SERVICE = "actionStartOrResumeService"
const val ACTION_PAUSE_SERVICE = "actionPauseService"
const val ACTION_STOP_SERVICE = "actionStopService"
const val ACTION_SHOW_TRACKING_FRAGMENT = "showTrackingFragment "

const val NOTIFICATION_CHANNEL_ID = "tracking_channel"
const val NOTIFICATION_CHANNEL_NAME = "Tracking"
const val NOTIFICATION_ID = 1 // don't set to zero.

const val LOCATION_UPDATE_INTERVAL = 5000L
const val FASTEST_LOCATION_INTERVAL = 2000L

const val POLY_LINE_COLOR = Color.RED
const val POLY_LINE_WIDTH = 8f

const val MAP_ZOOM = 15f
