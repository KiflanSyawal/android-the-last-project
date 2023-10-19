package com.example.lastproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lastproject.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegisterBinding
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()
    }
}