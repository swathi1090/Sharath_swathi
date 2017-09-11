package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG_Master {
	
	public static WebDriver driver;
	public static String actval, expval;
	public static String Url = "http://opensource.demo.orangehrmlive.com";
	public static String u = "Admin", p ="admin";
	public static String f = "Pramod", l="Krishna";
	public static String ename = f+" "+l,uname=f+l+"123",pswd = f+l+"123", cpswd = f+l+"123";
	
	
	@BeforeSuite
	public void Org_Launch(){
		expval = "LOGIN";
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");
		driver = new FirefoxDriver(fp);
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval, "Launch failed");
		
	}
	@AfterSuite
	public void Org_close(){
		driver.close();
	}
	@BeforeTest
	public void Org_Login(){
		expval = "welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u); 
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(3);
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval, "Login failed");

	}
	@AfterTest
	public void Org_Logout(){
		
		Sleeper.sleepTightInSeconds(3);
		expval = "LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div/ul/li[2]/a")).click();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval, "Logout failed");

	}

}
