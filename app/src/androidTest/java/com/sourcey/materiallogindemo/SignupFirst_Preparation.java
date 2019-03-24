package com.sourcey.materiallogindemo;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)

public class SignupFirst_Preparation {

    @Rule
    public final ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    public <ActivityTestRule> SignupFirst_Preparation() {

    }

     @Before
     public <rule> void MainActivity(){
    onView(withId(R.id.link_signup)).perform(click());
}


    @Test
    public <rule> void SignupActivity(){

        onView(withId(R.id.input_name)).perform(typeText("Bussabong"),closeSoftKeyboard());
        onView(withId(R.id.input_address)).perform(typeText("BKK"),closeSoftKeyboard());
        onView(withId(R.id.input_email)).perform(typeText("skycloudy1989@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.input_mobile)).perform(typeText("0823312244"),closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("12345678"),closeSoftKeyboard());
        onView(withId(R.id.input_reEnterPassword)).perform(typeText("12345678"),closeSoftKeyboard());

        onView(withId(R.id.btn_signup)).perform(click());
    }


    @After
    public <rule> void Logout(){
        onView(withId(R.id.btn_logout)).perform(click());
    }


}


