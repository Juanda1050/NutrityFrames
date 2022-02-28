package com.application.app.modules.appnavigation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRegister: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStart: String? = MyApp.getInstance().resources.getString(R.string.lbl_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNeedsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_needs_one)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPreview: String? = MyApp.getInstance().resources.getString(R.string.lbl_preview)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLetsStart: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_let_s_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRecipes: String? = MyApp.getInstance().resources.getString(R.string.lbl_recipes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRecipes1: String? = MyApp.getInstance().resources.getString(R.string.lbl_recipes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFoodRecipe: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_food_recipe)
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
  public var txtFeed: String? = MyApp.getInstance().resources.getString(R.string.lbl_feed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNeedsTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_needs_two)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNeedsThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_needs_three)

)
