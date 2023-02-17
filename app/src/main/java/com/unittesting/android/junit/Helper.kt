package com.unittesting.android.junit

class Helper {

    fun isPalindrome(input: String) : Boolean {
        var i = 0
        var j = input.length -1
        var result = true

        while (i < j) {
            if (input[i] != input[j]) {
                result = false
                break
            }
            i++
            j--
        }
        return result
    }

    fun validatePassword(password: String) : Boolean {
        if (password.isEmpty())
            return false

        if (password.length !in 6..15)
            return false

        return true
    }

    fun reverseString(input: String) : String {
        var chars = input.toCharArray()
        var i = 0
        var j = chars.size -1

        while (i < j) {
            val temp = chars[i]
            chars[i] = chars[j]
            chars[j] = temp
            i++
            j--
        }
        return chars.joinToString("")
    }
}