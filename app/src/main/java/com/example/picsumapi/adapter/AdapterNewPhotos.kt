package com.example.picsumapi.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.picsumapi.databinding.ItemRecyclerViewNewPhotosBinding
import com.example.picsumapi.model.ResponseNewPhotos

class AdapterNewPhotos() : RecyclerView.Adapter<AdapterNewPhotos.ViewHolder>() {

    //binding =>
    private lateinit var binding: ItemRecyclerViewNewPhotosBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNewPhotos.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ItemRecyclerViewNewPhotosBinding.inflate(inflater, parent, false)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: AdapterNewPhotos.ViewHolder, position: Int) {
        holder.bindData(differ.currentList[position])
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    inner class ViewHolder() : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bindData(item: ResponseNewPhotos.ResponseNewPhotosItem) {
            binding.apply {

                txtUsername.text = "@${item.user?.instagramUsername}"
                profileImage.load(item.user?.profileImage?.medium)
                txtLocation.text = item.user?.location
                txtTotalCollections.text = item.user?.totalCollections.toString()
                txtTotalPhotos.text = item.user?.totalPhotos.toString()
                txtTotalLikes.text = item.user?.totalLikes.toString()
                txtIdPhoto.text = item.id
                imgMain.load(item.urls?.regular)
                txtLikes.text = item.likes.toString()
                txtDescription.text = item.altDescription
                txtCreatedAt.text = item.createdAt
                txtName.text = item.user?.name

            }
        }
    }

    private val differCallBack =
        object : DiffUtil.ItemCallback<ResponseNewPhotos.ResponseNewPhotosItem>() {
            override fun areItemsTheSame(
                oldItem: ResponseNewPhotos.ResponseNewPhotosItem,
                newItem: ResponseNewPhotos.ResponseNewPhotosItem
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: ResponseNewPhotos.ResponseNewPhotosItem,
                newItem: ResponseNewPhotos.ResponseNewPhotosItem
            ): Boolean {
                return oldItem == newItem
            }

        }
    val differ = AsyncListDiffer(this, differCallBack)
}