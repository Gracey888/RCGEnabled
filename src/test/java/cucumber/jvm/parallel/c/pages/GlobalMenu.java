package cucumber.jvm.parallel.c.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.jvm.parallel.d.pageobjects.GlobalMenuElements;
import cucumber.jvm.parallel.d.pageobjects.HomePageElements;
import cucumber.jvm.parallel.util.CUtil;

public class GlobalMenu {

	private static WebDriver webDriver;
	private GlobalMenuElements globalMenuElements;

	public GlobalMenu(WebDriver webDriver) {
		this.webDriver = webDriver;
		globalMenuElements = new GlobalMenuElements();
	}

	public boolean isDisplayed_GLOBAL_HEADER_LOGO() {
		return CUtil.isDisplayed(By.xpath(globalMenuElements.GLOBAL_HEADER_LOGO_XPATH));
	}
	
	public boolean isDisplayed_GLOBAL_HEADER_PROJ() {
		return CUtil.isDisplayed(By.xpath(globalMenuElements.GLOBAL_HEADER_PROJ_XPATH));
	}

	//-
	public boolean isDisplayed_GLOBAL_FOOTER_NEWS() {
		return CUtil.isDisplayed(By.xpath(globalMenuElements.GLOBAL_FOOTER_NEWS_XPATH));
	}
	
	public boolean isDisplayed_GLOBAL_FOOTER_COPY() {
		return CUtil.isDisplayed(By.xpath(globalMenuElements.GLOBAL_FOOTER_COPY_XPATH));
	}
	
}//HomePage-END

	

