package com.unittesting.android.junit

import com.unittesting.android.junit.Helper
import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

    lateinit var helper: Helper

    @Before
    fun setUp() {
        helper = Helper()
        println("Before every test cases")
    }

    @After
    fun tearDown() {
        println("After every test cases")
    }

    @Test
    fun isPalindrome_inputString_hello_expectedFalse() {
        // Act
        val result = helper.isPalindrome("hello")
        // Assert
        assertEquals(false, result)
    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {
        // Arrange
        /*val helper = Helper()*/
        // Act
        val result = helper.isPalindrome("level")
        // Assert
        assertEquals(true, result)
    }

    @Test
    fun validatePassword() {
        val result = helper.validatePassword("pass@123")
        assertEquals(true, result)
    }

    @Test
    fun reverseString() {
        val result = helper.reverseString("abc")
        assertEquals("cba", result)
    }

    // Note : For repetition of code try ParameterizedTest

}