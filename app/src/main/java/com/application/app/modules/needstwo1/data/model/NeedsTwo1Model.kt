package com.application.app.modules.needstwo1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class NeedsTwo1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSobreTi: String? = MyApp.getInstance().resources.getString(R.string.lbl_sobre_ti)

)
