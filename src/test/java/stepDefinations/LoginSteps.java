package stepDefinations;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageElements.IntermediaryProductsPageElements;
import pageElements.LoginpageElements;
import utilities.ReadConfig;

public class LoginSteps {

	public WebDriver driver = Hooks.driver;

	LoginpageElements lp = new LoginpageElements(driver);
	IntermediaryProductsPageElements ip = new IntermediaryProductsPageElements(driver);
	ReadConfig rd = new ReadConfig();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	@Given("^Login from login page$")
	public void login_from_login_page() {
		lp.clickOnLogin();

	}

	@When("^Submit email using \"([^\"]*)\" and password using \"([^\"]*)\"$")
	public void submit_email_using_and_password_using(String arg1, String arg2) throws InterruptedException {
		wait.until(ExpectedConditions.presenceOfElementLocated(lp.user));
		//Thread.sleep(5000);
		lp.fillEmailData(arg1);
		wait.until(ExpectedConditions.presenceOfElementLocated(lp.pwd));
		//wait.until(ExpectedConditions.visibilityOf(lp.passwordField));
		//Thread.sleep(6000);
		lp.fillPasswordData(arg2);
		wait.until(ExpectedConditions.presenceOfElementLocated(lp.loginBtn));
		lp.clickSignInButton();

	}

	@When("^Submit email and password$")
	public void Submit_email_and_password() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(lp.emailField));
		Thread.sleep(5000);
		lp.fillEmailData("admin@ojas-it.com");
		wait.until(ExpectedConditions.visibilityOf(lp.passwordField));
		Thread.sleep(6000);
		lp.fillPasswordData("Admin@123");
		wait.until(ExpectedConditions.visibilityOf(lp.signInButton));
		lp.clickSignInButton();

	}

	@When("^Submit Email and Password$")
	public void Submit_Email_and_Password() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(lp.emailField));
		Thread.sleep(5000);
		lp.fillEmailData(rd.getValue("email"));
		wait.until(ExpectedConditions.visibilityOf(lp.passwordField));
		Thread.sleep(6000);
		lp.fillPasswordData(rd.getValue("password"));
		wait.until(ExpectedConditions.visibilityOf(lp.signInButton));
		lp.clickSignInButton();

	}

	@Then("^Success login to home page with displaying account button$")
	public void success_login_to_home_page_with_displaying_account_button() {
		wait.until(ExpectedConditions.visibilityOf(lp.RFQLink));
		Assert.assertTrue(lp.isRfqDisplayed());

	}

	@When("^Click on Intermediary Details and Select Products$")
	public void click_on_Intermediary_Details_and_Select_Products() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(ip.IntermediaryDropdown));
		ip.clickOnIntermediary();
		wait.until(ExpectedConditions.visibilityOf(ip.ProductsButton));
		ip.clickOnProducts();
	}

	@When("^Create new product using Create product$")
	public void create_new_product_using_Create_product() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(ip.CreateProductButton));
		ip.clickOnCreateProduct();
		wait.until(ExpectedConditions.visibilityOf(ip.ProductnameFiled));
		ip.enterProductName("Testing");
		wait.until(ExpectedConditions.visibilityOf(ip.ProductTypeDropdown));
		ip.selectProductType();
		wait.until(ExpectedConditions.visibilityOf(ip.EBValue));
		ip.selectEBProduct();
	}

	@Then("^Click on AddProduct$")
	public void click_on_AddProduct() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(ip.AddProduct));
		ip.addProduct();
		wait.until(ExpectedConditions.visibilityOf(ip.ConfirmAddProduct));
		Assert.assertTrue(ip.productAdded());
		wait.until(ExpectedConditions.visibilityOf(ip.ConfirmAddProduct));
		ip.closePopUP();

	}

	@When("^Search Product and Click on Show Menu$")
	public void search_Product_and_Click_on_Show_Menu() {
		wait.until(ExpectedConditions.visibilityOf(ip.SearchField));
		ip.searchProduct("Testing");
		wait.until(ExpectedConditions.visibilityOf(ip.ShowmenuBtn));
		ip.clickonShowMenu();

	}

	@When("^Add new coverage using add coverage$")
	public void add_new_coverage_using_add_coverage() {
		wait.until(ExpectedConditions.visibilityOf(ip.AddCoverageBtn));
		ip.clickOnAddCoverage();
		ip.enterCoverageName("Test");

	}

	@Then("^Add Coverage scucess$")
	public void add_Coverage_scucess() {
		wait.until(ExpectedConditions.visibilityOf(ip.AddBtn));
		ip.clickOnAddBtn();
		wait.until(ExpectedConditions.visibilityOf(ip.OkBtn));
		ip.clickonOkBtn();

	}
	@When("^Delete product using delete option$")
	public void delete_product_using_delete_option()  {
		wait.until(ExpectedConditions.visibilityOf(ip.DeleteProductBtn));
		ip.clickOnProductDelete();
	}

	@Then("^Confirm delete product$")
	public void confirm_delete_product()  {
		wait.until(ExpectedConditions.visibilityOf(ip.ConfimDeleteYesBtn));
		ip.acceptDeleteProduct();
		wait.until(ExpectedConditions.visibilityOf(ip.OkBtn));
		ip.clickonOkBtn();
	}
}
