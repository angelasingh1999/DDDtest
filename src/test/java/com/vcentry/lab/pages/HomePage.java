package com.vcentry.lab.pages;

import com.vcentry.lab.initializer.Locator;

public class HomePage {
	public static void clickFrameworkform(){
		Locator.getElementByID("HOMEPAGE_CLICK_FRAMEWORKFORMS_ID").click();
	}
	public static void clickSimpleform(){
		Locator.getElementByID("HOMEPAGE_CLICK_SIMPLEFORM_ID").click();
	}

	public static void clickLogOut(){
		Locator.getElementBylinkText("HOMEPAGE_CLICK_LOGOUT_LINKTEXT").click();
	}
}
