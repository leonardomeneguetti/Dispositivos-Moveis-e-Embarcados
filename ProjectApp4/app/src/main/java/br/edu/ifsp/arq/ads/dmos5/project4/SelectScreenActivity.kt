package br.edu.ifsp.arq.ads.dmos5.project4

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.Arrays

class SelectScreenActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listAdapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_single_choice,
            resources.getStringArray(R.array.states)
        )
        val state = intent.getStringExtra("state")
        if (state != null) {
            val position = Arrays.asList<String>(
                *resources.getStringArray(R.array.states)
            ).indexOf(state)
            listView.choiceMode = AbsListView.CHOICE_MODE_SINGLE
            listView.setItemChecked(position, true)
        }
    }

    override fun onListItemClick(l: ListView, v: View?, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)
        val resultado = l.getItemAtPosition(position).toString()
        val intent = Intent()
        intent.putExtra("result", resultado)
        setResult(RESULT_OK, intent)
        finish()
    }
}