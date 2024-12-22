package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("Personal Loan - Demo2class");
	}
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute this first - BeforeTest - Demo2class");
	}
}
