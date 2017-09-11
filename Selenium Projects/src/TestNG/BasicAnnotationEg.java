package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotationEg {
	
	@Test(priority=0)
	public void function1(){
		System.out.println("This is function1 code");
	}
	@Test(priority =1, description = "f2 code")
	public void function2(){
		
		//throw new SkipException("This is to be skipped");
		System.out.println("This is function 2 code");
	}
	@Test(priority =2)
	public void apple(){
		System.out.println("This is apple code");
	}
	@BeforeMethod
	public void bm(){
		System.out.println("This is before method");
	}
	@AfterMethod
	public void am(){
		System.out.println("This is after method");
	}
	@BeforeClass
	public void bc(){
		System.out.println("This is before class");
	}
	@AfterClass
	public void ac(){
		System.out.println("This is after class");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("This is before test");
	}
	@AfterTest
	public void at()
	{
		System.out.println("This is after test");
		
	}


}
