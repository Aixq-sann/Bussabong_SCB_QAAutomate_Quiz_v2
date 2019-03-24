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


public class TS002_Emailinvalid {
    @Rule
    public final ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    public <ActivityTestRule> TS002_Emailinvalid() {

    }


    @Test
    public <rule> void EmailEmpty(){
        onView(withId(R.id.input_email)).perform(typeText(""),closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("12345678"),closeSoftKeyboard());

        onView(withId(R.id.btn_login)).perform(click());
    }

    @Test
    public <rule> void Emailinvalid(){
        onView(withId(R.id.input_email)).perform(typeText("skycloudy1989"),closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());
    }
    @Test
    public <rule> void EmailPassEmpty(){
        onView(withId(R.id.input_email)).perform(typeText(""),closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText(""),closeSoftKeyboard());

        onView(withId(R.id.btn_login)).perform(click());
    }
}
