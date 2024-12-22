package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo4 {
	@Parameters({"URL"})
	@Test
	public void webLoginCarLoan(String urlname)
	{
		System.out.println("WebLoginCarLoan - Demo4class");
		System.out.println(urlname);
	}
	@Test(groups= {"Smoke"},enabled=false)
	public void mobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarLoan - Demo4class");
	}
	@Test(dependsOnMethods= {"webLoginCarLoan"})
	public void apiLoginCarLoan()
	{
		System.out.println("API Login Car Loan - Demo4class");
	}
	@BeforeTest
	public void beforecarloan()
	{
		System.out.println("Execute before carLoan-BeforeTest - Demo4class");
	}

}
