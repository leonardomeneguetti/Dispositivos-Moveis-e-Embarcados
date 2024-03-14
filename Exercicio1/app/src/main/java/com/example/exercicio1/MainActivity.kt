package com.example.exercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edtPeso: TextView
    lateinit var edtAltura: TextView
    lateinit var btnEnviar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtPeso = findViewById(R.id.edt_peso)
        edtAltura = findViewById(R.id.edt_altura)
        btnEnviar = findViewById(R.id.btn_enviar)

        btnEnviar.setOnClickListener(View.OnClickListener {
            val peso: Double = edtPeso.text.toString().toDouble()
            val altura: Double = (edtAltura.text.toString().toDouble())/100
            val imc: Double = peso/(altura*altura)

            Toast.makeText(this, getString(R.string.message) + " " + imc, Toast.LENGTH_SHORT).show()
        })
    }
}