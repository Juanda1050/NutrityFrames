package com.application.app.modules.login.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtIniciarSesin: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_iniciar_sesi_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBienvenidoDe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bienvenido_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOlvidMiContr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_olvid_mi_contr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNoTienesCuen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_tienes_cuen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etContraseaValue: String? = null
)
