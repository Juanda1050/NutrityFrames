package com.application.app.modules.foodrecipe.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class FoodRecipe1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt250Kcal: String? = MyApp.getInstance().resources.getString(R.string.lbl_250_kcal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCaloras: String? = MyApp.getInstance().resources.getString(R.string.lbl_calor_as)

)
