package com.example.layoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun onBackButtonClicked(view: View){
        finish()
    }
}