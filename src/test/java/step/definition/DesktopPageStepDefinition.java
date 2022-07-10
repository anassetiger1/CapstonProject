package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition  extends Base{
	
	DesktopPageObject desktopPageObject = new DesktopPageObject (); 
	

//scenario1
@When("User click on Desktops tab")

public void user_click_on_desktops_tab() {
	desktopPageObject.clickOnDesktopTab();
	logger.info("user Clicked on Desktops Tab");    
    
}

@When("User click on Show all desktops")

public void user_click_on_show_all_desktops() {
    desktopPageObject.clickShowAllDesktops();
    logger.info("user click on Show all desktops successfully");
}



@Then("User should see all items are present in Desktop page")

public void user_should_see_all_items_are_present_in_desktop_page() {
	List<WebElement> desktopsElements =  desktopPageObject.desktopsItems();
   for(WebElement element:desktopsElements) {
	   Assert.assertTrue(element.isDisplayed());
	   logger.info(element.getAttribute("title")+ " is present");
   }
   
   

}


//scenario2
@When("User click  ADD TO CART option on HP LP3065item")
public void user_click_add_to_cart_option_on_hp_lp3065item() {
	desktopPageObject.AddToCartHPLP3065();
	logger.info("User click  ADD TO CART option on HP LP3065item ");
	  
}



@When("User select quantity'{int}'")
public void user_select_quantity(Integer int1) {
    
	desktopPageObject.selectQuantity(1);
	

}

@When("User click add to Cart button")
public void user_click_add_to_cart_button() {
	desktopPageObject.AddCameraButton();
	logger.info("User click add to Cart button ");
    
}

@Then("User should see a message'Success: you have added HP LP {int} to your Shopping cart!'")
public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
    
	Assert.assertTrue(desktopPageObject.reviewMessage());
	logger.info("Success: you have added HP LP 3065 to your Shopping cart!");
	Utils.takeScreenShot();
   
}
@When("User click  ADD TO CART option on Canon EOS 5Ditem")
public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
     
	desktopPageObject.ClickOnCameraLink();
	logger.info(" User add Canon EOS 5D from Desktops tab to the cart");
}
   



@When("User select color from dropdown Red")

public void user_select_color_from_dropdown_red() {
	desktopPageObject.ClickOnSelectRed();
	
	logger.info("User select color from dropdown Red");
}
@When("User select quantity {string}")
public void user_select_quantity(String string) {
	desktopPageObject.SelectQuantity(string);
	logger.info("User select quantity 1 one more time");
	
   
}


@Then("User should see a message {string}")
public void user_should_see_a_message(String expectedmessageValue) throws InterruptedException {
        Assert.assertTrue(desktopPageObject.validateSucessMessage());
      
	logger.info("User should see a message'Success: You have added Canon EOS 5D to your shopping cart!'");
	Utils.takeScreenShot();
   
}

@When("User click on Canon EOS 5D item")

public void user_click_on_canon_eos_5d_item() {
	desktopPageObject.ClickOnCameraLink();
	logger.info("User click on Canon EOS 5D item ");

    

}



@When("User click on write a review link")

public void user_click_on_write_a_review_link() {
	desktopPageObject.ClickOnReview();
	logger.info("User click on write a review link ");
    

}



@When("user fill the review information with below information")
public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable)
		throws InterruptedException {
	// Write code here that turns the phrase above into concrete actions
	// For automatic transformation, change DataTable to one of
	// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	// Double, Byte, Short, Long, BigInteger or BigDecimal.
	//
	// For other transformations you can register a DataTableType.
	List<Map<String, String>> infoList = dataTable.asMaps(String.class, String.class);
	desktopPageObject.UserName(infoList.get(0).get("youname"));
	desktopPageObject.sendReview(infoList.get(0).get("reviewtext"));
	desktopPageObject.ClickOnRatingButton();
	Thread.sleep(2000);

}


@When("User click on Continue button")

public void user_click_on_continue_button() {
	
	desktopPageObject.clickOncontunioButton();
	logger.info("User click on Continue button ");
    

}



@Then("User should see a message with {string}")
public void user_should_see_a_message_with(String string) {
    
	desktopPageObject.reviewMessage();
	Utils.takeScreenShot();
	
}


	

}





    
