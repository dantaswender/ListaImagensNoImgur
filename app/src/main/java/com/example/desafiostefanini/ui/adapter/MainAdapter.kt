package com.example.desafiostefanini.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiostefanini.R
import com.example.desafiostefanini.model.Data
import com.example.desafiostefanini.model.Image
import com.squareup.picasso.Picasso

class MainAdapter(
    private val context: Context,
    private val dataImages: MutableList<Data> = mutableListOf()
) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflateLayout =
            LayoutInflater.from(context).inflate(R.layout.item_image, parent, false)
        return MainViewHolder(inflateLayout)
    }

    override fun getItemCount() = dataImages.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.showImages(dataImages[position])
    }

    fun updateAdapter(value: List<Data>) {
        notifyItemRangeRemoved(0, this.dataImages.size)
        this.dataImages.clear()
        this.dataImages.addAll(value)
        notifyItemRangeInserted(0, this.dataImages.size)
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val imageView: ImageView by lazy {
            itemView.findViewById(R.id.iv_item)
        }

        fun showImages(data: Data) {
            getImageFromUrl(data.images)
        }

        private fun getImageFromUrl(images: List<Image>?) {
            if (images != null) {
                for (i in images) {
                    Picasso.get()
                        .load(i.link)
                        .centerCrop()
                        .resize(120, 120)
                        .error(R.drawable.ic_baseline_image_not_supported_24)
                        .into(imageView);
                }
            }
        }
    }
}