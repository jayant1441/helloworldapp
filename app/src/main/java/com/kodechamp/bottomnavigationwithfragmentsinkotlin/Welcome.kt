package com.kodechamp.bottomnavigationwithfragmentsinkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlin.concurrent.schedule

import android.support.v4.app.SupportActivity
import android.support.v4.app.SupportActivity.ExtraData
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import java.util.*


class Welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)




     val task = object : TimerTask() {

         override fun run() {
             val intent = Intent(this@Welcome, MainActivity::class.java)
             startActivity(intent)
             finish()
         }
     }
        val t = Timer()
        t.schedule(task, 3500)
    }
}
