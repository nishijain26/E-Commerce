package com.example.e_commerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var joinNowButton: Button? = null
    private var loginButton: Button? = null
    private val LoginActivity: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        joinNowButton = findViewById<View>(R.id.main_join_now_btn) as Button
        loginButton = findViewById<View>(R.id.main_login_now_btn) as Button
        loginButton!!.setOnClickListener {
            val intent = Intent(LoginActivity)
            startActivity(intent)
        }
    }
}