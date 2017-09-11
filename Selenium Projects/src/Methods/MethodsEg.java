package Methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MethodsEg {

	public static WebDriver driver;

	public static void main(String[] args) {

		function1();
		String res = function2();
		System.out.println(res);

		MethodsEg m = new MethodsEg();
		m.function3();
		boolean flag = m.function4();
		System.out.println(flag);
	}

	// static method without return value
	public static void function1() {

		System.out.println("This is function1 code");
	}

	// static method with return value
	public static String function2() {

		System.out.println("This is function2 code");
		return "Pass";
	}

	// non static method without return value
	public void function3() {

		System.out.println("This is function 3");
	}

	// non static method with return value
	public boolean function4() {
		System.out.println("This is function 4");
		return true;
	}

	// Accessing methods using parameters
	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	// Launching different browsers generic method
	public void Br_Launch(String Br_name, String Url) {

		if (Br_name.equalsIgnoreCase("firefox")) {
			ProfilesIni pr = new ProfilesIni();
			FirefoxProfile fp = pr.getProfile("MyProfile");
			driver = new FirefoxDriver(fp);

		} else if (Br_name.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\swathi yoganand\\Downloads\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (Br_name.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "‪D:\\chromed\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		driver.get(Url);
	}

	public void Screenshot(String name) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\code repository\\Selenium Projects\\src\\Screenshots\\" + name + ".png"));
	}

	public void send_text(String Loc, String value, String text) {

		if (Loc.equalsIgnoreCase("id")) {

			driver.findElement(By.id(value)).sendKeys(text);

		} else if (Loc.equalsIgnoreCase("name")) {

			driver.findElement(By.name(value)).sendKeys(text);

		} else if (Loc.equalsIgnoreCase("classname")) {

			driver.findElement(By.className(value)).sendKeys(text);

		} else if (Loc.equalsIgnoreCase("xpath")) {

			driver.findElement(By.xpath(value)).sendKeys(text);

		} else if (Loc.equalsIgnoreCase("css selector")) {

			driver.findElement(By.cssSelector(value)).sendKeys(text);

		} else if (Loc.equalsIgnoreCase("tagname")) {

			driver.findElement(By.tagName(value)).sendKeys(text);

		}

	}

	public void click(String Loc, String value) {

		if (Loc.equalsIgnoreCase("id")) {

			driver.findElement(By.id(value)).click();

		}else if (Loc.equalsIgnoreCase("name")) {

			driver.findElement(By.name(value)).click();

		} else if (Loc.equalsIgnoreCase("classname")) {

			driver.findElement(By.className(value)).click();

		} else if (Loc.equalsIgnoreCase("xpath")) {

			driver.findElement(By.xpath(value)).click();

		} else if (Loc.equalsIgnoreCase("css selector")) {

			driver.findElement(By.cssSelector(value)).click();

		} else if (Loc.equalsIgnoreCase("tagname")) {

			driver.findElement(By.tagName(value)).click();

		}else if (Loc.equalsIgnoreCase("linktext")) {

			driver.findElement(By.linkText(value)).click();

		}else if (Loc.equalsIgnoreCase("partiallinktext")) {

			driver.findElement(By.partialLinkText(value)).click();

		}


	}

}
