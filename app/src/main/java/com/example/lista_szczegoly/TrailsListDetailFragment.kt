package com.example.lista_szczegoly

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentTransaction

class TrailsListDetailFragment : Fragment() {
    private var trailId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            Log.i("obrot","obrot")
            val stoper = StoperFragment()
            val ft = childFragmentManager.beginTransaction()
            ft.add(R.id.stoper_container, stoper)
            ft.addToBackStack(null)
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            ft.commit()
        } else {
            trailId = savedInstanceState.getInt("trailId")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_detail, container, false)
    }

    fun setTrailsId(id: Int) {
        this.trailId = id
    }

    override fun onStart() {
        super.onStart()
        val view = view

        if (view != null) {
            val title = view.findViewById<TextView>(R.id.textTitle)
            val trails = HikingTrails.trails[trailId]
            title.text = trails.getName()
            val description = view.findViewById<TextView>(R.id.list_details)
            description.text = trails.getDescription()
            description.movementMethod = LinkMovementMethod.getInstance()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("trailId", trailId)
        super.onSaveInstanceState(outState)
    }
}