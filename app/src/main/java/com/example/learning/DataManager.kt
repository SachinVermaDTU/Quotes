package com.example.learning

import android.content.Context
import com.example.learning.data.Pages
import com.example.learning.data.quotes
import com.google.gson.Gson

object DataManager {
    var data  = emptyArray<quotes>()
    var isLoad = false
    var currentPage: quotes? = null
    var page = Pages.Listing
    fun loadAssetsFromFile(context: Context){
        val inputStream = context.assets.open("quotes.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer , Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json , Array<quotes>::class.java)
        isLoad = true
    }

    fun switchPages(qout: quotes?){
        if(page == Pages.Listing){
            currentPage = qout
            page = Pages.Details
        }
        else{
            page = Pages.Listing
        }
    }
}