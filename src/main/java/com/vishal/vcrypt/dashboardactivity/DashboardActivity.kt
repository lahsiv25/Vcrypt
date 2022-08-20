package com.vishal.vcrypt.dashboardactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vishal.vcrypt.R
import com.vishal.vcrypt.databinding.ActivityDashboardBinding
import com.vishal.vcrypt.loginactivity.MainActivity

class DashboardActivity : AppCompatActivity() {

    lateinit var _binding:ActivityDashboardBinding
    val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        _binding = ActivityDashboardBinding.inflate(layoutInflater)
        binding
        setContentView(binding!!.root!!)
        binding.signout.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }
}