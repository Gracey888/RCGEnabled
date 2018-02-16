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

public class HomePage_Steps {
    private HomePage homePage;
    private WebDriver webDriver;

    public HomePage_Steps(SharedDriver webDriver) {
        this.webDriver = webDriver;
        homePage = new HomePage(webDriver);
    }
    
    
    @Given("^I am at the RCG Enabled Banking site Home Page$")
	public void i_am_at_the_rcg_enabled_banking_site_home_page() throws Throwable {
		homePage.navigateToHomePage();
		Assert.assertTrue(homePage.isAtThisPage());
	}
    
    @Then("^I should see Menu 1 Active$")
    public void i_should_see_menu_1_active(){
    	Assert.assertTrue(homePage.isActive_GLOBAL_MENU1());
    }
    
    @Then("^I should see Menu 2 Active$")
    public void i_should_see_menu_2_active(){
    	Assert.assertTrue(homePage.isActive_GLOBAL_MENU2());
    }
    
    @Then("^I should see Menu 3 Active$")
    public void i_should_see_menu_3_active(){
    	Assert.assertTrue(homePage.isActive_GLOBAL_MENU3());
    }
    
    @Then("^I should see Menu 4 Active$")
    public void i_should_see_menu_4_active(){
    	Assert.assertTrue(homePage.isActive_GLOBAL_MENU4());
    }
    
    @Then("^I should see Menu 5 Active$")
    public void i_should_see_menu_5_active(){
    	Assert.assertTrue(homePage.isActive_GLOBAL_MENU5());
    }
    
    @Then("^I should see Menu 1 Inactive$")
    public void i_should_see_menu_1_inactive(){
    	Assert.assertFalse(homePage.isActive_GLOBAL_MENU1());
    }
    
    @Then("^I should see Menu 2 Inactive$")
    public void i_should_see_menu_2_inactive(){
    	Assert.assertFalse(homePage.isActive_GLOBAL_MENU2());
    }
    
    @Then("^I should see Menu 3 Inactive$")
    public void i_should_see_menu_3_inactive(){
    	Assert.assertFalse(homePage.isActive_GLOBAL_MENU3());
    }
    
    @Then("^I should see Menu 4 Inactive$")
    public void i_should_see_menu_4_inactive(){
    	Assert.assertFalse(homePage.isActive_GLOBAL_MENU4());
    }
    
    @Then("^I should see Menu 5 Inactive$")
    public void i_should_see_menu_5_inactive(){
    	Assert.assertFalse(homePage.isActive_GLOBAL_MENU5());
    }
    
    @Then("^I should see Sub-Menu 1$")
    public void i_should_see_submenu_1(){
    	Assert.assertTrue(homePage.isDisplayed_GLOBAL_MENU1_SUB1());
    }
    
    @Then("^I should see Sub-Menu 2$")
    public void i_should_see_submenu_2(){
    	Assert.assertTrue(homePage.isDisplayed_GLOBAL_MENU1_SUB2());
    }
    
    @Then("^I should see Sub-Menu 3$")
    public void i_should_see_submenu_3(){
    	Assert.assertTrue(homePage.isDisplayed_GLOBAL_MENU1_SUB3());
    }
		
}
	
