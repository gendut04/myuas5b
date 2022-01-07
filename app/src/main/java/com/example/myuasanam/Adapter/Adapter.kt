package com.example.myuasanam.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myuasanam.Model.Model
import com.example.myuasanam.R

class Adapter (
    val vespa: ArrayList<Model.Data>
): RecyclerView.Adapter<Adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter, parent, false)
    )

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val data = vespa[position]
        holder.textNama.text = data.nama
        holder.textHarga.text = data.harga
    }

    override fun getItemCount() = vespa.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textNama = view.findViewById<TextView>(R.id.textnama)
        val textHarga = view.findViewById<TextView>(R.id.textharga)
    }

    public fun setData(data: List<Model.Data>){
        vespa.clear()
        vespa.addAll(data)
        notifyDataSetChanged()
    }

}