package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.EditText
import android.widget.Button
import android.content.Intent
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val numero1 = findViewById<EditText>(R.id.editTextNumero1)
        val numero2 = findViewById<EditText>(R.id.editTextNumero2)
        val textResultado = findViewById<TextView>(R.id.textViewResultado)
        val botonSumar = findViewById<Button>(R.id.buttonSumar)
        val botonRestar = findViewById<Button>(R.id.buttonRestar)
        val botonMultiplicar = findViewById<Button>(R.id.buttonMultiplicar)
        val botonDividir = findViewById<Button>(R.id.buttonDividir)
        val botonFuncionTrig = findViewById<Button>(R.id.buttonFunTrig)
        val botonMenu = findViewById<Button>(R.id.buttonMenu)
        val botonRetiros = findViewById<Button>(R.id.buttonRetiros)

        botonSumar.setOnClickListener {
            val recogerNum1 = numero1.text.toString().toInt()
            val recogerNum2 = numero2.text.toString().toInt()
            val resultado = recogerNum1 + recogerNum2
            textResultado.text = resultado.toString()
        }
        botonRestar.setOnClickListener {
            val recogerNum1 = numero1.text.toString().toInt()
            val recogerNum2 = numero2.text.toString().toInt()
            val resultado = recogerNum1 - recogerNum2
            textResultado.text = resultado.toString()
        }
        botonMultiplicar.setOnClickListener {
            val recogerNum1 = numero1.text.toString().toInt()
            val recogerNum2 = numero2.text.toString().toInt()
            val resultado = recogerNum1 * recogerNum2
            textResultado.text = resultado.toString()
        }
        botonDividir.setOnClickListener {
            val recogerNum1 = numero1.text.toString().toInt()
            val recogerNum2 = numero2.text.toString().toInt()
            val resultado = recogerNum1 / recogerNum2
            textResultado.text = resultado.toString()
        }
        botonFuncionTrig.setOnClickListener {
            val recogerNum1 = numero1.text.toString().toDouble()
            val recogerNum2 = numero2.text.toString().toDouble()
            val resultado = recogerNum1 / recogerNum2
            val resultadoSeno = sin(recogerNum1)
            val resultadoCoseno = cos(recogerNum2)



            botonRetiros.setOnClickListener {
                val intent = Intent(this, MainActivityRetiros::class.java)
                startActivity(intent)
            }


        }
    }
}