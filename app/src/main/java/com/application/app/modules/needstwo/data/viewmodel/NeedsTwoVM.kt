package com.application.app.modules.needstwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.needstwo.`data`.model.NeedsTwoModel

public class NeedsTwoVM : ViewModel() {
  public val needsTwoModel: MutableLiveData<NeedsTwoModel> = MutableLiveData(NeedsTwoModel())

  public var navArguments: Bundle? = null
}
