package com.example.sprint10_webinar

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Header(val name:String)
class HeaderViewHolder(parentView: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parentView.context).inflate(R.layout.v_header, parentView, false)
) {

    private val text: TextView = itemView.findViewById(R.id.text)

    fun bind(element: Header) {
        text.text = element.name
    }
}
