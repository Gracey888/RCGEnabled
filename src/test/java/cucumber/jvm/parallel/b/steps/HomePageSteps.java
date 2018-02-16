package cucumber.jvm.parallel.b.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.jvm.parallel.a.runner.SharedDriver;
import cucumber.jvm.parallel.c.pages.HomePage;
import cucumber.jvm.parallel.util.CUtil;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    private HomePage homePage;
    private WebDriver webDriver;
    
    //boolean LOGIN_STATUS = true;

    public HomePageSteps(SharedDriver webDriver) {
        this.webDriver = webDriver;
        homePage = new HomePage(webDriver);
    }
    
    
	@When("^I navigate to RCG Enabled Banking site$")
	public void i_navigate_to_rcgEnableBanking_site() throws Throwable {
		homePage.navigateToHomePage();
	}
	
	
	//-GLOBAL MENU
	@Then("^I will see Menu 1 Active$")
	public void i_will_see_menu1_active() throws Throwable {
		Assert.assertTrue(homePage.isDisplayed_GLOBAL_MENU1());
	}
	
	@And("^I will see Menu 2 InActive$")
	public void i_will_see_menu2_inactive() throws Throwable {
		Assert.assertTrue(homePage.isDisplayed_GLOBAL_MENU2());
	}
	
	@Then("^I will see Menu 3 InActive$")
	public void i_will_see_menu3_inactive() throws Throwable {
		Assert.assertFalse(homePage.isActive_GLOBAL_MENU3());
	}
	
	@Then("^I will see Menu 3 Active$")
	public void i_will_see_menu3_active() throws Throwable {
		Assert.assertTrue(homePage.isActive_GLOBAL_MENU3());
	}
	
	@And("^I will see Menu 4 InActive$")
	public void i_will_see_menu4_inactive() throws Throwable {
		Assert.assertTrue(homePage.isDisplayed_GLOBAL_MENU4());
	}
	
	
	
	
	@And("^I will see Sub-Menu 1 Active$")
	public void i_will_see_submenu1_active() throws Throwable {
		Assert.assertTrue(homePage.isDisplayed_GLOBAL_MENU1_SUB1_XPATH());
	}
	
	@And("^I will see Sub-Menu 2 Active$")
	public void i_will_see_submenu2_active() throws Throwable {
		Assert.assertTrue(homePage.isDisplayed_GLOBAL_MENU1_SUB2_XPATH());
	}
	
	@And("^I will see Sub-Menu 3 Active$")
	public void i_will_see_submenu3_active() throws Throwable {
		Assert.assertTrue(homePage.isDisplayed_GLOBAL_MENU1_SUB3_XPATH());
	}
		
	//-GLOBAL HEADER
	@And("^I will see Global Header Logo$")
	public void i_will_see_global_header_logo() throws Throwable {
		Assert.assertTrue(homePage.isDisplayed_GLOBAL_HEADER_LOGO());
	}
	
	@And("^I will see Global Header Project$")
	public void i_will_see_global_header_proj() throws Throwable {
		Assert.assertTrue(homePage.isDisplayed_GLOBAL_HEADER_PROJ());
	}
	
	//@Then("^I will see Home Content$")
//	public void i_will_see_home_content() throws Throwable {
//		Assert.assertTrue(homePage.isDisplayed_HOME_CONTENT());
//	}
	
	
	//-GLOBAL FOOTER
	@And("^I will see Global Footer News$")
	public void i_will_see_global_footer_news() throws Throwable {
		Assert.assertTrue(homePage.isDisplayed_GLOBAL_FOOTER_NEWS());
	}
	
	@And("^I will see Global Footer Copy$")
	public void i_will_see_global_footer_copy() throws Throwable {
		Assert.assertTrue(homePage.isDisplayed_GLOBAL_FOOTER_COPY());
	}
	
}//HomePageSteps-END
	
