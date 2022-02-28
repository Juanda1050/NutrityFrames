package com.application.app.modules.register.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.register.`data`.model.RegisterModel

public class RegisterVM : ViewModel() {
  public val registerModel: MutableLiveData<RegisterModel> = MutableLiveData(RegisterModel())

  public var navArguments: Bundle? = null
}
