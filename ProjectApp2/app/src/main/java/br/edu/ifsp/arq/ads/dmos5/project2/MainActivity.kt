package br.edu.ifsp.arq.ads.dmos5.project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("ciclo", getClassName() + ".onCreate() foi chamado.")
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

    fun onClickBtnSend(view: View?) {
        val intent = Intent(this, Screen2Activity::class.java)

        // enviar dados (String e int)
        intent.putExtra("name", "Ana Maria")
        intent.putExtra("age", 25)

        // enviar um objeto da classe Pessoa
        val person = Person("Mariana", 30)
        intent.putExtra("person", person)

        startActivity(intent)
    }
}