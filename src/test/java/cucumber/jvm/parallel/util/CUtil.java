package cucumber.jvm.parallel.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class CUtil {
	private static WebDriver webDriver;

	private static boolean HIGHLIGHT_SWITCH = true;
	private final static int WAITING_TIME = 90;
	//public static String storedValue = "";

	public static void setWebDriver(WebDriver _webDriver) {
		webDriver = _webDriver;
	}

	public static void waitForVisibleElement(final By by) {
		WebDriverWait wait = new WebDriverWait(webDriver, WAITING_TIME);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public static boolean javascript_highlight(By by, String borderColor, String borderType, int borderThickness) {
		try {
			WebElement pageElement = webDriver.findElement(by);
			if (HIGHLIGHT_SWITCH) {
				if (borderColor.isEmpty()) {
					borderColor = "red";
				}
				if (borderType.isEmpty()) {
					borderType = "solid";
				}
				if (webDriver instanceof JavascriptExecutor) {
					((JavascriptExecutor) webDriver).executeScript("arguments[0].style.border='" + borderThickness
							+ "px " + borderType + " " + borderColor + "'", pageElement);
				}
			}
			return true;
		} catch (ElementNotVisibleException | NoSuchElementException | StaleElementReferenceException e) {
			return false;
		}
	}
	
	public static boolean isDisplayed(By by) {
		try {
			waitForVisibleElement(by);
			javascript_highlight(by, "green", "dotted", 3);
			boolean diplayed = webDriver.findElement(by).isDisplayed();
			return diplayed;
		} catch (NoSuchElementException | TimeoutException e) {
			return false;
		}
	}
	
	public static String getAttribute(By by, String attribute){
		return webDriver.findElement(by).getAttribute(attribute);
	}
	
	public static String getProperty(String location, String property) {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(location);

			// load a properties file
			prop.load(input);

			return prop.getProperty(property);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return "";
	}

	
}//CUtil-END