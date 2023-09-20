package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivityRetiros : AppCompatActivity() {

    private lateinit var saldoTextView: TextView
    private lateinit var montoEditText: EditText
    private lateinit var ingresarButton: Button
    private lateinit var retirarButton: Button

    private var saldo: Double = 1000.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_retiros)

        saldoTextView = findViewById(R.id.saldoTextView)
        montoEditText = findViewById(R.id.montoEditText)
        ingresarButton = findViewById(R.id.ingresarButton)
        retirarButton = findViewById(R.id.retirarButton)

        saldoTextView.text = "Saldo actual: $saldo"

        ingresarButton.setOnClickListener {
            val monto = montoEditText.text.toString().toDoubleOrNull()

            if (monto != null && monto > 0) {
                saldo += monto
                saldoTextView.text = "Saldo actual: $saldo"
                Toast.makeText(this, "Depósito exitoso de $monto", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Monto no válido", Toast.LENGTH_SHORT).show()
            }

            montoEditText.text.clear()
        }

        retirarButton.setOnClickListener {
            val monto = montoEditText.text.toString().toDoubleOrNull()

            if (monto != null && monto > 0 && monto <= saldo) {
                saldo -= monto
                saldoTextView.text = "Saldo actual: $saldo"
                Toast.makeText(this, "Retiro exitoso de $monto", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Monto no válido o insuficiente saldo", Toast.LENGTH_SHORT).show()
            }

            montoEditText.text.clear()
        }
    }
}
