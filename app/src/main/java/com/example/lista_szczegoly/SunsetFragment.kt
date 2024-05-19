package com.example.lista_szczegoly

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import androidx.fragment.app.Fragment
import androidx.vectordrawable.graphics.drawable.ArgbEvaluator


class SunsetFragment : Fragment() {
    private lateinit var mSceneView: View
    private lateinit var mSunView: View
    private lateinit var mSkyView: View
    private val mBlueSkyColor = 0
    private val mSunsetSkyColor = 0
    private val mNightSkyColor = 0

    companion object {
        fun newInstance(): SunsetFragment {
            return SunsetFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_sunset, container, false)
        mSceneView = view
        mSunView = view.findViewById(R.id.sun)
        mSkyView = view.findViewById(R.id.sky)
        val resources = resources
        val mBlueSkyColor = resources.getColor(R.color.blue_sky)
        val mSunsetSkyColor = resources.getColor(R.color.sunset_sky)
        val mNightSkyColor = resources.getColor(R.color.night_sky)

        mSceneView.setOnClickListener {
            startAnimation()
        }

        return view
    }

    private fun startAnimation() {
        val sunYStart = mSunView.top.toFloat()
        val sunYEnd = mSkyView.height.toFloat()

        val heightAnimator = ObjectAnimator
            .ofFloat(mSunView, "y", sunYStart, sunYEnd)
            .setDuration(3000)
        heightAnimator.interpolator = AccelerateInterpolator()
        val sunsetSkyAnimator = ObjectAnimator
            .ofArgb(mSkyView, "backgroundColor", mBlueSkyColor, mSunsetSkyColor)
            .setDuration(3000)
        sunsetSkyAnimator.setEvaluator(android.animation.ArgbEvaluator())

        val nightSkyAnimator = ObjectAnimator
            .ofArgb(mSkyView, "backgroundColor", mSunsetSkyColor, mNightSkyColor)
            .setDuration(1500)
        nightSkyAnimator.setEvaluator(android.animation.ArgbEvaluator())
        heightAnimator.start()
        sunsetSkyAnimator.start()
        val animatorSet = AnimatorSet()
        animatorSet.play(heightAnimator).with(sunsetSkyAnimator).before(nightSkyAnimator)
        animatorSet.start()

        heightAnimator.start()
        sunsetSkyAnimator.start()
    }

}


