package com.application.app.modules.needsthree.ui

import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentNeedsThreeBinding
import com.application.app.modules.needsthree.`data`.viewmodel.NeedsThreeVM
import kotlin.String
import kotlin.Unit

public class NeedsThreeFragment :
    BaseFragment<FragmentNeedsThreeBinding>(R.layout.fragment_needs_three) {
  private val viewModel: NeedsThreeVM by viewModels<NeedsThreeVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.needsThreeVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "NEEDS_THREE_FRAGMENT"
  }
}
