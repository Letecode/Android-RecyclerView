package com.letecode.planetdiscovery.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.letecode.planetdiscovery.R
import com.letecode.planetdiscovery.Utils
import com.letecode.planetdiscovery.models.Planete

class PlanetAdapter(private val planeteList: ArrayList<Planete>, private val context: Context)
    : RecyclerView.Adapter<PlanetAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return(ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_planete, parent, false)
        ))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val planete : Planete = planeteList[position]

        holder.bind(planete)

        holder.itemView.setOnClickListener {
            // Ouvre wikipédia dans un navigateur
            Utils.openBrowser(context, planete.lien)
        }
    }

    override fun getItemCount(): Int = planeteList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.image)
        val nomView: TextView = itemView.findViewById(R.id.nom)
        val distance : TextView = itemView.findViewById(R.id.distance)

        fun bind(planete: Planete) {
            imageView.setImageResource(planete.image)
            nomView.text = planete.nom
            distance.text = planete.distance
        }
    }


}