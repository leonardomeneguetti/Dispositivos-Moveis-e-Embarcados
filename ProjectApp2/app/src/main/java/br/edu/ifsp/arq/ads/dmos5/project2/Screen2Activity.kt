package br.edu.ifsp.arq.ads.dmos5.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Screen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ciclo", getClassName() + ".onCreate() foi chamado.")
        val intent = intent

        val name = intent.getStringExtra("name")
        val age = intent.getIntExtra("age", -1)

        val person: Person? = intent.getSerializableExtra("person") as Person?

        Toast.makeText(this, "Nome: $name Idade: $age \nNome 2: ${person?.getName()} Idade 2: ${person?.getAge()}", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("ciclo", getClassName() + ".onStart() foi chamado.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ciclo", getClassName() + ".onResume() foi chamado.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ciclo", getClassName() + ".onPause() foi chamado.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ciclo", getClassName() + ".onStop() foi chamado.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ciclo", getClassName() + ".onRestart() foi chamado.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ciclo", getClassName() + ".onDestroy() foi chamado.")
    }

    private fun getClassName(): String {
        val nomeClasse = javaClass.name
        return nomeClasse.substring(nomeClasse.lastIndexOf("."))
    }
}