package com.jamal.UTS201804004

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class RvAsia : AppCompatActivity() {
    private lateinit var rv_item: RecyclerView
    private var list: ArrayList<Item> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv_asia)

        rv_item = findViewById(R.id.rv_container)
        rv_item.setHasFixedSize(true)

        list.addAll(DataAsia.listAsia)
        showRecyclerViewListMode()
    }

    private fun showRecyclerViewListMode(){
        rv_item.layoutManager = LinearLayoutManager(this)
        val cardAdapter = CardAsiaAdapter(list)
        rv_item.adapter = cardAdapter
    }
}
