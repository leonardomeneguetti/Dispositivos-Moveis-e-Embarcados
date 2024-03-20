package br.edu.ifsp.arq.ads.dmos5.project3

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var edtName: EditText
    lateinit var lstNames: ListView
    lateinit var names: ArrayList<String>
    lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            names = savedInstanceState.getStringArrayList("names")!!
        } else {
            names = ArrayList()
        }
        edtName = findViewById<EditText>(R.id.edt_name)
        lstNames = findViewById<ListView>(R.id.lst_names)
        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, names
        )
        lstNames.setAdapter(adapter)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putStringArrayList("names", names)
    }

    fun btnAddClick(view: View?) {
        names!!.add(edtName!!.text.toString())
        edtName.setText(null)
        adapter!!.notifyDataSetChanged()
    }
}