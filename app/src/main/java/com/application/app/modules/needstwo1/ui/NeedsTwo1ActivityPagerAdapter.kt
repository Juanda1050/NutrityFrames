package com.application.app.modules.needstwo1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import com.application.app.modules.needstwo.ui.NeedsTwoFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class NeedsTwo1ActivityPagerAdapter(
    public val fragmentManager: FragmentManager,
    public val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    public override fun getItemCount(): Int = viewPages.size

    public override fun createFragment(position: Int): Fragment = viewPages[position]

    public companion object AdapterConstant {
        public val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_mujer),MyApp.getInstance().resources.getString(R.string.lbl_hombre))

        public val viewPages: List<Fragment> = listOf(NeedsTwoFragment(),NeedsTwoFragment())

    }
}
