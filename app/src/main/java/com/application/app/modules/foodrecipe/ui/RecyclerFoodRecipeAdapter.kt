package com.application.app.modules.foodrecipe.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowFoodRecipe1Binding
import com.application.app.modules.foodrecipe.`data`.model.FoodRecipe1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFoodRecipeAdapter(
  public var list: List<FoodRecipe1RowModel>
) : RecyclerView.Adapter<RecyclerFoodRecipeAdapter.RowFoodRecipe1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFoodRecipe1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_food_recipe1,parent,false)
    return RowFoodRecipe1VH(view)
  }

  public override fun onBindViewHolder(holder: RowFoodRecipe1VH, position: Int): Unit {
    val foodRecipe1RowModel = FoodRecipe1RowModel()
    // TODO uncomment following line after integration with data source
    // val foodRecipe1RowModel = list[position]
    holder.binding.foodRecipe1RowModel = foodRecipe1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FoodRecipe1RowModel>): Unit {
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
      item: FoodRecipe1RowModel
    ): Unit {
    }
  }

  public inner class RowFoodRecipe1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowFoodRecipe1Binding = RowFoodRecipe1Binding.bind(itemView)
  }
}
