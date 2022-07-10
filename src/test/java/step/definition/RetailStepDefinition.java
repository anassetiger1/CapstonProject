package step.definition;





import java.util.List;
import java.util.Map;



import org.junit.Assert;



import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.RetailPageObject;
import utilities.Utils;




public class RetailStepDefinition extends Base{

RetailPageObject retailPageObject = new RetailPageObject();

@Given("User is on Retail website")
public void user_is_on_retail_website() {
String expectedText = "TEST ENVIRONMENT";
String actualText = retailPageObject.getTextEnvironmentText();
Assert.assertEquals(expectedText, actualText);
logger.info("text test Environment was verified");
}



@And("User click on MyAccount")
public void user_click_on_my_account() {
retailPageObject.ClickmyAccountButton();
logger.info("My Accout Button Was Succesfully Clicked");
}



@When("User click on Login")
public void user_click_on_login() {
retailPageObject.ClickOnlonginlink();
logger.info("link was successfully clicked");
}



@When("User enter username 'userName'and password {string}")
public void user_enter_username_user_name_and_password(String string) {
retailPageObject.enterEmailAdress("salim23525@gmail.com");
retailPageObject.enterPassWord("123456");
logger.info("email And Password Were Entered Successfully");
}



@And("User click on Login button")
public void user_click_on_login_button() {
retailPageObject.clickOnLoginButton();
logger.info("was able to click successfully on login button");
}



@Then("User should be logged in to MyAccount dashboard")
public void user_should_be_logged_in_to_my_account_dashboard() {
String expectedText = "My Account";
String actualText = retailPageObject.loggedInToMyAccountDashBoardText();
Assert.assertEquals(expectedText, actualText);
logger.info("user on My Account dashboard ");
Utils.takeScreenShot();

}



@When("User click on 'Register for an Affiliate Account'link")
public void user_click_on_register_for_an_affiliate_account_link() throws InterruptedException{
retailPageObject.RegisterForAnAffiliateAccount();

logger.info("successfully Register For Affiliate Account ");
Thread.sleep(2000);

}



@And("User fill affiliate form with below information")
public void user_fill_affiliate_form_with_below_information(DataTable dataTable) throws InterruptedException {
List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
retailPageObject.enterCompanyName(data.get(0).get("company"));
retailPageObject.enterWebSite(data.get(0).get("website"));
retailPageObject.enterTaxId(data.get(0).get("taxID"));
retailPageObject.enterpayeeeName(data.get(0).get("paymentMethod"));

logger.info("user was able to filled affiated account form");
Thread.sleep(2000);
}



@And("User check on About us check box")
public void user_check_on_about_us_check_box() throws InterruptedException {
retailPageObject.clickOnCheckBox();

logger.info("User check on About us check box successfully ");
Thread.sleep(2000);
}



@And("User click on continue button1")
public void user_click_on_continue_button1() {
retailPageObject.clickOnContinueButton();
logger.info("User clicked on Continue button successfully ");
Utils.takeScreenShot();
}



@Then("User should see a success message")
public void user_should_see_a_success_message() {
String expectedText = "Success: Your account has been successfully updated.";
String actualText = retailPageObject.getAffiliatSuccessMessage();
Assert.assertEquals(expectedText, actualText);
logger.info("User was able to see the success message ");
}



@When("User click on Edit your affiliate information link")
public void user_click_on_edit_your_affiliate_information_link() {
retailPageObject.clickOnEditYourAffiliateInformation();
logger.info("User clicked on Edit affiliate information link successfully ");
}



@And("user click on Bank Transfer radio button")
public void user_click_on_bank_transfer_radio_button() {
retailPageObject.clickOnBankTransferRadioButton();
logger.info("user clicked on Bank Transfer radio button successefully");
}



@And("User fill Bank information with below information")
public void user_fill_bank_information_with_below_information(DataTable dataTable) {
List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);



retailPageObject.enterBankName(data.get(0).get("bankName"));
retailPageObject.enterAbaNumber(data.get(0).get("abaNumber"));
retailPageObject.enterSwiftCode(data.get(0).get("swiftCode"));
retailPageObject.enterAccountName(data.get(0).get("accountName"));
retailPageObject.enterAccountNumber(data.get(0).get("accountNumber"));
logger.info("user was able to edit affiated account form successfully");
//|bankName|abaNumber|swiftCode|accountName|accountNumber|



}



@When("User click on continue button2")
public void user_click_on_continue_button2() {
retailPageObject.clickOnClickOnContinueButton();
logger.info("continue button clicked");
Utils.takeScreenShot();
}



@Then("User should see a success Message")
public void user_should_see_a_success_message1() {
String expectedText = "Success: Your account has been successfully updated.";
String actualMessage = retailPageObject.getEditSuccessMessage();
Assert.assertEquals(expectedText, actualMessage);
logger.info("User was able to see the success message");
}



@When("User click on 'Edit your account information'link")
public void user_click_on_edit_your_account_information_link() {
retailPageObject.clickOnEditAccountInformation();
logger.info("user clicked on Edit your account information link successfully");
}



@And("User modify below information")
public void user_modify_below_information(DataTable dataTable) {

List<Map<String, String>> data= dataTable.asMaps(String.class, String.class);
retailPageObject.enterEditfirstName(data.get(0).get("firstname"));
retailPageObject.enterEditLastName(data.get(0).get("lastName"));
retailPageObject.EditEmail(data.get(0).get("email"));
retailPageObject.EditTelephone(data.get(0).get("telephone"));
logger.info("user was able to modify account information successfully");
// |firstname|lastName|email|telephone|



}



@When("User click on continue button3")
public void user_click_on_continue_button3() {
retailPageObject.ContinueButton1();
logger.info("user clicked on edit account info continue button successfully");
}



@Then("User Should see a message {string}")
public void user_should_see_a_message(String string) {
String expectedMessage = "Success: Your account has been successfully updated.";
String actualMessage =retailPageObject.getEditSuccessMessage1();
Assert.assertEquals(expectedMessage,actualMessage);
logger.info("Your account has been successfully updated");
Utils.takeScreenShot();
}

}