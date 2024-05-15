package com.example.lista_szczegoly

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class CaptionedImagesAdapter(captions: Array<String>, imageIds: IntArray) : RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder>() {
    private lateinit var captions: Array<String>
    private lateinit var imageIds: IntArray

    fun CaptionedImagesAdapter(captions: Array<String>, imageIds: IntArray) {
        this.captions = captions
        this.imageIds = imageIds
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cardView = holder.cardView
        val imageView = cardView.findViewById<ImageView>(R.id.info_image)
        val drawable = ContextCompat.getDrawable(cardView.context, imageIds[position])
        imageView.setImageDrawable(drawable)
        imageView.contentDescription = captions[position]
        val textView = cardView.findViewById<TextView>(R.id.info_text)
        textView.text = captions[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val cv = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_captioned_image, parent, false)
        return ViewHolder(cv)
    }

    override fun getItemCount(): Int {
        return captions.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cardView: CardView = itemView as CardView
        constructor(v: CardView) : this(v as View) {
            cardView = v
        }
    }

}