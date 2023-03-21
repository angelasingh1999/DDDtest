package com.vcentry.lab.testCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.vcentry.lab.initializer.Initializer;
import com.vcentry.lab.initializer.Locator;
import com.vcentry.lab.inputReader.InputReader;
import com.vcentry.lab.pages.CheckoutPage;
import com.vcentry.lab.pages.HomePage;
import com.vcentry.lab.pages.LoginPage;

public class CheckOutPageValidator extends Initializer {

	@BeforeTest
	public void setUp() throws IOException {
		//Initalize(); // opens the browswer

	}

	@Test(dataProvider = "CheckOutTest")
	public void validateCheckoutPage(String testdata,String user, String password, String productname, String mobile, String Email,
			String ProductCategory, String ProductQuantity, String PurchaserName)
			throws IOException, InterruptedException {
		
		Initalize();
		Log=reports.startTest("start "+testdata, "validate -" +testdata);
		Log.log(LogStatus.PASS, testdata+"- initialized");
		// Initalize(); //opens the browswer

		wd.get(envprop.getProperty("URL"));
		Log.log(LogStatus.PASS, "url loaded successfully");

		/*
		 * //step1 wd.findElement(By.name("username")).sendKeys(
		 * "sibichandru1993@gmail.com");
		 * wd.findElement(By.name("password")).sendKeys("Password@123");
		 * wd.findElement(By.name("password")).submit();
		 */

		/*
		 * //step2 wd.findElement(By.name(locatorprop.getProperty(
		 * "LOGINPAGE_TYPE_USERNAME"))).sendKeys("sibichandru1993@gmail.com");
		 * wd.findElement(By.name(locatorprop.getProperty(
		 * "LOGINPAGE_TYPE_PASSWORD"))).sendKeys("Password@123");
		 * wd.findElement(By.name(locatorprop.getProperty(
		 * "LOGINPAGE_TYPE_PASSWORD"))).submit();
		 */

		/*
		 * //step3
		 * Locator.getElementByName("LOGINPAGE_TYPE_USERNAME_NAME123456").
		 * sendKeys("sibichandru1993@gmail.com");
		 * Locator.getElementByName("LOGINPAGE_TYPE_PASSWORD_NAME").sendKeys(
		 * "Password@123");
		 * Locator.getElementByName("LOGINPAGE_TYPE_PASSWORD_NAME").submit();
		 */

		// step4 - page object , readable , reuseable , maintainable
		LoginPage.enterUsername(user); // 0
		LoginPage.enterPassword(password); // 1
		LoginPage.clicklogin();
		Log.log(LogStatus.PASS, "Login successful");
		Thread.sleep(2000);
		wd.get(envprop.getProperty("LAB_URL"));
		Thread.sleep(2000);
		HomePage.clickFrameworkform();
		HomePage.clickSimpleform();
		Log.log(LogStatus.PASS, "HomePage completed successfully");
		CheckoutPage.enterProductName(productname);// 2
		CheckoutPage.enterMobile(mobile);// 3
		CheckoutPage.enterEmail(Email);// 4
		CheckoutPage.selectProductCategory(ProductCategory);// 5
		CheckoutPage.enterProductQuantity(ProductQuantity);// 6
		CheckoutPage.enterPurchaserName(PurchaserName);// 7
		CheckoutPage.clickGstApplied();
		CheckoutPage.clickCOD();
		CheckoutPage.clickNetBanking();
		CheckoutPage.clickplaceorder();
		Log.log(LogStatus.PASS, "CheckoutPage completed successfully");

	}

	@DataProvider(name="CheckOutTest")
	public static Object getData() throws IOException{
		if(InputReader.verifyRunMode("CheckOutPageValidator")){
			
		
		Object[][] data=InputReader.verifyMultiData("CheckOutPageValidator");
		
			return data;
		}
		return null;
}

	@AfterMethod
	public void tearDown(ITestResult r) throws IOException {
		// logout
		
		//logout
		HomePage.clickLogOut();
		
	}
	
	
}
