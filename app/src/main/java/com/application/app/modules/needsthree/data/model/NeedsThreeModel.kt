package com.application.app.modules.needsthree.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class NeedsThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPesoActual: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_peso_actual)
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
  public var et70KgValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var et60KgValue: String? = null
)
