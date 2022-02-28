package com.application.app.modules.needsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.needsone.`data`.model.NeedsOne1RowModel
import com.application.app.modules.needsone.`data`.model.NeedsOneModel
import kotlin.collections.MutableList

public class NeedsOneVM : ViewModel() {
  public val needsOneModel: MutableLiveData<NeedsOneModel> = MutableLiveData(NeedsOneModel())

  public var navArguments: Bundle? = null

  public val recyclerNeedsOneList: MutableLiveData<MutableList<NeedsOne1RowModel>> =
      MutableLiveData(mutableListOf())
}
