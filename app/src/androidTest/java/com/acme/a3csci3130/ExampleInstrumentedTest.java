package com.acme.a3csci3130;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * <p>
 * This program is testing the functionality of update, delete, and modify methods of the Android program
 *
 * @author  Kewei Ma
 * @since   2018/06/29
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(AndroidJUnit4.class)

public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void createTest(){
        // type business info
        onView(withId(R.id.submitButton)).perform(click());
        onView(withId(R.id.number)).perform(typeText("123456789"));
        onView(withId(R.id.name)).perform(typeText("Name Business"));
        onView(withId(R.id.primary)).perform(typeText("Fisher"));
        onView(withId(R.id.address)).perform(typeText("1111 North Street"));
        onView(withId(R.id.province)).perform(typeText("NS"));

        //create business
        //onView(withId(R.id.button)).perform(click());

        // check the main screen
        //onView(withId(R.id.textView)).check(matches(withText("Business")));
    }

    @Test
    public void updateTest(){
        // type business info
        onView(withId(R.id.submitButton)).perform(click());
        onView(withId(R.id.number)).perform(typeText("123456789"));
        onView(withId(R.id.name)).perform(typeText("Name Business"));
        onView(withId(R.id.primary)).perform(typeText("Fisher"));
        onView(withId(R.id.address)).perform(typeText("1111 North Street"));
        onView(withId(R.id.province)).perform(typeText("NS"));

        //create business
        //onView(withId(R.id.button)).perform(click());

        // check the main screen
        //onView(withId(R.id.textView)).check(matches(withText("Business")));
    }

    @Test
    public void deleteTest(){
        // type business info
        onView(withId(R.id.submitButton)).perform(click());
        onView(withId(R.id.number)).perform(typeText("123456789"));
        onView(withId(R.id.name)).perform(typeText("Name Business"));
        onView(withId(R.id.primary)).perform(typeText("Fisher"));
        onView(withId(R.id.address)).perform(typeText("1111 North Street"));
        onView(withId(R.id.province)).perform(typeText("NS"));

        //create business
        //onView(withId(R.id.button)).perform(click());

        // check the main screen
        //onView(withId(R.id.textView)).check(matches(withText("Business")));
    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.acme.a3csci3130", appContext.getPackageName());
    }
}
