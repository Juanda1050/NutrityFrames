package com.application.app.modules.start.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.start.`data`.model.StartModel

public class StartVM : ViewModel() {
  public val startModel: MutableLiveData<StartModel> = MutableLiveData(StartModel())

  public var navArguments: Bundle? = null
}
