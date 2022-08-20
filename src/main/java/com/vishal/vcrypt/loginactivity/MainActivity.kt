package com.vishal.vcrypt.loginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vishal.vcrypt.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
}