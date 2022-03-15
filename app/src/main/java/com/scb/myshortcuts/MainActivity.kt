package com.scb.myshortcuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickActivity1(view: View) {
        val intent = Intent(this, Activity1::class.java)
        startActivity(intent)
    }

    fun clickActivity2(view: View) {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

    fun clickActivity3(view: View) {
        val intent = Intent(this, Activity3::class.java)
        startActivity(intent)
    }
}