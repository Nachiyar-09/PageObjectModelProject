package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	
	/*public static void GetTitle(String ActualTitle, String ExpectedTitle) {
		String ActualTitle = "";
	 String ExpectedTitle = driver.getTitle();
		if(ExpectedTitle.matches(ActualTitle)) {
			System.out.println("Title matches with the current page");}
			else {
				System.out.println("Title not matches with the current page");
			}
		}*/
	
	
	@BeforeClass
	public void setup() {
		Reporter.log("---<Starting Chrome Browser>---");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://demo.guru99.com/V4/");
	    driver.manage().window().maximize();
	    Reporter.log("---<Launched URL>---");
	   }
	@AfterClass
	public void teardown() {
		driver.close();
		Reporter.log("---<Closing Browser>---");
		
		
	}
}

