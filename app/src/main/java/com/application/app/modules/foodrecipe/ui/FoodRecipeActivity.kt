package com.application.app.modules.foodrecipe.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityFoodRecipeBinding
import com.application.app.modules.foodrecipe.`data`.model.FoodRecipe1RowModel
import com.application.app.modules.foodrecipe.`data`.viewmodel.FoodRecipeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class FoodRecipeActivity :
    BaseActivity<ActivityFoodRecipeBinding>(R.layout.activity_food_recipe) {
  private val viewModel: FoodRecipeVM by viewModels<FoodRecipeVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerFoodRecipeAdapter =
    RecyclerFoodRecipeAdapter(viewModel.recyclerFoodRecipeList.value?:mutableListOf())
    binding.recyclerFoodRecipe.adapter = recyclerFoodRecipeAdapter
    recyclerFoodRecipeAdapter.setOnItemClickListener(
    object : RecyclerFoodRecipeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FoodRecipe1RowModel) {
        onClickRecyclerFoodRecipe(view, position, item)
      }
    }
    )
    viewModel.recyclerFoodRecipeList.observe(this) {
      recyclerFoodRecipeAdapter.updateData(it)
    }
    binding.foodRecipeVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerFoodRecipe(
    view: View,
    position: Int,
    item: FoodRecipe1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "FOOD_RECIPE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FoodRecipeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
