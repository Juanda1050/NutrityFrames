package com.application.app.modules.needsone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class NeedsOne1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtBajarPeso: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bajar_peso)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMaximizaLaPr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_maximiza_la_p_r)

)
