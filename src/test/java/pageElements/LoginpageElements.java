package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageElements {
	WebDriver driver;

	public LoginpageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public By user=By.cssSelector("input[aria-label='Enter Email Id']");
	public By pwd=By.cssSelector("input[aria-label='Enter Password']");
	public By loginBtn=By.cssSelector("flt-semantics[aria-label='Login']");
	
	@FindBy(css = "flutter-view")
	public WebElement homebutton;

	@FindBy(css = "flt-semantics[aria-label='LOGIN']")
	public WebElement homeloginButton;

	@FindBy(css = "input[aria-label='Enter Email Id']")
	public WebElement emailField;

	@FindBy(css = "input[aria-label='Enter Password']")
	public WebElement passwordField;

	@FindBy(css = "flt-semantics[aria-label='Login']")
	public WebElement signInButton;
	
	@FindBy(css = "flt-semantics[aria-label='RFQ']")
	public WebElement RFQLink;

	public void clickOnLogin() {
		homeloginButton.click();
	}

	public void fillEmailData(String email) {
		//emailField.isEnabled();
		new Actions(driver).moveToElement(emailField).doubleClick().sendKeys(email).build().perform();
	}
	public void fillPasswordData(String pwd) {
		//passwordField.isEnabled();
		new Actions(driver).moveToElement(passwordField).doubleClick().sendKeys(pwd).build().perform();

	}
	 public void clickSignInButton() {
        signInButton.isEnabled();
        new Actions(driver).moveToElement(signInButton).click().build().perform();
    }
	 
	 public boolean isRfqDisplayed(){
		 return RFQLink.isDisplayed();
		 
	 }

}
