package com.application.app.modules.needsthree1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.needsthree1.`data`.model.NeedsThree1Model

public class NeedsThree1VM : ViewModel() {
  public val needsThree1Model: MutableLiveData<NeedsThree1Model> =
      MutableLiveData(NeedsThree1Model())

  public var navArguments: Bundle? = null
}
