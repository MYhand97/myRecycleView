package com.myhand.myrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.myhand.myrecycleview.adapter.MyAdapter
import com.myhand.myrecycleview.model.Models

class MainActivity : AppCompatActivity() {

    private var recyclerView:RecyclerView ?= null
    private var gridLayoutManager:GridLayoutManager ?= null
    private var arrayList:ArrayList<Models> ?= null
    private var myAdapter:MyAdapter ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.my_recycle_view)
        gridLayoutManager = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        myAdapter = MyAdapter(applicationContext, arrayList!!)
        recyclerView?.adapter = myAdapter
    }

    private fun setDataInList(): ArrayList<Models> {
        var items:ArrayList<Models> = ArrayList()

        items.add(Models(R.drawable.bg_card_green, R.drawable.checked, "New \nArrival"))
        items.add(Models(R.drawable.bg_card_red, R.drawable.link, "Link \nSaved"))
        items.add(Models(R.drawable.bg_card_yellow, R.drawable.house, "My \nHome"))
        items.add(Models(R.drawable.bg_card_purple, R.drawable.film, "Eye \nStream"))
        items.add(Models(R.drawable.bg_card_navy, R.drawable.pluspro, "Pro \nAccount"))
        items.add(Models(R.drawable.bg_card_sky, R.drawable.download, "Recent \nFiles"))

        return items

    }
}