package stepDefinations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.ReadConfig;

public class Hooks {

	public static WebDriver driver;
	
	@Before
	public void LaunchBrowser() throws InterruptedException {
		ReadConfig rd = new ReadConfig();
		driver= new ChromeDriver();
		driver.get(rd.getValue("url"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript(rd.getValue("enable-flutter-dom"));
	}
	@ After
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
//		driver.close();
	}

}
