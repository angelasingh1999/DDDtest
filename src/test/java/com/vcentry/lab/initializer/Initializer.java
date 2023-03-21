package com.vcentry.lab.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vcentry.lab.utils.ReportOptimizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer {
	/**
	 * @author RAHUL
	 * @date 8th March 2023
	 * @purpose to initialize the report variables
	 */
	public static ExtentReports reports;
	public static ExtentTest Log;
	public static boolean isReport = true;

	public static Properties envprop = null;

	/**
	 * @author RAHUL
	 * @date 8th March 2023
	 * @purpose to initialize the environmental variables
	 */
	public static Properties locatorprop = null;
	public static WebDriver wd = null;

	/**
	 * @author RAHUL
	 * @date 8th March 2023
	 * @purpose to initialize the env.properties file and locator.properties
	 *          file
	 */

	public static void Initalize() throws IOException {
		if (isReport) {
			ReportOptimizer.optimizeReport();
			reports = new ExtentReports("C:/Java Class/Workspace/H2_DDDTest/report/index.html");
			isReport=false;
		}
			envprop = new Properties();
			envprop.load(new FileInputStream(new File("src/test/resources/com/vcentry/lab/config/env.properties")));

			locatorprop = new Properties();
			locatorprop.load(
					new FileInputStream(new File("src/test/resources/com/vcentry/lab/config/locator.properties")));
			
			if(wd==null){
			if (envprop.get("BROWSER").equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				wd = new ChromeDriver();
			} else if (envprop.get("BROWSER").equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				wd = new FirefoxDriver();
			}

			if (envprop.get("BROWSER").equals("ie")) {
				WebDriverManager.iedriver().setup();
				wd = new InternetExplorerDriver();
			}

		}

		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

}
