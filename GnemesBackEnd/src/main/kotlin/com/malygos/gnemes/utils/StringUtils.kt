package com.malygos.gnemes.utils

object StringUtils {
    fun getFileNameFromUrl(url:String):String{
        val split = url.split("/")
        return split.last()
    }
}