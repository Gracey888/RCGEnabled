package cucumber.jvm.parallel.c.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.jvm.parallel.d.pageobjects.HomePageElements;
import cucumber.jvm.parallel.util.CUtil;

public class HomePage {

	private static WebDriver webDriver;
	private HomePageElements homePageElements;

	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
		homePageElements = new HomePageElements();
	}

	public boolean isAtThisPage(){
		return webDriver.getCurrentUrl().contains("/home");
	}

	public HomePage navigateToHomePage() {
		/*
		String env = System.getProperty("environment");
		if (env == null) {
			env = "DEV";
		}
		switch (env) {
		case "QA":
		case "qa":
			webDriver.get(CUtil.getProperty("src/test/resources/environment.properties", "rcgenable.qa.bank"));
			break;
		case "DEV":
		case "dev":
			webDriver.get(CUtil.getProperty("src/test/resources/environment.properties", "rcgenable.dev.bank"));
			break;
		}
		webDriver.manage().window().maximize();
		*/
		webDriver.get("https://");
		return this;
	}
	
	public boolean isActive_GLOBAL_MENU1(){
		return CUtil.getAttribute(By.xpath(homePageElements.GLOBAL_MENU1_XPATH), "active").equals("true");
	}
	
	public boolean isActive_GLOBAL_MENU2(){
		return CUtil.getAttribute(By.xpath(homePageElements.GLOBAL_MENU2_XPATH), "active").equals("true");
	}
	
	public boolean isActive_GLOBAL_MENU3(){
		return CUtil.getAttribute(By.xpath(homePageElements.GLOBAL_MENU3_XPATH), "active").equals("true");
	}
	
	public boolean isActive_GLOBAL_MENU4(){
		return CUtil.getAttribute(By.xpath(homePageElements.GLOBAL_MENU4_XPATH), "active").equals("true");
	}
	
	public boolean isActive_GLOBAL_MENU5(){
		return CUtil.getAttribute(By.xpath(homePageElements.GLOBAL_MENU5_XPATH), "active").equals("true");
	}
	
	public boolean isInactive_GLOBAL_MENU1(){
		return CUtil.getAttribute(By.xpath(homePageElements.GLOBAL_MENU1_XPATH), "active").equals("false");
	}
	
	public boolean isInactive_GLOBAL_MENU2(){
		return CUtil.getAttribute(By.xpath(homePageElements.GLOBAL_MENU2_XPATH), "active").equals("false");
	}
	
	public boolean isInactive_GLOBAL_MENU3(){
		return CUtil.getAttribute(By.xpath(homePageElements.GLOBAL_MENU3_XPATH), "active").equals("false");
	}
	
	public boolean isInactive_GLOBAL_MENU4(){
		return CUtil.getAttribute(By.xpath(homePageElements.GLOBAL_MENU4_XPATH), "active").equals("false");
	}
	
	public boolean isInactive_GLOBAL_MENU5(){
		return CUtil.getAttribute(By.xpath(homePageElements.GLOBAL_MENU5_XPATH), "active").equals("false");
	}
	
	public boolean isDisplayed_GLOBAL_MENU1_SUB1() {
		return CUtil.isDisplayed(By.xpath(homePageElements.GLOBAL_MENU1_SUB1_XPATH));
	}
	
	public boolean isDisplayed_GLOBAL_MENU1_SUB2() {
		return CUtil.isDisplayed(By.xpath(homePageElements.GLOBAL_MENU1_SUB2_XPATH));
	}
	
	public boolean isDisplayed_GLOBAL_MENU1_SUB3() {
		return CUtil.isDisplayed(By.xpath(homePageElements.GLOBAL_MENU1_SUB3_XPATH));
	}
	
}//HomePage-END

	

