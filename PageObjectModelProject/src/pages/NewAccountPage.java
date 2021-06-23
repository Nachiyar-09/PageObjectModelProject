package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.Guru99ExactTestCase;

public class NewAccountPage extends Guru99ExactTestCase {

	
	static By NewAcctLink = By.xpath("//a[normalize-space()='New Account']");
	static By CustomerId = By.name("cusid");
	static By AccttypeSelect = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select/option[2]");
	static By InitialDeposit = By.name("inideposit");
	static By Submitclick = By.name("button2");
	

   public static WebElement NewAcctCreation(WebDriver driver) {
	 return driver.findElement(NewAcctLink);}
   
   public static WebElement CustomerId(WebDriver driver) {
	 return driver.findElement(CustomerId);}
   
   public static WebElement Deposit(WebDriver driver){ 
		  return driver.findElement(InitialDeposit);}
   
   public static WebElement SubmitClick(WebDriver driver) {
		return  driver.findElement(Submitclick);}
   
   public static WebElement AccountTypeDrpDown(WebDriver driver) {
	   return  driver.findElement(AccttypeSelect);}
	
	 
   }


