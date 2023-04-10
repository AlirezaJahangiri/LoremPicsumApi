package com.example.picsumapi.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.loadAny
import com.example.picsumapi.databinding.ItemRecyclerViewBinding
import com.example.picsumapi.model.ResponseGetRandomImagesItem

class AdapterImage () :RecyclerView.Adapter<AdapterImage.ViewHolder> () {

    //binding =>
    private lateinit var binding: ItemRecyclerViewBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterImage.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ItemRecyclerViewBinding.inflate( inflater , parent , false )
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: AdapterImage.ViewHolder, position: Int) {
        holder.bindData(differ.currentList[position])
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    inner class ViewHolder () :RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bindData (item :ResponseGetRandomImagesItem) {
            binding.imgMain.load(item.downloadUrl)
            binding.txtAuthor.text = "Photo By ${item.author}"
        }

    }

    private val differCallBack = object :DiffUtil.ItemCallback<ResponseGetRandomImagesItem> () {
        override fun areItemsTheSame(oldItem: ResponseGetRandomImagesItem, newItem: ResponseGetRandomImagesItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ResponseGetRandomImagesItem, newItem: ResponseGetRandomImagesItem): Boolean {
            return oldItem == newItem
        }

    }

     val differ = AsyncListDiffer(this , differCallBack)

}