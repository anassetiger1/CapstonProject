package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {

        PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement DesktopsTab ;
	public void clickOnDesktopTab() {
		
		Utils.mouseToElement(DesktopsTab);
	}
	
	@FindBy(xpath = "//*[@id=\'menu\']/div[2]/ul/li[1]/div/a")
    private WebElement ShowAllDesktops;
    public void clickShowAllDesktops () {
        ShowAllDesktops.click();
	}
    
    @FindBy(tagName = "img")
    private List <WebElement> items;
    public List<WebElement> desktopsItems(){
    List<WebElement> itemsDesk = items;
    return itemsDesk;


	}
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]")
    private WebElement addToCartHPLP3065;
	public void AddToCartHPLP3065() {
		 addToCartHPLP3065.click();
	}
	@FindBy(xpath = " //a[text()='HP LP3065']")
	private WebElement userClickOnAddToTheCartButton;
		public void AddToCart() {
			userClickOnAddToTheCartButton.click();
	}
	@FindBy(id = "input-quantity")
	private WebElement userSelectQuantity;
	public void selectQuantity(int a) {
		 userSelectQuantity.sendKeys("1");
	}
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement userClickOnAddButton;
	public void AddItemToCart() {
		userClickOnAddButton.click();
	
	}
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement userMustSeeSuccesMessage;
	
	@FindBy(xpath="//a[text()='Canon EOS 5D Camera']")
	private WebElement CanonCameraLink;
	public void ClickOnCameraLink() {
		CanonCameraLink.click();
		//Utils.clickWithJSE(CanonCameraLink);
	}
	
	@FindBy(css="#input-option226 > option:nth-child(2)")
    private WebElement SelectRed;
	public void ClickOnSelectRed() {
        SelectRed.click();
       // Utils.clickWithJSE(SelectRed);
			
	}
	@FindBy(id = "input-quantity")
	private WebElement userSelect1OnQuantity;
	public void SelectQuantity(String string){
		userSelect1OnQuantity.clear();
		userSelect1OnQuantity.sendKeys(string);
	}
	@FindBy(id = "button-cart")
	private WebElement userClickedOnAddCamaeraButton;
	public void AddCameraButton() {
		userClickedOnAddCamaeraButton.click();
		
	}
	@FindBy(xpath="(//a[text()='Canon EOS 5D Camera'])[3]")
    private WebElement CanonScessMessage;

	public boolean validateSucessMessage() {
		if (CanonScessMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement userClickOnReviewButt;
	public void ClickOnReview() {
		 userClickOnReviewButt.click();
	}
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement userEnterName;
	public void UserName(String string) {
		userEnterName.sendKeys("anasse");
	}
	@FindBy(xpath = "//*[@id=\"input-review\"]")
	private WebElement userWriteYourReview;
	public void sendReview(String review) {
		userWriteYourReview.sendKeys(review);
	}
	@FindBy(xpath = "//*[@id=\"form-review\"]/div[4]/div/input[4]")
	private WebElement UserChooseRatingButton;
	public void ClickOnRatingButton() {
		UserChooseRatingButton.click();
		
	}
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement clickOncontunioButton;
	public void clickOncontunioButton() {
		clickOncontunioButton.click();
	}
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement UserSuccessMessage;
	public boolean reviewMessage() {

	    boolean outcomeMessage = UserSuccessMessage.isDisplayed();

	    return outcomeMessage;
	   
	    }
	
	
	
}


		



		




