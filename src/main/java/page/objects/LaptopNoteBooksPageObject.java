package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;


public class LaptopNoteBooksPageObject extends Base {
	
	public LaptopNoteBooksPageObject() {

        PageFactory.initElements(driver, this);
        
      // Scenario1
	}
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement  UsercliCkonLaptopAndNoteBookTab;
	public void ClickOnLaptopAndBookTab() {
		UsercliCkonLaptopAndNoteBookTab.click();
	}
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")
	private WebElement UserClickOnShowallLaptopAndNoteBookOption;
	public void ClickOnShowAllOptions() {
		UserClickOnShowallLaptopAndNoteBookOption.click();
	}
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement userAddMacBookFromCart;
	public void AddMacBookFromCart() {
		 userAddMacBookFromCart.click();
		 
	}
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement userClickedOnAddMacToCart;
	public void ClickOnAddToCartButton() {
		userClickedOnAddMacToCart.click();
	}
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement ValidateSuccesMessage;
	public boolean ValidateSuccesMessage() {
		if (ValidateSuccesMessage.isDisplayed())
			return true;
		else
			return false;
	}
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement userShouldSeeAddedItemOnTheCart;
	public boolean userShouldSeeAddedItemOnTheCart() {
		if (userShouldSeeAddedItemOnTheCart.isDisplayed())
			return true;
		else
			return false;
}
	@FindBy(xpath = "//*[@id=\"cart\"]/button")
	private WebElement UserClickOnCartOption;
	public void ClickOnCartOption() {
		UserClickOnCartOption.click();
	}
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button")
	private WebElement  userClickOnRedXButton;
	public void ClickOnRemoveButton() {
		userClickOnRedXButton.click();
	}
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement itemShouldBeRemoved;
	
	public boolean userShouldSeeTheItemRemoved() {
		if (itemShouldBeRemoved.isDisplayed())
			return true;
		else 
			return false;
		
	}
	//scenario2
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement macBookCompareButton;
	public void ClickOnCompareMacBook() {
		macBookCompareButton.click();
	}
	
	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
	private WebElement makBookAirCompareButton;
	public void ClickOnMacAirIcon() {
		makBookAirCompareButton.click();
	
	}
	@FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
	private WebElement succesAddMacBookAirtoProductCompare;
	public void succesAddMacBookAirtoProductCompare() {
		succesAddMacBookAirtoProductCompare.isDisplayed();
		
	}
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement clickOnproductComprison;
	public void clickOnproductComprison() {
		clickOnproductComprison.click();
	}

	@FindBy(xpath = "/html/body/div[2]")
	private WebElement productCompareItem;
		public void productCompareItem() {
			productCompareItem.isDisplayed();
		}
	//scenario3
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement userClickedOnHeartIconForSonyVaIO;
	public void ClickOnHeartIcon() {
		userClickedOnHeartIconForSonyVaIO.click();
	}
	
	//scenario4
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement UserShouldGetAMessageToLoggin;
	public boolean userNeedToLogginToAddItem() {
		if (UserShouldGetAMessageToLoggin.isDisplayed())
			return true;
		else
			return false;
	}
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement userClickOnMacBookItem;
	public void ClickOnMacBook() {
		userClickOnMacBookItem.click();
	}
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
	private WebElement userShouldSeeTagPricOnUI;
		public boolean TagPriceShouldBePersentOnUI() {
		if (userShouldSeeTagPricOnUI.isDisplayed())
			return true;
		else 
			return false;
	}
}	
	
	