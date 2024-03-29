package com.example.lista_szczegoly

import android.R
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.ListFragment

class ListDetailsListFragment : ListFragment() {
    interface Listener {
        fun itemClicked(id: Int)
    }

    private var listener: Listener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val names = Array(HikingTrails.trails.size) { i -> HikingTrails.trails[i].getName() }
        val adapter = ArrayAdapter(inflater.context, R.layout.simple_list_item_1, names)
        listAdapter = adapter
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Listener) {
            this.listener = context
        }
    }

    override fun onListItemClick(listView: ListView, itemView: View, position: Int, id: Long) {
        listener?.itemClicked(id.toInt())
    }
}