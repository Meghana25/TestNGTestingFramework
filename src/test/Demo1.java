package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo1 {
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute this at last - Aftertest - Demo1class");
	}
	@Test
	public void example1()
	{
		System.out.println("Hello - Demo1class");
		Assert.assertTrue(true);
	}
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("I am the no. 1 from last - After Suite - Demo1class");
	}
	@Test
	public void example2()
	{
		System.out.println("Bye - Demo1class");
	}

}
