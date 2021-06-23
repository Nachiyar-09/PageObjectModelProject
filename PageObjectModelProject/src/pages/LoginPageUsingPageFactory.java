package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageUsingPageFactory extends BaseClass {

	@FindBy(name ="uid")
	public  static WebElement setUsername;
	
	@FindBy(name="password")
	public static WebElement Setpassword;
	
	@FindBy(name ="btnLogin")
	public static WebElement LoginClick;
	
	
}
