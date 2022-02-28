package com.application.app.modules.start.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class StartModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNutricinHecha: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nutrici_n_hecha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescubreUnPla: String? =
      MyApp.getInstance().resources.getString(R.string.msg_descubre_un_pla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYaTienesCuen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ya_tienes_cuen)

)
