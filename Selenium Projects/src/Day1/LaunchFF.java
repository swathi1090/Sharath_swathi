package Day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFF {

	public static void main(String[] args) {
       FirefoxDriver driver=new FirefoxDriver();
       driver.get("https://facebook.com");
       driver.manage().window().maximize();
       
	}

}
