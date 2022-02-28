package com.application.app.modules.feed.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowFeed2Binding
import com.application.app.modules.feed.`data`.model.Feed2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup176Adapter(
  public var list: List<Feed2RowModel>
) : RecyclerView.Adapter<RecyclerGroup176Adapter.RowFeed2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFeed2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_feed2,parent,false)
    return RowFeed2VH(view)
  }

  public override fun onBindViewHolder(holder: RowFeed2VH, position: Int): Unit {
    val feed2RowModel = Feed2RowModel()
    // TODO uncomment following line after integration with data source
    // val feed2RowModel = list[position]
    holder.binding.feed2RowModel = feed2RowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Feed2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Feed2RowModel
    ): Unit {
    }
  }

  public inner class RowFeed2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowFeed2Binding = RowFeed2Binding.bind(itemView)
  }
}
