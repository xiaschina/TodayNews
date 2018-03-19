package com.xias.demo.todaynews.util

/**
 * Created by XIAS on 2018/3/19.
 */
class JsonUtil private constructor(){


    private fun JsonUtil(){
    }

    private object Holder{
        val INSTANCE = JsonUtil()
    }

    companion object {
        fun getInstance() = Holder.INSTANCE
    }


}