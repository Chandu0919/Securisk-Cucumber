package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntermediaryProductsPageElements {
	WebDriver driver;

	public IntermediaryProductsPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//flt-semantics[contains(@aria-label,'Intermediary Details')]")
	public WebElement IntermediaryDropdown;
	@FindBy(css = "flt-semantics[aria-label='Products']")
	public WebElement ProductsButton;
	@FindBy(css = "flt-semantics[aria-label='TPA List']")
	public WebElement TPAButton;
	@FindBy(css = "flt-semantics[aria-label='Insurer List']")
	public WebElement InsurerlistButton;
	@FindBy(css = "flt-semantics[aria-label='Create Product']")
	public WebElement CreateProductButton;
	@FindBy(css = "input[aria-label='Prouct Name']")
	public WebElement ProductnameFiled;
	@FindBy(xpath = "//flt-semantics[contains(@aria-label,'Select Product Type')]")
	public WebElement ProductTypeDropdown;
	@FindBy(css = "flt-semantics[aria-label='EB']")
	public WebElement EBValue;
	@FindBy(css = "flt-semantics[aria-label='NON-EB']")
	public WebElement NonEBValue;
	@FindBy(css = "flt-semantics[aria-label='Add Product']")
	public WebElement AddProduct;
	@FindBy(css = "flt-semantics[aria-label='Product added successfully!']")
	public WebElement ConfirmAddProduct;
	@FindBy(css = "flt-semantics[aria-label='Close']")
	public WebElement ClosePopupbtn;
	@FindBy(css = "input[aria-label='Search']")
	public WebElement SearchField;
	@FindBy(xpath = "(//flt-semantics[@aria-label='Show menu'])[2]")
	public WebElement ShowmenuBtn;
	@FindBy(css = "flt-semantics[aria-label='Add Coverage']")
	public WebElement AddCoverageBtn;
	@FindBy(css = "input[aria-label='Enter coverage name']")
	public WebElement EnterCoverageField;
	@FindBy(css = "flt-semantics[aria-label='Add']")
	public WebElement AddBtn;
	@FindBy(css = "flt-semantics[aria-label='Delete']")
	public WebElement DeleteProductBtn;
	@FindBy(css = "flt-semantics[aria-label='Yes']")
	public WebElement ConfimDeleteYesBtn;
	@FindBy(css = "flt-semantics[aria-label='No']")
	public WebElement ConfimDeleteNoBtn;
	@FindBy(css = "flt-semantics[aria-label='Edit']")
	public WebElement EditProductBtn;
	@FindBy(css = "flt-semantics[aria-label='OK']")
	public WebElement OkBtn;
	@FindBy(css = "flt-semantics[aria-label='Show Coverages']")
	public WebElement ShowCoverageBtn;
	

	public void clickOnIntermediary() {
		IntermediaryDropdown.isEnabled();
		IntermediaryDropdown.click();
	}

	public void clickOnProducts() {
		ProductsButton.isEnabled();
		ProductsButton.click();
	}

	public void clickOnCreateProduct() {
		CreateProductButton.isEnabled();
		CreateProductButton.click();
	}

	public void enterProductName(String name) {
		ProductnameFiled.isEnabled();
		new Actions(driver).moveToElement(ProductnameFiled).click().sendKeys(name).build().perform();
	}

	public void selectProductType() {
		ProductTypeDropdown.isEnabled();
		ProductTypeDropdown.click();
	}

	public void selectEBProduct() {
		EBValue.isEnabled();
		EBValue.click();
	}

	public void selectNonEBProduct() {
		NonEBValue.isEnabled();
		NonEBValue.click();
	}

	public void addProduct() {
		AddProduct.isEnabled();
		AddProduct.click();
	}

	public boolean productAdded() {
		return (ConfirmAddProduct.isDisplayed());
		
	}
	public void closePopUP() {
		ClosePopupbtn.isEnabled();
		ClosePopupbtn.click();
	}
	
	public void searchProduct(String productname) {
		SearchField.isEnabled();
		new Actions(driver).moveToElement(SearchField).click().sendKeys(productname).build().perform();
	}
	public void clickonShowMenu() {
		ShowmenuBtn.isEnabled();
		new Actions(driver).moveToElement(ShowmenuBtn).click().build().perform();
	}
	
	public void clickOnAddCoverage() {
		AddCoverageBtn.isEnabled();
		new Actions(driver).moveToElement(AddCoverageBtn).click().build().perform();
	}
	public void enterCoverageName(String Coveragename) {
		EnterCoverageField.isEnabled();
		new Actions(driver).moveToElement(EnterCoverageField).click().sendKeys(Coveragename).build().perform();
	}
	public void clickOnAddBtn() {
		AddBtn.isEnabled();
		new Actions(driver).moveToElement(AddBtn).click().build().perform();
	}
	
	public void clickOnProductDelete() {
		DeleteProductBtn.isEnabled();
		new Actions(driver).moveToElement(DeleteProductBtn).click().build().perform();
	}
	
	public void acceptDeleteProduct() {
		ConfimDeleteYesBtn.isEnabled();
		new Actions(driver).moveToElement(ConfimDeleteYesBtn).click().build().perform();
	
	}
	public void clickonOkBtn() {
		OkBtn.isEnabled();
		new Actions(driver).moveToElement(OkBtn).click().build().perform();
	}
	public void rejectDeleteProduct() {
		ConfimDeleteNoBtn.isEnabled();
		new Actions(driver).moveToElement(ConfimDeleteNoBtn).click().build().perform();
	}
	
	public void clickOnShowCoverage() {
		ShowCoverageBtn.isEnabled();
		new Actions(driver).moveToElement(ShowCoverageBtn).click().build().perform();
	}
	
}
