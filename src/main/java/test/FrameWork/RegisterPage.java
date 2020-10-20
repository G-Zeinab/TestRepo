package test.FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase {

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "first_name")
	WebElement FirstNameTXT;
	
	@FindBy(name ="last_name")
	WebElement LastNameTXT;
	
	@FindBy(name="fld_email")
	WebElement EmailTXT;
	
	@FindBy(name="fld_cemail")
	WebElement ConfirmEmailTXT;
	
	@FindBy(name = "fld_username")
	WebElement UserTxT;
	
	@FindBy(name= "fld_password")
	WebElement PassTxT;
	
	@FindBy (name="dob")
	WebElement BirthDateTXT;
	
	@FindBy(name="phone")
	WebElement PhoneTxT;
	 
	@FindBy (name="address")
	WebElement AddressTxT;
	
	@FindBy (name="city")
	WebElement CityTxT;
	
	@FindBy (name="state")
	WebElement StateTxT;
	
	@FindBy (name="zip")
    WebElement ZipCodeTXT;

    public void RegisterMethod(String firstname, String lastname, String email, String confirmemail,
    		String user,String pass,String phone, String address, String city)
    {
    	
    	FirstNameTXT.sendKeys(firstname);
    	LastNameTXT.sendKeys(lastname);
    	EmailTXT.sendKeys(email);
    	ConfirmEmailTXT.sendKeys(confirmemail);
    	UserTxT.sendKeys(user);
    	PassTxT.sendKeys(pass);
    	CharSequence phone1 = "012055555555";
		PhoneTxT.sendKeys(phone1);
    	AddressTxT.sendKeys(address);
    	CityTxT.sendKeys(city);
    	CharSequence code1 = "55555";
		ZipCodeTXT.sendKeys(code1);
    	
	}
    
    
}
    
