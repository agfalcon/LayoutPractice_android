package com.example.layoutpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_btn.setOnClickListener{
            onLoginButtonClikced()
        }
    }

    fun onLoginButtonClikced() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}