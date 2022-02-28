package com.application.app.modules.needstwo.ui

import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentNeedsTwoBinding
import com.application.app.modules.needstwo.`data`.viewmodel.NeedsTwoVM
import kotlin.String
import kotlin.Unit

public class NeedsTwoFragment : BaseFragment<FragmentNeedsTwoBinding>(R.layout.fragment_needs_two) {
  private val viewModel: NeedsTwoVM by viewModels<NeedsTwoVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.needsTwoVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "NEEDS_TWO_FRAGMENT"
  }
}
