package com.application.app.modules.needsthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.needsthree.`data`.model.NeedsThreeModel

public class NeedsThreeVM : ViewModel() {
  public val needsThreeModel: MutableLiveData<NeedsThreeModel> = MutableLiveData(NeedsThreeModel())

  public var navArguments: Bundle? = null
}
