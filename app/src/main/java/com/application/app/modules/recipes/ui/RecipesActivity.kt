package com.application.app.modules.recipes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityRecipesBinding
import com.application.app.modules.recipes.`data`.model.Recipes1RowModel
import com.application.app.modules.recipes.`data`.viewmodel.RecipesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class RecipesActivity : BaseActivity<ActivityRecipesBinding>(R.layout.activity_recipes) {
  private val viewModel: RecipesVM by viewModels<RecipesVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerRecipesAdapter =
    RecyclerRecipesAdapter(viewModel.recyclerRecipesList.value?:mutableListOf())
    binding.recyclerRecipes.adapter = recyclerRecipesAdapter
    recyclerRecipesAdapter.setOnItemClickListener(
    object : RecyclerRecipesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Recipes1RowModel) {
        onClickRecyclerRecipes(view, position, item)
      }
    }
    )
    viewModel.recyclerRecipesList.observe(this) {
      recyclerRecipesAdapter.updateData(it)
    }
    binding.recipesVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerRecipes(
    view: View,
    position: Int,
    item: Recipes1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "RECIPES_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecipesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
