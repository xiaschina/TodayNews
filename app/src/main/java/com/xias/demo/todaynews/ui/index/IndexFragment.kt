package com.xias.demo.todaynews.ui.index


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.xias.demo.todaynews.R
import com.xias.demo.todaynews.util.SharePreferencesUtil
import kotlinx.android.synthetic.main.fragment_index.view.*


class IndexFragment : Fragment(), View.OnClickListener {
    var indexView: View? = null

    companion object {
        // TODO: Rename and change types and number of parameters
        fun newInstance(): IndexFragment {
            val fragment = IndexFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        indexView = inflater!!.inflate(R.layout.fragment_index, container, false)
        initData()
        return indexView
    }

    private fun initData() {
        var temp = SharePreferencesUtil(context).readString("channel")
        var datas = mutableListOf<Fragment>()
        if (temp == null || temp == "") {
            temp = resources.getString(R.string.channel_normal)
            SharePreferencesUtil(context).saveString("channer", temp)
        }
        var titles = temp.split(";")
        for (i in titles.indices) {
            datas.add(IndexItemFragment.newInstance())
        }
        indexView!!.fragment_index_iv_mine.setOnClickListener(this)
        indexView!!.fragment_index_iv_post.setOnClickListener(this)
        indexView!!.fragment_index_ll_search.setOnClickListener(this)
        indexView!!.fragment_index_view_pager.adapter = IndexPagerAdapter(activity.supportFragmentManager, datas, titles)
        //indexView!!.fragment_index_tab.
        indexView!!.fragment_index_tab.setupWithViewPager(indexView!!.fragment_index_view_pager)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.fragment_index_iv_mine -> {
            }
            R.id.fragment_index_iv_post -> {
            }
            R.id.fragment_index_ll_search -> {
            }
        }
    }

    class IndexPagerAdapter(fm: FragmentManager?, var items: List<Fragment>?, var titles: List<String>?) : FragmentStatePagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            return items!!.get(position)
        }

        override fun getCount(): Int {
            return items!!.size
        }

        override fun getPageTitle(position: Int): CharSequence {
            return titles!!.get(position)
        }
    }
}
