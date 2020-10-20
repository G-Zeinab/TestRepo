package test.FrameWork;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import testData.ExcelDataReader;

@Test
public class RegisterTest extends TestBase
{
	@DataProvider (name="data")
	public Object[][] getTestData() throws FileNotFoundException
	{
		ExcelDataReader Obj = new ExcelDataReader();
				return Obj.getExcelData();
	}
	@BeforeTest
	public void openBrowser()
	{
		openChrome("https://www.performancetestingpractice.com/register.php");
		
	}
	
	public void testResgister(String firstname, String lastname, String email, String confirmemail,
    		String user,String pass, String phone,String address,String code)
	
	{
		RegisterPage regObj = new RegisterPage(driver);
		regObj.RegisterMethod("firstname", "lastname", "email", "confirmemail", "user", "pass","phone",
          "address" , "code");
		
	}
}

