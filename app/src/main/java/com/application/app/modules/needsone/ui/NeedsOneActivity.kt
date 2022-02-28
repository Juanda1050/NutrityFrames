package com.application.app.modules.needsone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityNeedsOneBinding
import com.application.app.modules.needsone.`data`.model.NeedsOne1RowModel
import com.application.app.modules.needsone.`data`.viewmodel.NeedsOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NeedsOneActivity : BaseActivity<ActivityNeedsOneBinding>(R.layout.activity_needs_one) {
  private val viewModel: NeedsOneVM by viewModels<NeedsOneVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerNeedsOneAdapter =
    RecyclerNeedsOneAdapter(viewModel.recyclerNeedsOneList.value?:mutableListOf())
    binding.recyclerNeedsOne.adapter = recyclerNeedsOneAdapter
    recyclerNeedsOneAdapter.setOnItemClickListener(
    object : RecyclerNeedsOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NeedsOne1RowModel) {
        onClickRecyclerNeedsOne(view, position, item)
      }
    }
    )
    viewModel.recyclerNeedsOneList.observe(this) {
      recyclerNeedsOneAdapter.updateData(it)
    }
    binding.needsOneVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerNeedsOne(
    view: View,
    position: Int,
    item: NeedsOne1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "NEEDS_ONE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NeedsOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
