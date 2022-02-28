package com.application.app.modules.recipes.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Recipes1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDesayunos: String? = MyApp.getInstance().resources.getString(R.string.lbl_desayunos)

)
