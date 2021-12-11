package com.easyapp.customcs.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.easyapp.customcs.R
import com.easyapp.customcs.model.ModelEvidencias
import com.easyapp.customcs.model.ModelSimilares

class AdapterSimilares(private val similares: List<ModelSimilares>) :
    RecyclerView.Adapter<AdapterSimilares.SimilaresViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SimilaresViewHolder {
        return SimilaresViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_similares,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AdapterSimilares.SimilaresViewHolder, position: Int) {
        holder.bind(similares[position])
    }

    override fun getItemCount(): Int {
        return similares.size
    }


    inner class SimilaresViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val image = view.findViewById<ImageView>(R.id.ivArticulo)
        private val tvNombre = view.findViewById<TextView>(R.id.tvNombre)
        private val tvPrecioInicial = view.findViewById<TextView>(R.id.tvPrecioInicial)
        private val tvPrecioFinal = view.findViewById<TextView>(R.id.tvPrecioFinal)
        private val tvMensualidadTelmex = view.findViewById<TextView>(R.id.tvMensualidadTelmex)
        private val tvMensualidadTarjeta = view.findViewById<TextView>(R.id.tvMensualidadTarjeta)
        fun bind(modelEvidencias: ModelSimilares) {
            image.setImageResource(modelEvidencias.imagen)
            tvNombre.text = modelEvidencias.nombre
            tvPrecioInicial.text = modelEvidencias.precioInicial
            tvPrecioFinal.text = modelEvidencias.precioFinal
            tvMensualidadTelmex.text = modelEvidencias.mensualidadTelmex
            tvMensualidadTarjeta.text = modelEvidencias.mensualidadTarjeta
        }
    }
}

