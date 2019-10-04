package com.home.liveeventbusdemo.view.adapter

import android.graphics.Color
import android.text.SpannableStringBuilder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.text.color
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.home.liveeventbusdemo.R
import com.home.liveeventbusdemo.model.MainBean
import com.mikhaellopez.circularimageview.CircularImageView

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    interface OnMainAdapterListener {
        fun onItemClick(position: Int)
    }

    private lateinit var onMainAdapterListener: OnMainAdapterListener
    private var resultList: List<MainBean.Result>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main_recycler_view_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.circularImageView.context).load(resultList!![position].avatarImageUrl)
            .into(holder.circularImageView)
        holder.nameTextView.text = resultList!![position].name
        holder.areaTextView.text = resultList!![position].area
        holder.contentTextView.text = resultList!![position].content
        val signUpCount = SpannableStringBuilder()
            .color(Color.WHITE) {
                append(
                    holder.signUpCountTextView.context.getString(
                        R.string.activity_detail_sign_up_count
                    )
                )
            }
            .append(resultList!![position].signUpCount)
        holder.signUpCountTextView.text = signUpCount
        holder.rootLinearLayout.setOnClickListener {
            onMainAdapterListener.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return resultList!!.size
    }

    fun setPostList(postList: List<MainBean.Result>) {
        this.resultList = postList
        notifyDataSetChanged()
    }

    fun setOnMainAdapterListener(onMainAdapterListener: OnMainAdapterListener) {
        this.onMainAdapterListener = onMainAdapterListener
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val circularImageView: CircularImageView = itemView.findViewById(R.id.circular_image_view)
        val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        val areaTextView: TextView = itemView.findViewById(R.id.area_text_view)
        val contentTextView: TextView = itemView.findViewById(R.id.content_text_view)
        val signUpCountTextView: TextView = itemView.findViewById(R.id.sign_up_count_text_view)
        val rootLinearLayout: LinearLayout = itemView.findViewById(R.id.root_linear_layout)
    }
}