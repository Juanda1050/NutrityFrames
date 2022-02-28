package com.application.app.modules.feed.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowFeed1Binding
import com.application.app.modules.feed.`data`.model.Feed1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup18Adapter(
  public var list: List<Feed1RowModel>
) : RecyclerView.Adapter<RecyclerGroup18Adapter.RowFeed1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFeed1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_feed1,parent,false)
    return RowFeed1VH(view)
  }

  public override fun onBindViewHolder(holder: RowFeed1VH, position: Int): Unit {
    val feed1RowModel = Feed1RowModel()
    // TODO uncomment following line after integration with data source
    // val feed1RowModel = list[position]
    holder.binding.feed1RowModel = feed1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Feed1RowModel>): Unit {
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
      item: Feed1RowModel
    ): Unit {
    }
  }

  public inner class RowFeed1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowFeed1Binding = RowFeed1Binding.bind(itemView)
  }
}
