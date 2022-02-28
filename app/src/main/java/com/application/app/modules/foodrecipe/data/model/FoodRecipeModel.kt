package com.application.app.modules.foodrecipe.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class FoodRecipeModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSushi: String? = MyApp.getInstance().resources.getString(R.string.lbl_sushi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSushi1: String? = MyApp.getInstance().resources.getString(R.string.lbl_sushi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContenidoNutri: String? =
      MyApp.getInstance().resources.getString(R.string.msg_contenido_nutri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIngredientes: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ingredientes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt5TazasDeAgua: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_5_tazas_de_agua)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4TazasDeArro: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4_tazas_de_arro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2PaquetesDeA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2_paquetes_de_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt60GramosDeAz: String? =
      MyApp.getInstance().resources.getString(R.string.msg_60_gramos_de_az)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt12TazasDeVi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_2_tazas_de_vi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt30GramosDeSa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_30_gramos_de_sa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt250GramosDeA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_250_gramos_de_a)

)
