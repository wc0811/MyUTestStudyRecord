package com.cw.myuteststudyrecord;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.junit.Assert.*;

/**
 * Create By  Created by chao.wang on 2017/12/4 16:22:13
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
@RunWith(AndroidJUnit4.class)
public class FlashActivityTest {
    @Rule
    public ActivityTestRule<FlashActivity> mActivityRule = new ActivityTestRule<>(
            FlashActivity.class);

    @Test
    public void canSee() throws Exception {
        onView(withId(R.id.iv_Ic));
        onView(withText("Hello World！"));//startsWith,endsWith  all can use
//        onView(allOf(withId(R.id.iv_Ic), withText("Hello")));
    }

    @Test
    public void second() throws Exception {
        onView(withId(R.id.iv_Ic)).perform(click());//onclick Corresponding to the Above
        onView(withText("Hello World！")).perform(click());//startsWith,endsWith  all can use
//        onView(allOf(withId(R.id.iv_Ic), withText("Hello"))).perform(click());
    }

    @Test
    public void third() throws Exception {
        onView(withId(R.id.tv_Test)).check(matches(withText("Hello World！")));//verify the text if right
    }

    @Test
    public void fourth() throws Exception {
        onView(withId(R.id.tv_Test)).check(matches(isDisplayed()));//Check View Is Displayed
    }
//先看下简单的，难一点的后期慢慢研究下
}