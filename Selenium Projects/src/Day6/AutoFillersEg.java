package Day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutoFillersEg {

	public static void main(String[] args) {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");

		WebDriver driver = new FirefoxDriver(fp);
		driver.get("https://redbus.in");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("R");
		Sleeper.sleepTightInSeconds(3);

		List<WebElement> list = driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) 
		{
			String text = list.get(i).getText();
			System.out.println(text);
			
			if (text.equalsIgnoreCase("Rajamundry"))
			{
				list.get(i).click();
				break;
				}

		}

	}

}
