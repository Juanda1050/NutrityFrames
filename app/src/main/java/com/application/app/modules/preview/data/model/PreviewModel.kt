package com.application.app.modules.preview.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class PreviewModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtResumen: String? = MyApp.getInstance().resources.getString(R.string.lbl_resumen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtResumen1: String? = MyApp.getInstance().resources.getString(R.string.lbl_resumen)
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
  public var txt600Kg: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_0_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCalorasParaM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_calor_as_para_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2339Kcal: String? = MyApp.getInstance().resources.getString(R.string.lbl_2339_kcal)
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
  public var txt15781929Kca: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1578_1929_kca)

)
