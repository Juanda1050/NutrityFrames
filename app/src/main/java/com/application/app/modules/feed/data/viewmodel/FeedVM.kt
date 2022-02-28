package com.application.app.modules.feed.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.feed.`data`.model.Feed1RowModel
import com.application.app.modules.feed.`data`.model.Feed2RowModel
import com.application.app.modules.feed.`data`.model.FeedModel
import kotlin.collections.MutableList

public class FeedVM : ViewModel() {
  public val feedModel: MutableLiveData<FeedModel> = MutableLiveData(FeedModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup18List: MutableLiveData<MutableList<Feed1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup176List: MutableLiveData<MutableList<Feed2RowModel>> =
      MutableLiveData(mutableListOf())
}
