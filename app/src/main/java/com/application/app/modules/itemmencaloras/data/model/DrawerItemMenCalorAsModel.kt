package com.application.app.modules.itemmencaloras.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DrawerItemMenCalorAsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtUser: String? = MyApp.getInstance().resources.getString(R.string.lbl_user)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCalorasObjeti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_calor_as_objeti3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCaloras: String? = MyApp.getInstance().resources.getString(R.string.lbl_calor_as)

)
