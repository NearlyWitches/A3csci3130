package com.acme.a3csci3130;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void CreateTest(){
        // type business info
        onView(withId(R.id.number)).perform(typeText("123456789"));
        onView(withId(R.id.name)).perform(typeText("Name Business"));
        onView(withId(R.id.primary)).perform(typeText("Fisher"));
        onView(withId(R.id.address)).perform(typeText("1111 North Street"));
        onView(withId(R.id.province)).perform(typeText("NS"));

        //create business
        onView(withId(R.id.button)).perform(click());

        // check the main screen
        onView(withId(R.id.textView)).check(matches(withText("Business")));
    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.acme.a3csci3130", appContext.getPackageName());
    }
}
