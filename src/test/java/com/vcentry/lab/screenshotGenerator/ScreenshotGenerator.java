package com.vcentry.lab.screenshotGenerator;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;
import com.vcentry.lab.initializer.Initializer;

public class ScreenshotGenerator extends Initializer {
	public static void generateScreenshot(ITestResult r) throws IOException{
		
		if (r.isSuccess()){
			System.out.println("Your current test case is passed - "+r.getParameters()[0]);
			String path=takesScreenshot(r.getParameters()[0].toString());
			
			Log.log(LogStatus.PASS, r.getName()+"test case pass" ,Log.addScreenCapture(path));
		} else {
			System.out.println("Your current test case is failed - "+r.getParameters()[0]);
            String path=takesScreenshot(r.getParameters()[0].toString());
			
			Log.log(LogStatus.PASS, r.getName()+"test case pass" ,Log.addScreenCapture(path));
		
		}
		reports.endTest(Log);
		reports.flush();
	}

	public static String takesScreenshot(String name) throws IOException{
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		File dst=new File("C:/Java Class/Workspace/H2_DDDTest/screenshot/"+name+".png");
		FileHandler.copy(src, dst);
		System.out.println(dst.toString());
		return dst.toString();
	}
}
