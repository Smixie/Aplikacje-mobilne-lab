package com.example.lista_szczegoly

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat


class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TRAILS_ID = "id"
    }

    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val frag = supportFragmentManager.findFragmentById(R.id.detail_flag) as? TrailsListDetailFragment
        val trailsId = intent?.extras?.getInt(EXTRA_TRAILS_ID, 0) ?: 0
        frag?.setTrailsId(trailsId)

        val trailsName = HikingTrails.trails[trailsId].getName()
//        val textView = findViewById<TextView>(R.id.trails_text)
//        textView.text = trailsName
        val trailsImage = HikingTrails.trails[trailsId].getImage()
        val imageView = findViewById<ImageView>(R.id.trails_image)
        imageView.setImageDrawable(ContextCompat.getDrawable(this, trailsImage))
        imageView.contentDescription = trailsName
    }
}