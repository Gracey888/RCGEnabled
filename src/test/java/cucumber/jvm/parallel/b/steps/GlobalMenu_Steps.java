package cucumber.jvm.parallel.b.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.jvm.parallel.a.runner.SharedDriver;
import cucumber.jvm.parallel.c.pages.GlobalMenu;
import cucumber.jvm.parallel.c.pages.HomePage;
import cucumber.jvm.parallel.util.CUtil;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class GlobalMenu_Steps {
    private GlobalMenu globalMenu;
    private WebDriver webDriver;

    public GlobalMenu_Steps(SharedDriver webDriver) {
        this.webDriver = webDriver;
        globalMenu = new GlobalMenu(webDriver);
    }
    
    @Then("^I should see Global Header$")
    public void i_should_see_global_header(){
    	Assert.assertTrue(globalMenu.isDisplayed_GLOBAL_HEADER_LOGO());
    	Assert.assertTrue(globalMenu.isDisplayed_GLOBAL_HEADER_PROJ());
    }
    
    @Then("^I should see Global Footer$")
    public void i_should_see_global_footer(){
    	Assert.assertTrue(globalMenu.isDisplayed_GLOBAL_FOOTER_NEWS());
    	Assert.assertTrue(globalMenu.isDisplayed_GLOBAL_FOOTER_COPY());
    }
		
}
	
