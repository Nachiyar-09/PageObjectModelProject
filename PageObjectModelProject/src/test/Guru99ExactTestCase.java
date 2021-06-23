package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BaseClass;
import pages.GuruLoginPage;
import pages.LoginPageUsingPageFactory;
import pages.NewAccountPage;
import pages.NewAccountUsingPageFactory;
import pages.NewCustCreationUsingPageFactory;
import pages.NewCustomerPage;

public class Guru99ExactTestCase extends BaseClass{
 
	

@Test
public void Testpages() {
	
	PageFactory.initElements(driver,LoginPageUsingPageFactory.class);
	
	LoginPageUsingPageFactory.setUsername.sendKeys("mngr334527");
	LoginPageUsingPageFactory.Setpassword.sendKeys("YdEraqY");
	LoginPageUsingPageFactory.LoginClick.click();
	
	                 
	PageFactory.initElements(driver,NewCustCreationUsingPageFactory.class);

	NewCustCreationUsingPageFactory.NewcustomerCreation.click();
	NewCustCreationUsingPageFactory.setcustomername.sendKeys("achu");
	NewCustCreationUsingPageFactory.setgender.click();
	NewCustCreationUsingPageFactory.setdob.sendKeys("12131778");
	NewCustCreationUsingPageFactory.setaddr.sendKeys("New Colony street alwarpet");
	NewCustCreationUsingPageFactory.setcity.sendKeys("Chennai");
	NewCustCreationUsingPageFactory.setstate.sendKeys("TamilNadu");
	NewCustCreationUsingPageFactory.setpin.sendKeys("600073");
	NewCustCreationUsingPageFactory.settel.sendKeys("1234556568");
	NewCustCreationUsingPageFactory.setemail.sendKeys("zxcvbn@gmail.com");
	NewCustCreationUsingPageFactory.setpass.sendKeys("qwertyy");
	NewCustCreationUsingPageFactory.submitclick.click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//BaseClass.GetTitle(ActualTitle, ExpectedTitle);
	if(driver.getTitle().contentEquals("Guru99 Bank Customer Registration Page")) {
		System.out.println("Customer Registerd Successfully");} 
	
	PageFactory.initElements(driver,NewAccountUsingPageFactory.class);
	
	NewAccountUsingPageFactory.NewAcctCreation.click();
	NewAccountUsingPageFactory.CustomerId.sendKeys("8320");
	NewAccountUsingPageFactory.AccountTypeDrpDown.click();
	NewAccountUsingPageFactory.Deposit.sendKeys("10000");
	NewAccountUsingPageFactory.SubmitClick.click();
	
	if(driver.getTitle().contentEquals("Gtpl Bank Customer Registration Page")) {
		System.out.println("Account created Successfully");}
	
  
}}
