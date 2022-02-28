package com.application.app.modules.feed.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Feed2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtHuevo: String? = MyApp.getInstance().resources.getString(R.string.lbl_huevo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2Unidades: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_2_unidades)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt157Kcal: String? = MyApp.getInstance().resources.getString(R.string.lbl_157_kcal)

)
