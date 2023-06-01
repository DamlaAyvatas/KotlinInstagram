package com.dayvatas.kotlininstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dayvatas.kotlininstagram.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        auth = Firebase.auth
    }

    fun signInClicked(view : View){

    }

    fun signUpClicked(view : View){

    }
}