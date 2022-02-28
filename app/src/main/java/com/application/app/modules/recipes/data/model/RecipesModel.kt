package com.application.app.modules.recipes.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class RecipesModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRecetas: String? = MyApp.getInstance().resources.getString(R.string.lbl_recetas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRecetasParaCa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recetas_para_ca)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etBuscarValue: String? = null
)
