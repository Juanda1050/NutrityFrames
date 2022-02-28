package com.application.app.modules.configuracin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.configuracin.`data`.model.ConfiguraciNModel

public class ConfiguraciNVM : ViewModel() {
  public val configuraciNModel: MutableLiveData<ConfiguraciNModel> =
      MutableLiveData(ConfiguraciNModel())

  public var navArguments: Bundle? = null
}
