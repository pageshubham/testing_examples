package com.unittesting.android.junit

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import com.unittesting.android.junit.QuoteManager
import org.junit.Assert.*

import org.junit.Test
import java.io.FileNotFoundException

class QuoteManagerTest {

    /*@Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }*/

    @Test(expected = FileNotFoundException::class)
    fun loadQuotesFromAssets() {
        // Arrange
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        // Act
        quoteManager.loadQuotesFromAssets(context, "")
        // Assert
    }

    @Test(expected = JsonSyntaxException::class)
    fun loadQuotesFromAssets_InvalidJson_expectedException() {
        // Arrange
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        // Act
        quoteManager.loadQuotesFromAssets(context, "malformed.json")
        // Assert
    }

    @Test
    fun loadQuotesFromAssets_ValidJson_expectedCount() {
        // Arrange
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        // Act
        quoteManager.loadQuotesFromAssets(context, "quotes.json")
        // Assert
        assertEquals(6, quoteManager.quotesList.size)
    }
}