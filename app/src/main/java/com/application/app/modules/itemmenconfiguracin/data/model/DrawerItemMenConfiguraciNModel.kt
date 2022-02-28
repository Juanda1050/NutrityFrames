package com.application.app.modules.itemmenconfiguracin.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DrawerItemMenConfiguraciNModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtUser: String? = MyApp.getInstance().resources.getString(R.string.lbl_user)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCalorasObjeti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_calor_as_objeti4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtConfiguracin: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_configuraci_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCerrarSesin: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cerrar_sesi_n)

)
