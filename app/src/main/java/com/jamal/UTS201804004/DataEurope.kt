package com.jamal.UTS201804004

import java.util.ArrayList

object DataEurope {
    private val europe = arrayOf(
        "Austria",
        "Belgium",
        "Croatia",
        "Czech",
        "Denmark",
        "Finland",
        "France",
        "Germany",
        "Greece",
        "Iceland",
        "Ireland",
        "Italy",
        "Monaco",
        "Luxembourg",
        "Netherland",
        "Norway",
        "Poland",
        "Portugal",
        "Spain",
        "Ukraine"
    )

    private val e_capital = arrayOf(
        "Vienna",
        "Brussls",
        "Zagreb",
        "Prague",
        "Copenhagen",
        "Helsinki",
        "Paris",
        "Berlin",
        "Athenes",
        "Reykjavik",
        "Dublin",
        "Rome",
        "Monaco",
        "Luxembourg",
        "Amsterdam",
        "Oslo",
        "Warsaw",
        "Lisbon",
        "Madrid",
        "Kiev"
    )

    private val currency = arrayOf(
        "Euro",
        "Euro",
        "Kuna",
        "Czech koruna",
        "Danish krone",
        "Euro",
        "Euro",
        "Euro",
        "Euro",
        "Euro",
        "Icelandic krona",
        "Euro",
        "Euro",
        "Euro",
        "Euro",
        "Euro",
        "Zloty",
        "Euro",
        "Euro",
        "Ukrainian hryvina"
    )

    private val logoEurope = intArrayOf(
        R.drawable.austria,
        R.drawable.belgium,
        R.drawable.croatia,
        R.drawable.czech,
        R.drawable.denmark,
        R.drawable.finland,
        R.drawable.france,
        R.drawable.germany,
        R.drawable.greece,
        R.drawable.iceland,
        R.drawable.ireland,
        R.drawable.italy,
        R.drawable.monaco,
        R.drawable.luxembourg,
        R.drawable.netherlands,
        R.drawable.norway,
        R.drawable.poland,
        R.drawable.portugal,
        R.drawable.spain,
        R.drawable.ukraine
    )

    val listEurope: ArrayList<Item>
        get() {
            val listItem = arrayListOf<Item>()
            for (position in europe.indices){
                val item = Item()
                item.europe = europe[position]
                item.e_capital = e_capital[position]
                item.currency = currency[position]
                item.logoEurope = logoEurope[position]
                listItem.add(item)
            }
            return listItem
        }

}