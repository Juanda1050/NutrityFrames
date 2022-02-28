package com.application.app.modules.foodrecipe.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.foodrecipe.`data`.model.FoodRecipe1RowModel
import com.application.app.modules.foodrecipe.`data`.model.FoodRecipeModel
import kotlin.collections.MutableList

public class FoodRecipeVM : ViewModel() {
  public val foodRecipeModel: MutableLiveData<FoodRecipeModel> = MutableLiveData(FoodRecipeModel())

  public var navArguments: Bundle? = null

  public val recyclerFoodRecipeList: MutableLiveData<MutableList<FoodRecipe1RowModel>> =
      MutableLiveData(mutableListOf())
}
