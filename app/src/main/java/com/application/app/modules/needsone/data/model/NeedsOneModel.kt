package com.application.app.modules.needsone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class NeedsOneModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtComencmos: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_comenc_mos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCulEsTuObj: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cu_l_es_tu_obj)

)
