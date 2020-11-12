package com.jamal.UTS201804004

import java.util.ArrayList

object DataAsia {
    private val asia = arrayOf(
        "Afghanistan",
        "Bahrain",
        "Bangladesh",
        "Bhutan",
        "Brunei",
        "China",
        "Cambodia",
        "East Timor",
        "India",
        "Indonesia",
        "Iran",
        "Iraq",
        "North Korea",
        "South Korea",
        "Israel",
        "Japan",
        "Laos",
        "Lebanon",
        "Malaysia",
        "Philippines"
    )

    private val a_capital = arrayOf(
        "Kabul",
        "Al-Manamah",
        "Dhaka",
        "Thimphu",
        "Bandar Seri Begawan",
        "Beijing",
        "Phnom Penh",
        "Dili",
        "New Delhi",
        "Jakarta",
        "Tehran",
        "Baghdad",
        "Pyoyang",
        "Seoul",
        "Tel Aviv",
        "Tokyo",
        "Vientiane",
        "Beirut",
        "Kuala Lumpur",
        "Manila"
    )

    private val currency = arrayOf(
        "Afgani",
        "Dinar Bahrain",
        "Teka",
        "Ngultrum",
        "Dollar Brunei",
        "Yuan",
        "Riel",
        "USD",
        "Rupee",
        "Rupiah",
        "Rial",
        "Iraq Dinar",
        "Won",
        "Won",
        "Shekel",
        "Yen",
        "Kip",
        "Lebanese Pound",
        "Ringgit",
        "Peso"
    )

    private val logoAsia = intArrayOf(
        R.drawable.afghanistan,
        R.drawable.bahrain,
        R.drawable.bangladesh,
        R.drawable.bhutan,
        R.drawable.brunei,
        R.drawable.china,
        R.drawable.cambodia,
        R.drawable.east_timor,
        R.drawable.india,
        R.drawable.indonesia,
        R.drawable.iran,
        R.drawable.iraq,
        R.drawable.north_korea,
        R.drawable.south_korea,
        R.drawable.israel,
        R.drawable.japan,
        R.drawable.laos,
        R.drawable.lebanon,
        R.drawable.malaysia,
        R.drawable.philippines
    )

    val listAsia: ArrayList<Item>
        get() {
            val listItem = arrayListOf<Item>()
            for (position in asia.indices){
                val item = Item()
                item.asia = asia[position]
                item.a_capital = a_capital[position]
                item.currency = currency[position]
                item.logoAsia = logoAsia[position]
                listItem.add(item)
            }
            return listItem
        }

}