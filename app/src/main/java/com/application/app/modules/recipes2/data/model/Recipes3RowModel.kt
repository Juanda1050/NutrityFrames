package com.application.app.modules.recipes2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Recipes3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSushi: String? = MyApp.getInstance().resources.getString(R.string.lbl_sushi)

)
