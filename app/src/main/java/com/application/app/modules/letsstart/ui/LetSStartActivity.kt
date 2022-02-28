package com.application.app.modules.letsstart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLetSStartBinding
import com.application.app.modules.letsstart.`data`.viewmodel.LetSStartVM
import kotlin.String
import kotlin.Unit

public class LetSStartActivity :
    BaseActivity<ActivityLetSStartBinding>(R.layout.activity_let_s_start) {
  private val viewModel: LetSStartVM by viewModels<LetSStartVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.letSStartVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LET_S_START_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LetSStartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
