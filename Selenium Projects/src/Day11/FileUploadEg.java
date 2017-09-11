package Day11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileUploadEg {

	public static void main(String[] args) throws IOException {
		
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");
		WebDriver driver = new FirefoxDriver(fp);
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		
		driver.findElement(By.id("identifierId")).sendKeys("swathi.yoganand@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Sleeper.sleepTightInSeconds(5);

		
		driver.findElement(By.name("password")).sendKeys("coolwinter@90");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		
		Sleeper.sleepTightInSeconds(5);

		
		driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div")).click();
		
		Sleeper.sleepTightInSeconds(5);

		driver.findElement(By.xpath("html/body/div[14]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[4]/div/div[1]/div")).click();
		
		Sleeper.sleepTightInSeconds(8);
		Runtime.getRuntime().exec("C:\\Users\\swathi yoganand\\Desktop\\FileUpload.exe");

		
		
		
		

	}

}
