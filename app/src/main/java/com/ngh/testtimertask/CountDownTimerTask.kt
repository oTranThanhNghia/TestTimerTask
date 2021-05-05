package com.ngh.testtimertask

import android.util.Log
import java.util.*

class CountDownTimerTask : TimerTask() {
    companion object {
        val INT_COUNTER: Int = 1800
    }

    private var count = INT_COUNTER

    override fun run() {
        count--
        Log.i("CountDownTimerTask", "count = $count")

        if (count == 0) {
            count = INT_COUNTER
        }
    }

}
