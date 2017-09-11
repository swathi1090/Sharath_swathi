package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimusBankEg {
	
	public static WebDriver driver;
	@BeforeClass
	public void Br_Launch(){
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");
		driver = new FirefoxDriver(fp);
		
	}
	@BeforeMethod
	public void App_Launch(){
		driver.get("http://primusbank.qedgetech.com");
	}
	@Test
	public void Login(){
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	@AfterMethod
	public void logout(){
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}
	@AfterClass
	public void close(){
		driver.close();
	}

}
