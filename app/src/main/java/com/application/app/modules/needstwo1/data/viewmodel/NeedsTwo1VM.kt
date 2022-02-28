package com.application.app.modules.needstwo1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.needstwo1.`data`.model.NeedsTwo1Model

public class NeedsTwo1VM : ViewModel() {
  public val needsTwo1Model: MutableLiveData<NeedsTwo1Model> = MutableLiveData(NeedsTwo1Model())

  public var navArguments: Bundle? = null
}
