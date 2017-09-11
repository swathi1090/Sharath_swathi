package Day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp =pr.getProfile("MyProfile");
		
		WebDriver driver = new FirefoxDriver(fp);
		driver.get("http://facebook.com");
		
		//To take a screen shot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//converting the file into image format and saving it in a folder
		FileUtils.copyFile(src, new File("C:\\code repository\\Selenium Projects\\src\\Screenshots\\facebook.png"));
	}

}
