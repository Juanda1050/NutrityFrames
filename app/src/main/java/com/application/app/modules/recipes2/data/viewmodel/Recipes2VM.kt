package com.application.app.modules.recipes2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.recipes2.`data`.model.Recipes2Model
import com.application.app.modules.recipes2.`data`.model.Recipes3RowModel
import kotlin.collections.MutableList

public class Recipes2VM : ViewModel() {
  public val recipes2Model: MutableLiveData<Recipes2Model> = MutableLiveData(Recipes2Model())

  public var navArguments: Bundle? = null

  public val recyclerRecipesList: MutableLiveData<MutableList<Recipes3RowModel>> =
      MutableLiveData(mutableListOf())
}
