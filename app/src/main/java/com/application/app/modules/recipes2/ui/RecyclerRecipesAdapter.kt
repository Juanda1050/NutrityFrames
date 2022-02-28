package com.application.app.modules.recipes2.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowRecipes3Binding
import com.application.app.modules.recipes2.`data`.model.Recipes3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerRecipesAdapter(
  public var list: List<Recipes3RowModel>
) : RecyclerView.Adapter<RecyclerRecipesAdapter.RowRecipes3VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRecipes3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_recipes3,parent,false)
    return RowRecipes3VH(view)
  }

  public override fun onBindViewHolder(holder: RowRecipes3VH, position: Int): Unit {
    val recipes3RowModel = Recipes3RowModel()
    // TODO uncomment following line after integration with data source
    // val recipes3RowModel = list[position]
    holder.binding.recipes3RowModel = recipes3RowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Recipes3RowModel>): Unit {
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
      item: Recipes3RowModel
    ): Unit {
    }
  }

  public inner class RowRecipes3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowRecipes3Binding = RowRecipes3Binding.bind(itemView)
  }
}
