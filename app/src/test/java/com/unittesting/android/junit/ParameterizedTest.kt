package com.unittesting.android.junit

import com.unittesting.android.junit.Helper
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class)
class ParameterizedTest(private val input: String, private val expected: Boolean) {

    @Test
    fun test() {
        val helper = Helper()
        val result = helper.isPalindrome(input)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "{index} : {0} is palindrome - {1}")
        fun data() : List<Array<Any>> {
            return listOf(
                arrayOf("hello", false),
                arrayOf("level", true),
                arrayOf("o", true),
                arrayOf("", true),
            )
            // These values will send to ParameterizedTest() fun one by one
        }
    }

    // Note : For repetition of code try ParameterizedTest
}