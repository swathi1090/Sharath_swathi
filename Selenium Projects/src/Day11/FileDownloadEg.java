package Day11;


		import java.awt.AWTException;
		import java.awt.Robot;
		import java.io.IOException;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.firefox.FirefoxProfile;
		import org.openqa.selenium.firefox.internal.ProfilesIni;
		import org.openqa.selenium.server.browserlaunchers.Sleeper;


		public class FileDownloadEg {

			public static void main(String[] args) throws IOException, AWTException {
				
				ProfilesIni pr = new ProfilesIni();
				FirefoxProfile fp = pr.getProfile("MyProfile");
				WebDriver driver = new FirefoxDriver(fp);
				
				driver.get("http://www.seleniumhq.org/");
				driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();
				driver.findElement(By.linkText("3.5.2")).click();
				
				Sleeper.sleepTightInSeconds(5);
				
				//Runtime.getRuntime().exec("C:\\Users\\swathi yoganand\\Desktop\\filedownload.exe");
				
				Robot r = new Robot();
				
				r.keyPress(java.awt.event.KeyEvent.VK_TAB);
				r.keyRelease(java.awt.event.KeyEvent.VK_TAB);
				
				r.keyPress(java.awt.event.KeyEvent.VK_TAB);
				r.keyRelease(java.awt.event.KeyEvent.VK_TAB);

				r.keyPress(java.awt.event.KeyEvent.VK_ENTER);
				r.keyRelease(java.awt.event.KeyEvent.VK_ENTER);

				


		}

	}


