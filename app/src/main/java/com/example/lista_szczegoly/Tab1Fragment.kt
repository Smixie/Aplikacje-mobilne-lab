package com.example.lista_szczegoly

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tab1Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val trailsRecycler: RecyclerView = inflater.inflate(R.layout.fragment_tab1, container, false) as RecyclerView

        val captions = Array(HikingTrails.trails.size) { i -> HikingTrails.trails[i].getName() }
        val trailsImagesId =
            IntArray(HikingTrails.trails.size) { i -> HikingTrails.trails[i].getImage() }

        val adapter = CaptionedImagesAdapter(captions, trailsImagesId)
        trailsRecycler.adapter = adapter

        val layoutManager = GridLayoutManager(activity, 2)
        trailsRecycler.layoutManager = layoutManager

        adapter.setListener(CaptionedImagesAdapter.Listener() { position ->
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_TRAILS_ID, position)
            activity?.startActivity(intent)
        })

        return trailsRecycler
    }
}
