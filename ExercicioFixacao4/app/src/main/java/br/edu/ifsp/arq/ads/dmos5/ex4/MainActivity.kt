package br.edu.ifsp.arq.ads.dmos5.ex4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edtNome: TextView
    lateinit var edtEmail: TextView
    lateinit var edtTelefone: TextView
    lateinit var edtCpf: TextView
    lateinit var edtEndereco: TextView
    lateinit var edtCidade: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNome = findViewById(R.id.edt_nome)
        edtEmail = findViewById(R.id.edt_email)
        edtTelefone = findViewById(R.id.edt_tel)
        edtCpf = findViewById(R.id.edt_cpf)
        edtEndereco = findViewById(R.id.edt_end)
        edtCidade = findViewById(R.id.edt_cid)
    }

    fun onClickBtnSend(view: View?) {
        val intent = Intent(this, MainActivity2::class.java)

        val nome = edtNome.toString()
        val email = edtEmail.toString()
        val telefone = edtTelefone.toString()
        val cpf = edtCpf.toString()
        val endereco = edtEndereco.toString()
        val cidade = edtCidade.toString()

        val cliente = Cliente(nome, email, telefone, cpf, endereco, cidade)
        intent.putExtra("cliente", cliente)

        startActivity(intent)
    }
}