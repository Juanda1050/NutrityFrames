package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.configuracin.ui.ConfiguraciNActivity
import com.application.app.modules.feed.ui.FeedActivity
import com.application.app.modules.foodrecipe.ui.FoodRecipeActivity
import com.application.app.modules.letsstart.ui.LetSStartActivity
import com.application.app.modules.login.ui.LoginActivity
import com.application.app.modules.needsone.ui.NeedsOneActivity
import com.application.app.modules.needsthree1.ui.NeedsThree1Activity
import com.application.app.modules.needstwo1.ui.NeedsTwo1Activity
import com.application.app.modules.preview.ui.PreviewActivity
import com.application.app.modules.recipes.ui.RecipesActivity
import com.application.app.modules.recipes2.ui.Recipes2Activity
import com.application.app.modules.register.ui.RegisterActivity
import com.application.app.modules.start.ui.StartActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearPreview.setOnClickListener {
      val destIntent = PreviewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNeedsTwo.setOnClickListener {
      val destIntent = NeedsTwo1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRecipes.setOnClickListener {
      val destIntent = RecipesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRecipes1.setOnClickListener {
      val destIntent = Recipes2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNeedsOne.setOnClickListener {
      val destIntent = NeedsOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFoodRecipe.setOnClickListener {
      val destIntent = FoodRecipeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFeed.setOnClickListener {
      val destIntent = FeedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNeedsThree.setOnClickListener {
      val destIntent = NeedsThree1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearStart.setOnClickListener {
      val destIntent = StartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRegister.setOnClickListener {
      val destIntent = RegisterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearConfiguracin.setOnClickListener {
      val destIntent = ConfiguraciNActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLetsStart.setOnClickListener {
      val destIntent = LetSStartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
