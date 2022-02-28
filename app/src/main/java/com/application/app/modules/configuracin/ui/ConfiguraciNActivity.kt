package com.application.app.modules.configuracin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityConfiguraciNBinding
import com.application.app.modules.configuracin.`data`.viewmodel.ConfiguraciNVM
import kotlin.String
import kotlin.Unit

public class ConfiguraciNActivity :
    BaseActivity<ActivityConfiguraciNBinding>(R.layout.activity_configuraci_n) {
  private val viewModel: ConfiguraciNVM by viewModels<ConfiguraciNVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.configuraciNVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CONFIGURACI_N_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConfiguraciNActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
