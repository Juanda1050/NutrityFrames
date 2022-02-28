package com.application.app.modules.register.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class RegisterModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRegistrarse: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_registrarse)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCrearCuenta: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_crear_cuenta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etNombreDeUsuarValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etContraseaValue: String? = null
)
