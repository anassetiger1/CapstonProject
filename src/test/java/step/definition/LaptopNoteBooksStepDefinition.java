package  step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.DesktopPageObject;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;



public class LaptopNoteBooksStepDefinition  extends Base {
	LaptopNoteBooksPageObject laptopNoteBooksPageObject = new LaptopNoteBooksPageObject();
		
	
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNoteBooksPageObject.ClickOnLaptopAndBookTab();
	    logger.info("User click on Laptop & NoteBook tab");
	}
	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopNoteBooksPageObject.ClickOnShowAllOptions();
		logger.info("User click on Show all Laptop & NoteBook option");
//	Utils.takeScreenshotForStep();
	}
	//Scenario: Add and Remove a Mac book from Cart 
   @When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
	   laptopNoteBooksPageObject.AddMacBookFromCart();
	   logger.info("User click on MacBook item");
	}
	@When("User click on Add Cart button")
	public void user_click_on_add_cart_button() {
		logger.info("User click add to Cart button");
	
		laptopNoteBooksPageObject.ClickOnAddToCartButton();
	}
   @Then("User should see a message3 {string}")
	public void user_should_see_a_message3(String string) {
	Assert.assertTrue(laptopNoteBooksPageObject.ValidateSuccesMessage());
	logger.info(" User should see a message3 'Success: You have added MacBook to your shopping cart!'");
	}
	@Then("User should see {string} showed to the cart")
    public void user_should_see_showed_to_the_cart(String string) throws InterruptedException {
		laptopNoteBooksPageObject. userShouldSeeAddedItemOnTheCart();
		logger.info("User should see ' 1 items' showed to the cart");
	Thread.sleep(2000);
	}
	@Then("User click on cart option")  
	public void user_click_on_cart_option() {
		laptopNoteBooksPageObject. ClickOnCartOption();
		logger.info("User click on cart option");

	
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNoteBooksPageObject.ClickOnRemoveButton();
		logger.info("user click on red X button to remove the item from cart");
		
	
	}
	@Then("item should be removed and cart should show {string}") 
	    public void item_should_be_removed_and_cart_should_show (String string)  throws InterruptedException {
		Assert.assertTrue(laptopNoteBooksPageObject.userShouldSeeTheItemRemoved());
		logger.info("item should be removed and cart should show ' 0 items'");
		Utils.takeScreenShot();
	
	//Thread.sleep(2000);
	//Utils.takeScreenshotForStep();
	}
	// Scenario: Product Comparison  
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
	   laptopNoteBooksPageObject.ClickOnCompareMacBook();
	    logger.info("User click on product comparison icon on MacBook");
	    Thread.sleep(2000);
	    Utils.takeScreenShot();
	
	
	}
	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on() {
		laptopNoteBooksPageObject.ClickOnMacAirIcon();
		logger.info("User click on product comparison icon on MacBook Air");

	Utils.hardWait(2000);
	}
	@Then("User should see a message4 {string}")
	public void user_should_see_a_message4(String string) throws InterruptedException {
		laptopNoteBooksPageObject.succesAddMacBookAirtoProductCompare();
		logger.info("user can see add successfulle to product comparison");
		Thread.sleep(2000);
	}

	@When("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
		laptopNoteBooksPageObject.clickOnproductComprison();
		logger.info("user can click on product comparison");
		Thread.sleep(2000);
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		//Assert.assertTrue (laptopNoteBooksPageObject.ProductComparisonChart());
		logger.info("User should see Product Comparison Chart");
	laptopNoteBooksPageObject.productCompareItem();
	
	//Utils.takeScreenshotForStep();
	}
	// Scenario: Adding an item to Wish list   
   @When("User click on heart icon to add 'Sony VaIO'laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() throws InterruptedException {
	
	   laptopNoteBooksPageObject.ClickOnHeartIcon();
	   logger.info(" User click on heart icon to add 'Sony VaIO'laptop to wish list");
	Thread.sleep(5000);
	}
	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws InterruptedException {
		
		Assert.assertTrue(laptopNoteBooksPageObject.userNeedToLogginToAddItem());
		logger.info("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!");
	
	
	
	Thread.sleep(5000);
	}
	
	
	// Scenario: Validate the price of MacBook Pro is 2000    
	@When("User click on {string} item")
	public void user_click_on_item(String string) {
		 laptopNoteBooksPageObject.ClickOnMacBook();
		 logger.info("User click on 'MacBook Pro' item");

	
	}
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
	Assert.assertTrue(laptopNoteBooksPageObject.TagPriceShouldBePersentOnUI());
	logger.info("User should see '$2,000.00' price tag is present on UI.");
	//Utils.takeScreenshotForStep();
	Utils.takeScreenShot();
	}
	}





	
	
	