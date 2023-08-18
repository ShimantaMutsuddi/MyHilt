package com.mutsuddi_s.myhilt.prac1

import android.util.Log
import javax.inject.Inject

private const val TAG = "LoggerService"
class  LoggerService @Inject constructor() {

    fun log(message : String)
    {
        Log.d(TAG, "message")

    }
}