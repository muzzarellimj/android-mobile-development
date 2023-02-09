package dev.muzzarelli.android.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.muzzarellimj.android.recycler.R

class GodAdapter(private val gods: List<God>) : RecyclerView.Adapter<GodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GodViewHolder = GodViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.god_card_view, parent, false)
    )

    override fun getItemCount(): Int = gods.size

    override fun onBindViewHolder(holder: GodViewHolder, position: Int) {
        val god = gods[position]

        holder.name.text = god.name
        holder.tier.text = god.tier
        holder.race.text = god.race
        holder.description.text = god.description
    }
}