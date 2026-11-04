package com.ferran.recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ferran.recycleview.databinding.CardViewDesignBinding
class Adapter(private val list: List<BocataData>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = CardViewDesignBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.binding.imageview.setImageResource(item.image)
        holder.binding.textView.text = item.nom
        holder.binding.preuView.text = item.preu
        holder.binding.descView.text = item.desc
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return list.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(val binding: CardViewDesignBinding) : RecyclerView.ViewHolder(binding.root)
}
