package com.application.app.modules.needstwo1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityNeedsTwo1Binding
import com.application.app.modules.needstwo1.`data`.viewmodel.NeedsTwo1VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

public class NeedsTwo1Activity :
    BaseActivity<ActivityNeedsTwo1Binding>(R.layout.activity_needs_two1) {
  private val viewModel: NeedsTwo1VM by viewModels<NeedsTwo1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.needsTwo1VM = viewModel
    val adapter = NeedsTwo1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup56.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup5,binding.viewPagerGroup56) { tab, position ->
      tab.text = NeedsTwo1ActivityPagerAdapter.title[position]
      }.attach()
    }

    public override fun setUpClicks(): Unit {
    }

    public companion object {
      public const val TAG: String = "NEEDS_TWO1ACTIVITY"

      public fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, NeedsTwo1Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
