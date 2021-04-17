package com.example.e_commerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
class RegisterActivity : AppCompatActivity() {
    private var CreateAccountButton: Button? = null
    private var InputName: EditText? = null
    private var InputPhoneNumber: EditText? = null
    private var InputPassword: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        CreateAccountButton = findViewById<View>(R.id.register_btn) as Button
        InputName = findViewById<View>(R.id.register_username_input) as EditText
        InputPassword = findViewById<View>(R.id.register_password_input) as EditText
        InputPhoneNumber = findViewById<View>(R.id.register_phonenumber_input) as EditText
    }
}