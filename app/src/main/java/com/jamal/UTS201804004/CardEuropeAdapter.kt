package com.jamal.UTS201804004

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardEuropeAdapter(private val listEurope: ArrayList<Item>) : RecyclerView.Adapter<CardEuropeAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var te_name: TextView = itemView.findViewById(R.id.t_name)
        var te_capital: TextView = itemView.findViewById(R.id.t_capital)
        var te_currency: TextView = itemView.findViewById(R.id.t_currency)
        var imgLogo: ImageView = itemView.findViewById(R.id.imgLogo)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_europe, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listEurope.size
    }

    override fun onBindViewHolder(holder: CardEuropeAdapter.CardViewHolder, position: Int) {
        val itemEurope = listEurope[position]

        Glide.with(holder.itemView.context)
            .load(itemEurope.logoEurope)
            .apply(RequestOptions().override(60, 60))
            .into(holder.imgLogo)
        holder.te_name.text = itemEurope.europe
        holder.te_capital.text = itemEurope.e_capital
        holder.te_currency.text = itemEurope.currency

    }
}