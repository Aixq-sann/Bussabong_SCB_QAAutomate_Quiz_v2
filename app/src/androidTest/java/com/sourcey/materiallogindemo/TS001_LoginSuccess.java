package com.sourcey.materiallogindemo;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)

public class TS001_LoginSuccess {

    @Rule
    public final ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    public <ActivityTestRule> TS001_LoginSuccess() {

    }
    /*@Before
    public <rule> void <ActivityTestRule> SignupFirst_Preparation() {

    }
    */
    /*
    public static final String Password = "1234";
    public static final String LOGIN_TEXT = "Hello Anupam";
    */
    @Test
    public <rule> void LoginSuccess(){
        /*onView(withId(R.id.input_email).perform(clearText()));
        onView(withId(R.id.input_email)).perform(typeText("skycloudy1989@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.input_password).perform(clearText()));
        onView(withId(R.id.input_password)).perform(typeText("skycloudy"),closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());
        */
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("skycloudy1989@gmail.com"),closeSoftKeyboard());


        //onView(withId(R.id.input_password).perform(clearText()));
        onView(withId(R.id.input_password)).perform(typeText("12345678"),closeSoftKeyboard());
        //onView(withId(R.id.input_password)).perform(typeText(Password),closeSoftKeyboard());

        onView(withId(R.id.btn_login)).perform(click());
        //onView(withId(R.id.tv_welcome)).check(matches(withText("Hi user@email.com!")));
        //onView(withText(R.id.textView)).check(matches(withText(LOGIN_TEXT)));
        //onView(withId(R.id.btn_login)).perform(click()).check(matches(isDisplayed()));

        //onView(withText("Hello")).check(matches(isDisplayed()));
    }
}

