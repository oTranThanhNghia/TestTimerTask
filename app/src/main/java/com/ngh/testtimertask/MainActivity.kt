package com.ngh.testtimertask

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import java.util.*

class MainActivity : AppCompatActivity() {

    private var timer: Timer?=null
    private var countDownTimerTask:CountDownTimerTask?=null

    private var count = 1800
//    var countDownOs: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        timer = Timer()
//        countDownOs = object: CountDownTimer(30000, 1000){
//            override fun onFinish() {
//                Log.i("MainActivity", "onFinish ")
//                countDownOs?.start()
//            }
//
//            override fun onTick(millisUntilFinished: Long) {
//                count--
//                Log.i("MainActivity", "onTick count= $count ")
//                if(count==0){
//                    count=1800
//                }
//            }
//
//        }
//
//        countDownOs?.start()
        Log.i("MainActivity", "onCreate ")
        countDownTimerTask = CountDownTimerTask()

        timer?.scheduleAtFixedRate(countDownTimerTask, 0, 1000)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
