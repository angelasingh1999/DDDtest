package com.vcentry.lab.initializer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;

public class Locator extends Initializer {

	public static WebElement getElementByName(String Key) {
		try {
			WebElement element = wd.findElement(By.name(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by name-" + Key + "-" + e.getMessage());
		}
		return null;
	}

	public static WebElement getElementByID(String Key) {
		try {
			WebElement element = wd.findElement(By.id(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by id-" + Key + "-" + e.getMessage());
		}
		return null;
	}

	public static WebElement getElementByXPath(String Key) {
		try {
			WebElement element = wd.findElement(By.xpath(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by xpath-" + Key + "-" + e.getMessage());
		}
		return null;
	}

	public static WebElement getElementByCSS(String Key) {
		try {
			WebElement element = wd.findElement(By.cssSelector(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by cssSelector-" + Key + "-" + e.getMessage());
		}
		return null;
	}

	public static WebElement getElementBylinkText(String Key) {
		try {
			WebElement element = wd.findElement(By.linkText(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by linkText-" + Key + "-" + e.getMessage());
		}
		return null;
	}

	public static WebElement getElementByPartiallinkTest(String Key) {
		try {
			WebElement element = wd.findElement(By.partialLinkText(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by partiallinkText-" + Key + "-" + e.getMessage());
		}
		return null;
	}

	public static WebElement getElementByClassName(String Key) {
		try {
			WebElement element = wd.findElement(By.className(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by className-" + Key + "-" + e.getMessage());
		}
		return null;
	}

	public static WebElement getElementByTagName(String Key) {
		try {
			WebElement element = wd.findElement(By.tagName(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by tagName-" + Key + "-" + e.getMessage());
		}
		return null;
	}
	//findElements
	public static List<WebElement> getElementsByName(String Key) {
		try {
			List<WebElement> element = wd.findElements(By.name(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by name-" + Key + "-" + e.getMessage());
		}
		return null;
	}
	public static List<WebElement> getElementsByID(String Key) {
		try {
			List<WebElement> element = wd.findElements(By.id(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by id-" + Key + "-" + e.getMessage());
		}
		return null;
	}
	public static List<WebElement> getElementsByXpath(String Key) {
		try {
			List<WebElement> element = wd.findElements(By.xpath(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by xpath-" + Key + "-" + e.getMessage());
		}
		return null;
	}
	public static List<WebElement> getElementsByCSS(String Key) {
		try {
			List<WebElement> element = wd.findElements(By.cssSelector(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by cssSelector-" + Key + "-" + e.getMessage());
		}
		return null;
	}
	public static List<WebElement> getElementsBylinkText(String Key) {
		try {
			List<WebElement> element = wd.findElements(By.linkText(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by linkText-" + Key + "-" + e.getMessage());
		}
		return null;
	}
	public static List<WebElement> getElementsByPartiallinkText(String Key) {
		try {
			List<WebElement> element = wd.findElements(By.partialLinkText(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by partialLinkText-" + Key + "-" + e.getMessage());
		}
		return null;
	}
	public static List<WebElement> getElementsByClassName(String Key) {
		try {
			List<WebElement> element = wd.findElements(By.className(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by className-" + Key + "-" + e.getMessage());
		}
		return null;
	}
	public static List<WebElement> getElementsBytagName(String Key) {
		try {
			List<WebElement> element = wd.findElements(By.tagName(locatorprop.getProperty(Key)));
			return element;
		} catch (Exception e) {
			System.out.println("Alert unable to find element by tagName-" + Key + "-" + e.getMessage());
		}
		return null;
	}
}
