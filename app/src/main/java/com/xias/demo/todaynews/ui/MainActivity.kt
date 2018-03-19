package com.xias.demo.todaynews.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.xias.demo.todaynews.R
import com.xias.demo.todaynews.ui.header.HeaderFragment
import com.xias.demo.todaynews.ui.index.IndexFragment
import com.xias.demo.todaynews.ui.watermelonvideo.WatermelonVideoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
    }

    private fun initData() {
        rb_index.isChecked = true
        replaceFragment(IndexFragment.newInstance(), R.id.main_frame_layout)
        rb_index.setOnClickListener(this)
        rb_watermelon_video.setOnClickListener(this)
        rb_header.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.rb_index -> {
                replaceFragment(IndexFragment.newInstance(), R.id.main_frame_layout)
            }
            R.id.rb_watermelon_video -> {
                replaceFragment(WatermelonVideoFragment.newInstance(), R.id.main_frame_layout)
            }
            R.id.rb_header -> {
                replaceFragment(HeaderFragment.newInstance(), R.id.main_frame_layout)
            }
        }
    }

    fun replaceFragment(fragment: Fragment, frameId: Int) {
        supportFragmentManager.beginTransaction().replace(frameId, fragment).commit()
    }
}
