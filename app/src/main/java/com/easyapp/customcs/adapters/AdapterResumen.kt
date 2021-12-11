package com.easyapp.customcs.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.easyapp.customcs.R
import com.easyapp.customcs.databinding.ItemResumenBinding
import com.easyapp.customcs.model.ModelEvidencias

class AdapterResumen(private val evidencias: List<ModelEvidencias>) :
    RecyclerView.Adapter<AdapterResumen.ResumenViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ResumenViewHolder {
        return ResumenViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_resumen,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AdapterResumen.ResumenViewHolder, position: Int) {
        holder.bind(evidencias[position])
    }

    override fun getItemCount(): Int {
        return evidencias.size
    }


    inner class ResumenViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val image = view.findViewById<ImageView>(R.id.ivEvidencia)
        fun bind(modelEvidencias: ModelEvidencias) {
                image.setImageResource(modelEvidencias.imagen)
        }

    }

}