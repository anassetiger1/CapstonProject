package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	public HomePageObject () {
		  PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath = "//a[text() ='TEST ENVIRONMENT']")
	 private WebElement testEnviromentText;
	 public String getTextEnvironmentText() {
		 String UiText = testEnviromentText.getText();
		 return UiText;
		 }
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement UserClickOnCurrency;
	public void ClickOnCurrency() {
		UserClickOnCurrency.click();
	}
	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement UserChoseEuroFromDropDown;
	public void ChooseEuroFromDropSown() {
		UserChoseEuroFromDropDown.click();
	}
	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/strong")
	private WebElement currencyValueShouldChangeToEuro;
	public void CurrencyValueAsEuro() {
		 currencyValueShouldChangeToEuro.click();
	}
	@FindBy(xpath = "//a[@title='Shopping Cart']")
	private WebElement UserClickOnShoppingCart;
	public void ClickOnShoppingCart() {
		UserClickOnShoppingCart.click();
	}
	@FindBy(xpath = "//*[@id=\"content\"]/p")
	private WebElement YourShoppingCartIsEmpty;
	public boolean UserShoppingCartIsEmpty() {
		if (YourShoppingCartIsEmpty.isDisplayed())
			return true;
		else
			return false;
	}

}
