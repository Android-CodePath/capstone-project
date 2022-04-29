package com.example.rouleate

import android.view.View
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private var dataList : List<DataModel>) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        var view = inflater.inflate(R.layout.our_list_image_layout, parent, false)
        return ViewHolder(view)
    }
    override fun getItemCount() = dataList.size

    override fun onBindViewHolder(holder: ImageAdapter.ViewHolder, position: Int) {
        val data = dataList[position]

        holder.title.text = data.title
        holder.image.setImageResource(data.image)
    }

    internal fun setDataList(dataList: List<DataModel>){
        this.dataList = dataList
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image : ImageView = itemView.findViewById(R.id.food_image)
        val title : TextView = itemView.findViewById(R.id.title)
    }
}