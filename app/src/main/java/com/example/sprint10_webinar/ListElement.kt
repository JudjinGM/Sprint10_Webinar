package com.example.sprint10_webinar

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

data class ListElement(
    val id: String,
    val name: String,
    @ColorInt
    val color: Int
) {
    companion object {
        fun createRandomElement(id: String): ListElement {
            return ListElement(
                id = id,
                name = "ListElement $id",
                color = Color.HSVToColor(arrayOf(Random.nextFloat().times(360), 1.0f, 1.0f).toFloatArray())
            )
        }
    }
}

class ListElementViewHolder(parentView: ViewGroup): RecyclerView.ViewHolder(
    LayoutInflater.from(parentView.context).inflate(R.layout.v_list_element, parentView, false)
) {
    private val image: View = itemView.findViewById(R.id.image)
    private val text: TextView = itemView.findViewById(R.id.text)

    fun bind(element: ListElement){
        image.setBackgroundColor(element.color)
        text.text = element.name
    }
}