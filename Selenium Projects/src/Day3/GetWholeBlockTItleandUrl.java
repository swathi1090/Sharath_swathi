package Day3;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GetWholeBlockTItleandUrl {

	public static void main(String[] args) throws IOException {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");

		WebDriver driver = new FirefoxDriver(fp);
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
		WebElement block = driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul"));
		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) {
			String text = links.get(i).getText();
			links.get(i).click();
			System.out.println(text);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			//To take a screen shot and store them with their respective file names
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\code repository\\Selenium Projects\\src\\Screenshots"+text+".png"));
			
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(3);
			
			block = driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul"));
			links = block.findElements(By.tagName("a"));
			
			
		}

	}

}
