package Day3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class MethodstoIdentifyElement {

	public static void main(String[] args) {

		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");

		WebDriver driver = new FirefoxDriver(fp);
		driver.get("http://primusbank.qedgetech.com/sitemap.html");

		// Method 1
		// driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li[1]/a")).click();

		// Method 2

	/*	WebElement block = driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul"));
		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			String text = links.get(i).getText();
			System.out.println(text);

			if (text.equalsIgnoreCase("home")) {
				links.get(i).click();
				break;

			}
		}*/
		//Method 3
		driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td")).findElement(By.linkText("Home")).click();
		
	}

}
