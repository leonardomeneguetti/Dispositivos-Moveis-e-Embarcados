package br.edu.ifsp.arq.ads.dmos5.ex4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = intent

        val cliente: Cliente? = intent.getSerializableExtra("cliente") as Cliente?

        Toast.makeText(this, "Nome: ${cliente?.getNome()}\n" +
                "Email: ${cliente?.getEmail()}\nTelefone: ${cliente?.getTelefone()}\n" +
                "CPF: ${cliente?.getCpf()}\nEndereço: ${cliente?.getEndereco()}\nCidade: ${cliente?.getCidade()}",
            Toast.LENGTH_SHORT).show()
    }

    private fun getClassName(): String {
        val nomeClasse = javaClass.name
        return nomeClasse.substring(nomeClasse.lastIndexOf("."))
    }
}