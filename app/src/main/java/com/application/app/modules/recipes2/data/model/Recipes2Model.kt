package com.application.app.modules.recipes2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Recipes2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRecetas: String? = MyApp.getInstance().resources.getString(R.string.lbl_recetas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtComidas: String? = MyApp.getInstance().resources.getString(R.string.lbl_comidas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etBuscarValue: String? = null
)
