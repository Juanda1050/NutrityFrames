package com.application.app.modules.configuracin.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ConfiguraciNModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPerfil: String? = MyApp.getInstance().resources.getString(R.string.lbl_perfil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUser: String? = MyApp.getInstance().resources.getString(R.string.lbl_user)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTuInformacin: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tu_informaci_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCorreohotmail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_correo_hotmail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContrasea: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_contrase_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPesoActual: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_peso_actual)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt70Kg: String? = MyApp.getInstance().resources.getString(R.string.lbl_70_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPesoObjetivo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_peso_objetivo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt60Kg: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCalorasActual: String? =
      MyApp.getInstance().resources.getString(R.string.msg_calor_as_actual)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2339Kcal: String? = MyApp.getInstance().resources.getString(R.string.lbl_2339_kcal2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCalorasObjeti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_calor_as_objeti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1919Kcal: String? = MyApp.getInstance().resources.getString(R.string.lbl_1919_kcal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSexo: String? = MyApp.getInstance().resources.getString(R.string.lbl_sexo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHombre: String? = MyApp.getInstance().resources.getString(R.string.lbl_hombre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtObjetivo: String? = MyApp.getInstance().resources.getString(R.string.lbl_objetivo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBajarDePeso: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bajar_de_peso)

)
