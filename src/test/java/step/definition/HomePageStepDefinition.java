package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base {
	
	 HomePageObject homePageObject = new HomePageObject();
	
	 @Given("User get into Retail website")
	 public void user_get_into_retail_website() {
	    
		String expectedText = "TEST ENVIRONMENT";
		String actualText =  homePageObject.getTextEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info("text test Environment was verified");
	}

	@When("User click on Currency")
	public void user_click_on_currency() {
		homePageObject.ClickOnCurrency();
		logger.info("User click on Currency");
		Utils.takeScreenShot();
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePageObject.ChooseEuroFromDropSown();
		logger.info("User Chose Euro from dropdown");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePageObject.CurrencyValueAsEuro();
		logger.info(" currency value should change to Euro");
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePageObject.ClickOnShoppingCart();
		logger.info("User click on shopping cart");
	}

	@Then("{string} message should display")
	public void message_should_display(String string) {
	    Assert.assertTrue(homePageObject.UserShoppingCartIsEmpty());
	    logger.info("Your shopping cart is empty!\" message should display");
	    Utils.takeScreenShot();
	}


}
