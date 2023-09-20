package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivityInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_inicio)

        val usuario=findViewById<EditText>(R.id.editTextUsuario)
        val clave=findViewById<EditText>(R.id.editTextTextClave)
        val botoIniciar=findViewById<Button>(R.id.buttonIniciar)
        botoIniciar.setOnClickListener{
            if (usuario.text.toString().equals("Admin")&& clave.text.toString().equals("12345")){
                val intento =Intent(this, MainActivity::class.java)
                startActivity(intento)
                Toast.makeText(this, "¡Bienvenido ${usuario.text.toString()}!", Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this, "¡Datos incorrectos!", Toast.LENGTH_LONG).show()
            }
        }
    }
}