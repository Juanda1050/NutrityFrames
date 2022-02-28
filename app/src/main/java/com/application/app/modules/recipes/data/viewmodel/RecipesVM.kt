package com.application.app.modules.recipes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.recipes.`data`.model.Recipes1RowModel
import com.application.app.modules.recipes.`data`.model.RecipesModel
import kotlin.collections.MutableList

public class RecipesVM : ViewModel() {
  public val recipesModel: MutableLiveData<RecipesModel> = MutableLiveData(RecipesModel())

  public var navArguments: Bundle? = null

  public val recyclerRecipesList: MutableLiveData<MutableList<Recipes1RowModel>> =
      MutableLiveData(mutableListOf())
}
