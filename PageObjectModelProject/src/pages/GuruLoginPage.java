package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import test.Guru99ExactTestCase;


public class GuruLoginPage extends Guru99ExactTestCase{

   
	static By username = By.name("uid");
	static By password = By.name("password");
	static By loginbutton = By.name("btnLogin");
	
	/*public GuruLoginPage(WebDriver driver){
		this.driver = driver;}*/
		

	public  static WebElement setUsername(WebDriver driver) {
		return driver.findElement(username);}
		
	public static WebElement Setpassword(WebDriver driver) {
		return driver.findElement(password);}
		
	public static WebElement LoginClick(WebDriver driver) {
		return driver.findElement(loginbutton);}
	
	
	
}
		
		
	

