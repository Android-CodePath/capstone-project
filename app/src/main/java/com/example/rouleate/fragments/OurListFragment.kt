package com.example.rouleate.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rouleate.AddChoiceAdapter
import com.example.rouleate.DataModel
import com.example.rouleate.ImageAdapter
import com.example.rouleate.R


class OurListFragment : Fragment() {

    private var dataList = mutableListOf<DataModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_our_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Find RecyclerView Layout
        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_our_list)

        // Create adapter class
        val adapter = ImageAdapter(dataList)

        // Attach adapter to the recyclerview to populate choices
        recyclerView.adapter = adapter

        // Set the layout manager
        recyclerView.layoutManager = GridLayoutManager(context,2) // would context work?

        dataList.add(DataModel("Burgers", R.drawable.burger_pic))
        dataList.add(DataModel("Fried Rice", R.drawable.friedrice_pic))
        dataList.add(DataModel("Pizza", R.drawable.pizza_pic))
        dataList.add(DataModel("Ramen", R.drawable.ramen_pic))
        dataList.add(DataModel("Sushi", R.drawable.sushi_pic))
        dataList.add(DataModel("Tacos", R.drawable.tacos_pic))

        adapter.setDataList(dataList)
    }

}