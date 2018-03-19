package com.xias.demo.todaynews.ui.watermelonvideo


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.xias.demo.todaynews.R


class WatermelonVideoFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_watermelon_video, container, false)
    }

    companion object {
        fun newInstance(): WatermelonVideoFragment {
            val fragment = WatermelonVideoFragment()
            return fragment
        }
    }

}
