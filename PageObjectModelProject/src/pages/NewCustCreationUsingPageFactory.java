package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustCreationUsingPageFactory {

	@FindBy(xpath="//a[normalize-space()='New Customer']")
	public static WebElement NewcustomerCreation;
	
	@FindBy(name ="name")
	public static WebElement setcustomername;
	
	@FindBy(xpath ="//input[@value='f']")
	public static WebElement setgender;
	
	@FindBy(name = "dob")
	public static WebElement setdob;
	
	@FindBy(name ="addr")
	public static WebElement setaddr;
	
	@FindBy(name ="city")
	public static WebElement setcity;
	
	@FindBy(name ="state")
	public static WebElement setstate;
	
	@FindBy(name ="pinno")
	public static WebElement setpin;
	
	@FindBy(name ="telephoneno")
	public static WebElement settel;
	
	@FindBy(name ="emailid")
	public static WebElement setemail;
	
	@FindBy(name ="password")
	public static WebElement setpass;
	
	@FindBy(name ="sub")
	public static WebElement submitclick;
}
