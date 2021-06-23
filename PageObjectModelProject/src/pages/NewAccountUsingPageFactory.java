package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountUsingPageFactory {

	@FindBy(xpath ="//a[normalize-space()='New Account']")
	public static WebElement NewAcctCreation;
	
	@FindBy(name ="cusid")
	public static WebElement CustomerId;
	
	@FindBy(xpath ="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select/option[2]")
	public static WebElement AccountTypeDrpDown;
	
	@FindBy(name ="inideposit")
	public static WebElement Deposit;
	
	@FindBy(name ="button2")
	public static WebElement SubmitClick;
}
