package br.edu.ifsp.arq.ads.dmos5.project4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val REQUEST_STATE = 1
    private val STATUS_STATE = "state"
    private var state: String = ""

    lateinit var btnSelect: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSelect = findViewById<Button>(R.id.btn_select)
        btnSelect.setOnClickListener(View.OnClickListener {
            val intent = Intent(
                this@MainActivity,
                SelectScreenActivity::class.java
            )
            intent.putExtra("state", state)
            startActivityForResult(intent, REQUEST_STATE)
        })
        if (savedInstanceState != null) {
            state = savedInstanceState.getString(STATUS_STATE)!!
            btnSelect.setText(state)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == REQUEST_STATE) {
            state = data?.getStringExtra("result").toString()
            if (state != null) {
                btnSelect!!.text = state
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATUS_STATE, state)
    }
}