package com.vcentry.lab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vcentry.lab.initializer.Locator;

public class CheckoutPage {

	public static void enterProductName(String data) {
		Locator.getElementByID("CHECKOUTPAGE-TYPE_PRODUCT_ID").sendKeys(data);
	}

	public static void enterMobile(String data) {
		Locator.getElementByID("CHECKOUTPAGE-TYPE_MOBILE_ID").sendKeys(data);
	}

	public static void enterEmail(String data) {
		Locator.getElementByID("CHECKOUTPAGE-TYPE_EMAIL_ID").sendKeys(data);
	}

	public static void selectProductCategory(String data) {
		WebElement element = Locator.getElementByID("CHECKOUTPAGE-CLICK_PRODUCTCATEGORY_ID");
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}

	public static void enterProductQuantity(String data) {
		Locator.getElementByID("CHECKOUTPAGE-TYPE_PRODUCTQUANTITY_ID").sendKeys(data);
	}

	public static void enterPurchaserName(String data) {
		Locator.getElementByID("CHECKOUTPAGE-TYPE_PURCHASERNAME_ID").sendKeys(data);
	}

	public static void clickGstApplied() {
		Locator.getElementByID("CHECKOUTPAGE-CLICK_GSTAPPLIED_ID").click();
}
	public static void clickCOD() {
		Locator.getElementByID("CHECKOUTPAGE-CLICK_COD_ID").click();
}
	public static void clickNetBanking() {
		Locator.getElementByID("CHECKOUTPAGE-CLICK_NETBANKING_ID").click();
}
	public static void clickplaceorder() {
		Locator.getElementByID("CHECKOUTPAGE-CLICK_PLACEORDER_ID").click();
}
}