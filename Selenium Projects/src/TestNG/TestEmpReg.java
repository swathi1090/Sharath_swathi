package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestEmpReg extends TestNG_Master{
	
	@Test(dataProvider = "data")
	public void Org_EmpReg(String fn, String ln){
		expval = fn+" "+ln;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fn);
		driver.findElement(By.id("lastName")).sendKeys(ln);
		driver.findElement(By.id("btnSave")).click();
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval, "Employee Registration failed");
	}
	@DataProvider
	public Object [][] data(){
		
		Object [][] d = new Object[2][2];
		
		d[0][0] = "Kapil";
		d[0][1] = "Sharma";
		
		d[1][0] = "Bruno";
		d[1][1] = "Krishna";
		
		return d;
		
	}
	
}


