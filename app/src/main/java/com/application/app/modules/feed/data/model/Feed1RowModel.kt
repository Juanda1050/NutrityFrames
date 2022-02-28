package com.application.app.modules.feed.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Feed1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtProtenas: String? = MyApp.getInstance().resources.getString(R.string.lbl_prote_nas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt27122G: String? = MyApp.getInstance().resources.getString(R.string.lbl_27_122_g)

)
