package com.application.app.modules.preview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPreviewBinding
import com.application.app.modules.preview.`data`.viewmodel.PreviewVM
import kotlin.String
import kotlin.Unit

public class PreviewActivity : BaseActivity<ActivityPreviewBinding>(R.layout.activity_preview) {
  private val viewModel: PreviewVM by viewModels<PreviewVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.previewVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "PREVIEW_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PreviewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
