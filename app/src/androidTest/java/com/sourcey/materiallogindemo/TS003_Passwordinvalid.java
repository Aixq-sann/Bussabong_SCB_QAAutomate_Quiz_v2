package com.sourcey.materiallogindemo;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)

public class TS003_Passwordinvalid {
    @Rule
    public final ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    public <ActivityTestRule> TS003_Passwordinvalid() {

    }

    @Test
    public <rule> void Passwordlessthan4() {
        onView(withId(R.id.input_email)).perform(typeText("skycloudy1989@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("123"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }
    @Test
    public <rule> void Passwordmorethan10() {
        onView(withId(R.id.input_email)).perform(typeText("skycloudy1989@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("12345678901"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }
   @Test
    public <rule> void PasswordEmpty() {
        onView(withId(R.id.input_email)).perform(typeText("skycloudy1989@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

}
