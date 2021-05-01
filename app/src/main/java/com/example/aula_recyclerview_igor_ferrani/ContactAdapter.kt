package com.example.aula_recyclerview_igor_ferrani

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


//A classeAdapter gerencia a lista como um todo
class ContactAdapter:  RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>(){

    private val list: MutableList<Contact> = mutableListOf()

    //cria cada item visual para depois popular
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.contactitem,parent,false)
        return ContactAdapterViewHolder(view)
    }

    //verifica quantos itens tem a lista
    override fun getItemCount(): Int {
        return list.size
    }

    //Trabalha com cada item jogando na recyclerview
    //Pra cada item executa esse método lendo o bind da classe abaixo
    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

     //Responsavel por atualizar a recyclervieew
    fun updateLista(List: List<Contact>){
          list.clear()
          list.addAll(List)
          notifyDataSetChanged()
    }


    //viewholder gerencia cada item--------------------------------------------------
    class ContactAdapterViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

        private val nome: TextView = itemView.findViewById(R.id.id_contato)
        private val phone: TextView = itemView.findViewById(R.id.id_fone)
        //private val foto: TextView = itemView.findViewById(R.id.id_foto)

        fun bind(contact: Contact){
            nome.text = contact.nome
            phone.text = contact.phone
            //foto.text = contact.foto
        }
    }




}