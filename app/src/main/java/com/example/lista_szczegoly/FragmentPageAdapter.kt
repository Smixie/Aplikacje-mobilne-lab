package com.example.lista_szczegoly

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentPageAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
        return 3
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> context.resources?.getText(R.string.home_tab)
            1 -> context.resources?.getText(R.string.kat1_tab)
            2 -> context.resources?.getText(R.string.kat2_tab)
            else -> null
        }
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> TopFragment()
            1 -> Tab1Fragment()
            2 -> Tab2Fragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}