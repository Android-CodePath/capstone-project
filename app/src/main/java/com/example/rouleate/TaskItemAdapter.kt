package com.example.rouleate

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

/*
* Tells the recyclerView how to display the data that is given
* This is needed to bridge the reclycerview
* */
class TaskItemAdapter(val listOfChoices: List<String>): RecyclerView.Adapter<TaskItemAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        // TODO Not yet implemented

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}