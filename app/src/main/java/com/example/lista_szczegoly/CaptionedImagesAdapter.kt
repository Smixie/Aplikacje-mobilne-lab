package com.example.lista_szczegoly

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class CaptionedImagesAdapter(private var captions: Array<String>, private var imageIds: IntArray) :
    RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder>() {
        private var listener: Listener? = null

    fun interface Listener {
        fun onClick(position: Int)
    }

    fun setListener(listener: Listener) {
        this.listener = listener
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cardView = holder.cardView
        val imageView = cardView.findViewById<ImageView>(R.id.info_image)
        val drawable = ContextCompat.getDrawable(cardView.context, imageIds[position])
        imageView.setImageDrawable(drawable)

        imageView.contentDescription = captions[position]
        val textView = cardView.findViewById<TextView>(R.id.info_text)
        textView.text = captions[position]

        cardView.setOnClickListener(View.OnClickListener {
            listener?.onClick(position)
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val cv = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_captioned_image, parent, false) as CardView
        return ViewHolder(cv)
    }

    override fun getItemCount(): Int {
        return captions.size
    }

    class ViewHolder(val cardView: CardView) : RecyclerView.ViewHolder(cardView)

}