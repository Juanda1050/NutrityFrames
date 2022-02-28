package com.application.app.modules.preview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.preview.`data`.model.PreviewModel

public class PreviewVM : ViewModel() {
  public val previewModel: MutableLiveData<PreviewModel> = MutableLiveData(PreviewModel())

  public var navArguments: Bundle? = null
}
