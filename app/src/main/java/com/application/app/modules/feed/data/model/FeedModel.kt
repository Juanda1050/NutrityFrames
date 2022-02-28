package com.application.app.modules.feed.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class FeedModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCaloras: String? = MyApp.getInstance().resources.getString(R.string.lbl_calor_as)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLunes27Feb2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lunes_27_feb_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt9601919kcal: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_960_1919_kcal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlimentosDelD: String? =
      MyApp.getInstance().resources.getString(R.string.msg_alimentos_del_d)

)
