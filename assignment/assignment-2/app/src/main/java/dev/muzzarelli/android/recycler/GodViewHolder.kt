package dev.muzzarelli.android.recycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.muzzarellimj.android.recycler.R

class GodViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val name: TextView = view.findViewById(R.id.value_name)
    val tier: TextView = view.findViewById(R.id.value_tier)
    val race: TextView = view.findViewById(R.id.value_race)
    val description: TextView = view.findViewById(R.id.value_description)
}