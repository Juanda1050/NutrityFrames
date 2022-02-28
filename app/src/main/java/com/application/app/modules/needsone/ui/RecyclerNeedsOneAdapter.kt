package com.application.app.modules.needsone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowNeedsOne1Binding
import com.application.app.modules.needsone.`data`.model.NeedsOne1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerNeedsOneAdapter(
  public var list: List<NeedsOne1RowModel>
) : RecyclerView.Adapter<RecyclerNeedsOneAdapter.RowNeedsOne1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNeedsOne1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_needs_one1,parent,false)
    return RowNeedsOne1VH(view)
  }

  public override fun onBindViewHolder(holder: RowNeedsOne1VH, position: Int): Unit {
    val needsOne1RowModel = NeedsOne1RowModel()
    // TODO uncomment following line after integration with data source
    // val needsOne1RowModel = list[position]
    holder.binding.needsOne1RowModel = needsOne1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NeedsOne1RowModel>): Unit {
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
      item: NeedsOne1RowModel
    ): Unit {
    }
  }

  public inner class RowNeedsOne1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowNeedsOne1Binding = RowNeedsOne1Binding.bind(itemView)
  }
}
