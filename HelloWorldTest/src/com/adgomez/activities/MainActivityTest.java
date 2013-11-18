package com.adgomez.activities;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
	
	@Test
	public void onCreateTest() {
		MainActivity mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();
		assertNotNull(mainActivity);
	}

}