package com.example.lista_szczegoly

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), ListDetailsListFragment.Listener {

    private fun tabletView(id: Int) {
        val details = TrailsListDetailFragment()
        val ft = supportFragmentManager.beginTransaction()
        details.setTrailsId(id)
        ft.replace(R.id.fragment_container, details)
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        ft.addToBackStack(null)
        ft.commit()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fragmentManager = supportFragmentManager
        val fragmentContainer = findViewById<View>(R.id.fragment_container)
        if (fragmentContainer != null && HikingTrails.trails.isNotEmpty() && fragmentManager.backStackEntryCount == 0) {
            tabletView(0)
        }
    }

    override fun itemClicked(id: Int) {
        val fragmentContainer = findViewById<View>(R.id.fragment_container)
        if (fragmentContainer != null) {
            tabletView(id)
        } else {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_TRAILS_ID, id)
            startActivity(intent)
        }
    }
}