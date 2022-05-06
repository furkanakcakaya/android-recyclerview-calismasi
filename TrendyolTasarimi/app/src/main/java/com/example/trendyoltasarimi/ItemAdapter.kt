package com.example.trendyoltasarimi

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trendyoltasarimi.databinding.ItemDesignBinding

class ItemAdapter (var mContext: Context, var items: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(binding: ItemDesignBinding) : RecyclerView.ViewHolder(binding.root) {
        var binding : ItemDesignBinding = binding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater =LayoutInflater.from(mContext)
        val binding = ItemDesignBinding.inflate(inflater, parent,false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        val b = holder.binding
        b.ivItem.setImageResource(item.image)
        b.tvName.text = item.name
        b.tvPrice.text = item.price.toString() + " TL"

        if (item.isFavorite) {
            b.ivFavorite.setImageResource(R.drawable.favorite_clip_filled)
        } else {
            b.ivFavorite.setImageResource(R.drawable.favorite_clip)
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }
}