package com.example.lista_szczegoly

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TRAILS_ID = "id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val frag = supportFragmentManager.findFragmentById(R.id.detail_flag) as? TrailsListDetailFragment
        val trailsId = intent.extras?.getInt(EXTRA_TRAILS_ID) ?: 0
        frag?.setTrailsId(trailsId)
    }
}