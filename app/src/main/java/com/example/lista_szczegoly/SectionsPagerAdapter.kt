package com.example.lista_szczegoly

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import android.content.Context

class SectionsPagerAdapter(fm: FragmentManager, private val context: Context) : FragmentPagerAdapter(fm) {
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> context.resources.getString(R.string.home_tab)
            1 -> context.resources.getString(R.string.kat1_tab)
            2 -> context.resources.getString(R.string.kat2_tab)
            else -> null
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ListDetailsListFragment()
            1 -> Tab1Fragment()
            2 -> Tab2Fragment()
            else -> Fragment()
        }
    }
}