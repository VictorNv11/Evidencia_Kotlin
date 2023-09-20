package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenuApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu_app)

        val botonVolver=findViewById<Button>(R.id.buttonVolver)
        botonVolver.setOnClickListener{
        onBackPressed()
        }
    }
}