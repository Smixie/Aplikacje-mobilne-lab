package com.example.lista_szczegoly

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import androidx.recyclerview.widget.RecyclerView

class Tab1Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): RecyclerView {
        val rootView = inflater.inflate(R.layout.fragment_tab1, container, false)
        val trailsRecycler: RecyclerView = rootView.findViewById(R.id.tab1_recycler)

        val captions = Array(HikingTrails.trails.size) { i -> HikingTrails.trails[i].getName() }
        val trailsImagesId =
            IntArray(HikingTrails.trails.size) { i -> HikingTrails.trails[i].getImage() }

        val adapter = CaptionedImagesAdapter(captions, trailsImagesId)
        trailsRecycler.adapter = adapter

        return trailsRecycler

//        val adapter = ArrayAdapter(
//            inflater.context,
//            android.R.layout.simple_list_item_1,
//            resources.getStringArray(R.array.kategoria1)
//        )
//        listAdapter = adapter
 //       return super.onCreateView(inflater, container, savedInstanceState)
    }
}