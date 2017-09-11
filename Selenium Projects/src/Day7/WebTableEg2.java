package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class WebTableEg2 {

	public static void main(String[] args) {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");

		WebDriver driver = new FirefoxDriver(fp);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']/b")).click();
		driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']")).click();

		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());

		for (int i = 0; i < rows.size(); i++) {

			// String text = rows.get(i).getText();
			// System.out.println(text);
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			//System.out.println(cols.size());
			String eid = cols.get(1).getText();
			if(eid.equalsIgnoreCase("0013"))
			{
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
			
		}
	}

}
