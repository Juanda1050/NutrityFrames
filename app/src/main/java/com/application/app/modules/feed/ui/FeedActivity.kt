package com.application.app.modules.feed.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityFeedBinding
import com.application.app.modules.feed.`data`.model.Feed1RowModel
import com.application.app.modules.feed.`data`.model.Feed2RowModel
import com.application.app.modules.feed.`data`.viewmodel.FeedVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class FeedActivity : BaseActivity<ActivityFeedBinding>(R.layout.activity_feed) {
  private val viewModel: FeedVM by viewModels<FeedVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup18Adapter =
    RecyclerGroup18Adapter(viewModel.recyclerGroup18List.value?:mutableListOf())
    binding.recyclerGroup18.adapter = recyclerGroup18Adapter
    recyclerGroup18Adapter.setOnItemClickListener(
    object : RecyclerGroup18Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Feed1RowModel) {
        onClickRecyclerGroup18(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup18List.observe(this) {
      recyclerGroup18Adapter.updateData(it)
    }
    val recyclerGroup176Adapter =
    RecyclerGroup176Adapter(viewModel.recyclerGroup176List.value?:mutableListOf())
    binding.recyclerGroup176.adapter = recyclerGroup176Adapter
    recyclerGroup176Adapter.setOnItemClickListener(
    object : RecyclerGroup176Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Feed2RowModel) {
        onClickRecyclerGroup176(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup176List.observe(this) {
      recyclerGroup176Adapter.updateData(it)
    }
    binding.feedVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup18(
    view: View,
    position: Int,
    item: Feed1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup176(
    view: View,
    position: Int,
    item: Feed2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "FEED_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FeedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
