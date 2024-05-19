package com.example.lista_szczegoly

import androidx.fragment.app.Fragment

class SunsetActivity : SingleFragmentActivity() {
    override fun createFragment(): Fragment {
        return SunsetFragment.newInstance()
    }
}
