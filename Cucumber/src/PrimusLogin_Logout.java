import org.junit.Test;
import org.openqa.selenium.By;

public class PrimusLogin_Logout extends JUnitMaster {
	
	@Test
	public void p_login_logout(){
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");

		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();

	}

}
