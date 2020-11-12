package com.jamal.UTS201804004

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardAsiaAdapter(private val ListAsia: ArrayList<Item>) : RecyclerView.Adapter<CardAsiaAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var ta_name: TextView = itemView.findViewById(R.id.t_name)
        var ta_capital: TextView = itemView.findViewById(R.id.t_capital)
        var te_currency: TextView = itemView.findViewById(R.id.t_currency)
        var imgLogo: ImageView = itemView.findViewById(R.id.imgLogo)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_asia, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ListAsia.size
    }

    override fun onBindViewHolder(holder: CardAsiaAdapter.CardViewHolder, position: Int) {
        val itemAsia = ListAsia[position]

        Glide.with(holder.itemView.context)
            .load(itemAsia.logoAsia)
            .apply(RequestOptions().override(60, 60))
            .into(holder.imgLogo)
        holder.ta_name.text = itemAsia.asia
        holder.ta_capital.text = itemAsia.a_capital
        holder.te_currency.text = itemAsia.currency

    }
}