package com.example.rodri.primeirospassos

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val Alunos = arrayOf("Rodrigo", "Daniel", "Nicolas", "João")

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val ListaAlunos =  findViewById<ListView>(R.id.lista_alunos)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Alunos)

        ListaAlunos.setAdapter (adapter)


    }

}
