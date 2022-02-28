package com.application.app.modules.letsstart.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LetSStartModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreaUnaCuenta: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_crea_una_cuenta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRegstrate: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reg_strate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNutrity2022: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_nutrity_2022)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etContinuarConGValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etContinuarConCValue: String? = null
)
