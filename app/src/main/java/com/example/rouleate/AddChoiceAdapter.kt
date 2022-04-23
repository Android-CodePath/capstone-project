package com.example.rouleate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/*
* Tells the recyclerView how to display the data that is given
* This is needed to bridge the reclycerview
* */
class AddChoiceAdapter(val listOfChoices: List<String>): RecyclerView.Adapter<AddChoiceAdapter.ViewHolder>() {

    // Inflating(create) the layout from the xml file and return the holder 
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(android.R.layout.simple_expandable_list_item_1, parent, false)

        return ViewHolder(contactView)
    }

    // Populate layout inside viewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = listOfChoices[position]

        holder.textView.text = item
    }

    override fun getItemCount(): Int {
        return listOfChoices.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        // Store references to elements in the layout view
        val textView: TextView

        init{
            textView = itemView.findViewById(android.R.id.text1)
        }

    }
}