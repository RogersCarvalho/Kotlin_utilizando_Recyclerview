package com.example.aula_recyclerview_igor_ferrani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //Procura pela recyclerview (ou seja, a rList)
    private val reList: RecyclerView by lazy { findViewById<RecyclerView>(R.id.id_rList) }
    private val adapter = ContactAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          bindview()
          atualiza()
    }


    private fun atualiza() {
        adapter.updateLista(arrayListOf(
                                        Contact("Igor", "3291740603", "img.png"),
                                        Contact("JOSE", "3291740605", "img.png"),
                                        Contact("Maria", "3232243555", "img.png"),
                                        Contact("Antonio", "3232124567", "img.png"),
                                        Contact("Luana", "3232248329", "img.png") ,
                                        Contact("Lucas", "3232245675", "img.png")
                                         ))
    }


    private fun bindview() {
        reList.adapter = adapter
        reList.layoutManager= LinearLayoutManager(this)
    }


}











