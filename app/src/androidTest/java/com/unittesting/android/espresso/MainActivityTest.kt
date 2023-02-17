package com.unittesting.android.espresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import com.unittesting.android.R
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun testAddButton_expectedCorrectValue() {
        onView(withId(R.id.edtTitle)).perform(typeText("Hello"))
        onView(withId(R.id.edtDescription)).perform(typeText("Shubham Kande"), closeSoftKeyboard())

        onView(withId(R.id.btnAdd)).perform(click())

        onView(withId(R.id.txtResult)).check(matches(withText("Title: Hello | Description: Shubham Kande")))
    }
}