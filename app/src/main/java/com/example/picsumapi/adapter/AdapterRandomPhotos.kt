package com.example.picsumapi.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.picsumapi.databinding.ItemRecyclerViewBinding
import com.example.picsumapi.model.ResponseRandomPhotos

class AdapterRandomPhotos() : RecyclerView.Adapter<AdapterRandomPhotos.ViewHolder>() {

    //binding =>
    private lateinit var binding: ItemRecyclerViewBinding

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterRandomPhotos.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ItemRecyclerViewBinding.inflate(inflater, parent, false)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: AdapterRandomPhotos.ViewHolder, position: Int) {
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
        fun bindData(item: ResponseRandomPhotos.ResponseRandomPhotosItem) {


            binding.apply {

                txtUsername.text = "@${item.user?.instagramUsername}"
                profileImage.load(item.user?.profileImage?.medium)
                txtLocation.text = item.user?.location
                txtTotalCollections.text = item.user?.totalCollections.toString()
                txtTotalPhotos.text = item.user?.totalPhotos.toString()
                txtTotalLikes.text = item.user?.totalLikes.toString()
                txtIdPhoto.text = item.id
                imgMain.load(item.urls?.regular)
                txtViews.text = item.views.toString()
                txtLikes.text = item.likes.toString()
                txtDownloads.text = item.downloads.toString()
                txtDescription.text = item.altDescription
                txtCreatedAt.text = item.createdAt
                txtName.text = item.user?.name

            }


        }

    }

    private val differCallBack =
        object : DiffUtil.ItemCallback<ResponseRandomPhotos.ResponseRandomPhotosItem>() {
            override fun areItemsTheSame(
                oldItem: ResponseRandomPhotos.ResponseRandomPhotosItem,
                newItem: ResponseRandomPhotos.ResponseRandomPhotosItem
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: ResponseRandomPhotos.ResponseRandomPhotosItem,
                newItem: ResponseRandomPhotos.ResponseRandomPhotosItem
            ): Boolean {
                return oldItem == newItem
            }

        }

    val differ = AsyncListDiffer(this, differCallBack)

}