package com.application.app.modules.recipes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowRecipes1Binding
import com.application.app.modules.recipes.`data`.model.Recipes1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerRecipesAdapter(
  public var list: List<Recipes1RowModel>
) : RecyclerView.Adapter<RecyclerRecipesAdapter.RowRecipes1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRecipes1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_recipes1,parent,false)
    return RowRecipes1VH(view)
  }

  public override fun onBindViewHolder(holder: RowRecipes1VH, position: Int): Unit {
    val recipes1RowModel = Recipes1RowModel()
    // TODO uncomment following line after integration with data source
    // val recipes1RowModel = list[position]
    holder.binding.recipes1RowModel = recipes1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Recipes1RowModel>): Unit {
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
      item: Recipes1RowModel
    ): Unit {
    }
  }

  public inner class RowRecipes1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowRecipes1Binding = RowRecipes1Binding.bind(itemView)
  }
}
