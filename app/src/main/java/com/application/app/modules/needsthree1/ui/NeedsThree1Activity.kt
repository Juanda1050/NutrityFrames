package com.application.app.modules.needsthree1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityNeedsThree1Binding
import com.application.app.modules.needsthree1.`data`.viewmodel.NeedsThree1VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

public class NeedsThree1Activity :
    BaseActivity<ActivityNeedsThree1Binding>(R.layout.activity_needs_three1) {
  private val viewModel: NeedsThree1VM by viewModels<NeedsThree1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.needsThree1VM = viewModel
    val adapter = NeedsThree1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup70.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup12,binding.viewPagerGroup70) { tab, position ->
      tab.text = NeedsThree1ActivityPagerAdapter.title[position]
      }.attach()
    }

    public override fun setUpClicks(): Unit {
    }

    public companion object {
      public const val TAG: String = "NEEDS_THREE1ACTIVITY"

      public fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, NeedsThree1Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
