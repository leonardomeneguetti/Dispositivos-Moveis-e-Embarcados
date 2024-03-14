package br.edu.ifsp.arq.ads.dmos5.projeto1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var edtName: TextView
    lateinit var btnSend: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtName = findViewById(R.id.edt_nome)
        btnSend = findViewById(R.id.btn_enviar)

        btnSend.setOnClickListener(View.OnClickListener {
            val nome: String = edtName.text.toString()
            Toast.makeText(this, getString(R.string.message) + " " + nome, Toast.LENGTH_SHORT).show()
        })
    }
}