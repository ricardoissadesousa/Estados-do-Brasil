package com.example.estadosdobrasil

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EstadoAdapter(
    private val context: Context,
    private val estados: List<Estado>?,
    private val onClickListener: EstadoOnClickListener
) : RecyclerView.Adapter<EstadoAdapter.EstadoViewHolder>() {

    // Interface para tratar o clique no item
    interface EstadoOnClickListener {
        fun onClickEstado(holder: EstadoViewHolder?, idx: Int)
    }

    // Infla o layout do item e cria o ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EstadoViewHolder {
        val view = LayoutInflater.from(context).inflate(
            R.layout.item_estado, // aqui será o layout com bandeira + nome
            parent,
            false
        )
        return EstadoViewHolder(view)
    }

    // Retorna o tamanho da lista
    override fun getItemCount(): Int = estados?.size ?: 0

    // Faz o bind das views com os dados
    override fun onBindViewHolder(holder: EstadoViewHolder, position: Int) {
        val estado = estados!![position]

        holder.tNome.text = estado.nome
        holder.img.setImageResource(estado.bandeiraResId)

        // Clique no item
        holder.itemView.setOnClickListener {
            onClickListener.onClickEstado(holder, position)
        }
    }

    // ViewHolder que guarda as referências
    class EstadoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tNome: TextView = view.findViewById(R.id.txtNomeEstado)
        var img: ImageView = view.findViewById(R.id.imgBandeira)
    }
}