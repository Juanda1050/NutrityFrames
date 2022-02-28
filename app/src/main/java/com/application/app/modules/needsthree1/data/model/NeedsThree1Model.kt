package com.application.app.modules.needsthree1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class NeedsThree1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtYaCasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_ya_casi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEsVegano: String? = MyApp.getInstance().resources.getString(R.string.lbl_es_vegano)

)
