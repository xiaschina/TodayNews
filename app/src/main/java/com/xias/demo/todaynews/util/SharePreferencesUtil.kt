package com.xias.demo.todaynews.util

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by XIAS on 2018/3/19.
 */
class SharePreferencesUtil(var context: Context){
    private val SP_NAME = "TODAYNEWS"
    private val MODE = Context.MODE_PRIVATE
    var sharePreferences: SharedPreferences? = context.getSharedPreferences(SP_NAME, MODE)
    var editor: SharedPreferences.Editor? = sharePreferences!!.edit()

    fun saveString(key: String?, value: String?): Boolean {
        editor!!.putString(key, value)
        return editor!!.commit()
    }

    fun readString(key: String?): String {
        return sharePreferences!!.getString(key, "")
    }

    fun saveBoolean(key: String?, value: Boolean): Boolean {
        editor!!.putBoolean(key, value)
        return editor!!.commit()
    }

    fun readBoolean(key: String?, value: Boolean): Boolean {
        return sharePreferences!!.getBoolean(key, value)
    }

}