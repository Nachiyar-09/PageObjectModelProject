package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.Guru99ExactTestCase;

public class NewCustomerPage extends Guru99ExactTestCase{

	
	static  By NewCustomerLink = By.xpath("//a[normalize-space()='New Customer']");
	static  By CustomerName = By.name("name");
	static By Gender = By.xpath("//input[@value='f']");
	static  By DOB = By.name("dob");
	static By address = By.name("addr");
	static By City = By.name("city");
	static  By state = By.name("state");
	static  By pinnumber = By.name("pinno");
	static By teleph = By.name("telephoneno");
	static By emailid = By.name("emailid");
	static By password = By.name("password");
	static By submitbutton = By.name("sub");
 	  
 	  
 	public static WebElement NewcustomerCreation(WebDriver driver){
		return driver.findElement(NewCustomerLink);}
 	
 	public static WebElement setcustomername(WebDriver driver) {
		return driver.findElement(CustomerName);}
 	
 	public static WebElement setgender(WebDriver driver) {
 		 return driver.findElement(Gender);}
 	
 	public static WebElement setdob(WebDriver driver) {
 		return driver.findElement(DOB);}
 	
 	public static WebElement setaddr(WebDriver driver) {
 		return driver.findElement(address);}
 	
 	public static WebElement setcity(WebDriver driver) {
 		return driver.findElement(City);}
 	
 	public static WebElement setstate(WebDriver driver) {
 		return driver.findElement(state);}
 	
 	public static WebElement setpin(WebDriver driver) {
 		return driver.findElement(pinnumber);}
 	
 	public static WebElement settel(WebDriver driver) {
 		return driver.findElement(teleph);}
 	
 	public static WebElement setemail(WebDriver driver) {
 		return driver.findElement(emailid);}
 	
 	public static WebElement setpass(WebDriver driver) {
 		return driver.findElement(password);}
 	
 	public static WebElement submitclick(WebDriver driver) {
 		return driver.findElement(submitbutton);}
 	
}
			
 	  
 	
 	  
