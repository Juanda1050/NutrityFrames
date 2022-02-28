package com.application.app.modules.recipes2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityRecipes2Binding
import com.application.app.modules.recipes2.`data`.model.Recipes3RowModel
import com.application.app.modules.recipes2.`data`.viewmodel.Recipes2VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Recipes2Activity : BaseActivity<ActivityRecipes2Binding>(R.layout.activity_recipes2) {
  private val viewModel: Recipes2VM by viewModels<Recipes2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerRecipesAdapter =
    RecyclerRecipesAdapter(viewModel.recyclerRecipesList.value?:mutableListOf())
    binding.recyclerRecipes.adapter = recyclerRecipesAdapter
    recyclerRecipesAdapter.setOnItemClickListener(
    object : RecyclerRecipesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Recipes3RowModel) {
        onClickRecyclerRecipes(view, position, item)
      }
    }
    )
    viewModel.recyclerRecipesList.observe(this) {
      recyclerRecipesAdapter.updateData(it)
    }
    binding.recipes2VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerRecipes(
    view: View,
    position: Int,
    item: Recipes3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "RECIPES2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Recipes2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
