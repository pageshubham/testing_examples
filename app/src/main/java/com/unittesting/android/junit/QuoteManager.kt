package com.unittesting.android.junit

import android.content.Context
import com.google.gson.Gson

class QuoteManager {

    var quotesList = emptyArray<Quote>()
    var index = 0

    fun loadQuotesFromAssets(context: Context, filename: String) {
        val inputStream = context.assets.open(filename)
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        quotesList = gson.fromJson(json,Array<Quote>::class.java)
    }

    fun getQuote() = quotesList[index]

    fun nextQuote() = quotesList[++index]

    fun previousQuote() = if (index > 0) quotesList[--index] else quotesList[index]
}