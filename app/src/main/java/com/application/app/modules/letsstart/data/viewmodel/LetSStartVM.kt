package com.application.app.modules.letsstart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.letsstart.`data`.model.LetSStartModel

public class LetSStartVM : ViewModel() {
  public val letSStartModel: MutableLiveData<LetSStartModel> = MutableLiveData(LetSStartModel())

  public var navArguments: Bundle? = null
}
