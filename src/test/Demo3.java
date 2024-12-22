package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	@BeforeClass
	public void beforeClassinvoke()
	{
		System.out.println("Before executing any methods in the class  - Before class - Demo3class");
	}
	@AfterClass
	public void afterClassinvoke()
	{
		System.out.println("After executing all methods in the class  - After class - Demo3class");
	}
	@Parameters({"URL","APIkey/username"})
	@Test
	public void webLoginHomeLoan(String url,String key)
	{
		System.out.println("WebLoginHomeLoan - Demo3class");
		System.out.println(url);
		System.out.println(key);
	}
	@BeforeMethod
	public void beforeeveryMethod()
	{
		System.out.println("I will execute BEFORE every method in Demo3 class - BeforeMethod - Demo3class");
	}
	@AfterMethod
	public void aftereveryMethod()
	{
		System.out.println("I will execute AFTER every method in Demo3 class - AFTERMethod - Demo3class");
	}
	@Test(groups= {"Smoke"})
	public void mobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeLoan - Demo3class");
	}
	@Test
	public void apiLoginHomeLoan()
	{
		System.out.println("API LoginHomeLoan - Demo3class");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am Number 1 - Before Suite - Demo3class");
	}
	@Test(dataProvider="getData",groups= {"Smoke"})
	public void mobileSigninHomeLoan(String username,String password)
	{
		System.out.println("mobileSigninHomeLoan- Demo3class");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(timeOut=4000)
	public void mobileSignoutHomeLoan()
	{
		System.out.println("mobileSignoutHomeLoan - Demo3class");
	}
	@BeforeTest
	public void prerequisteHOMELOAN()
	{
		System.out.println("I will execute this first HomelOAN - BeforeTest - Demo3class");
	}
	@DataProvider
	public Object[][] getData()
	{
		//combinations(3) of username, password(2)
		//1st - good credit history
		//2nd - no credit history
		//3rd - fradulent credit history
		Object[][] data = new Object[3][2]; //Multidimensions object Array
		//1st - columns in the row are nothing but values for particular combination(row)
		data[0][0] ="firstsetusername";
		data[0][1] ="firstsetpassword";
		//2nd
		data[1][0]="secondsetusername";
		data[1][1]="secondsetpassword";
		//3rd
		data[2][0]="thirdsetusername";
		data[2][1]="thirdsetpassword";
		return data;
	}
	

}
