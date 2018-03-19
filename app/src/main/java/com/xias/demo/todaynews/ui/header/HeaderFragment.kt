package com.xias.demo.todaynews.ui.header


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.xias.demo.todaynews.R


class HeaderFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_header, container, false)
    }

    companion object {
        // TODO: Rename and change types and number of parameters
        fun newInstance(): HeaderFragment {
            val fragment = HeaderFragment()
            return fragment
        }
    }

}// Required empty public constructor
