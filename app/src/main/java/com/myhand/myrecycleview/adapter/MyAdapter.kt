package com.myhand.myrecycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.myhand.myrecycleview.R
import com.myhand.myrecycleview.model.Models

class MyAdapter (var context: Context, var arrayList: ArrayList<Models>) : RecyclerView.Adapter<MyAdapter.ItemHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var models: Models = arrayList.get(position)

        holder.bg.setBackgroundResource(models.bgCard!!)
        holder.icons.setImageResource(models.iconImage!!)
        holder.title.text = models.titleCard

        holder.bg.setOnClickListener{
            Toast.makeText(context, "You Clicked "+models.titleCard?.replace("\n", ""), Toast.LENGTH_LONG).show()
        }
        /*holder.title.setOnClickListener{
            Toast.makeText(context, models.titleCard, Toast.LENGTH_LONG).show()
        }*/
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var bg: RelativeLayout = itemView.findViewById<RelativeLayout>(R.id.bg_card)
        var icons: ImageView = itemView.findViewById<ImageView>(R.id.icons_card)
        var title: TextView = itemView.findViewById<TextView>(R.id.title_card)
    }

}