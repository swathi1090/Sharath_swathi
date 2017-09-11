package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodLinks {

	public static void main(String[] args) {
    WebDriver driver =new FirefoxDriver();
    driver.get("https://gmail.com");
    //To get the page title
    String title= driver.getTitle();
    System.out.println(title);
    
    //To get the URL
    System.out.println(driver.getCurrentUrl());
    
    //To get the page source
    //System.out.println(driver.getPageSource());
    
    //Launch gmail and navigate it to facebook
    
    driver.navigate().to("https://facebook.com");
    
    //To go to the previous page
    driver.navigate().back();
    Sleeper.sleepTightInSeconds(3);
    
    //To go to a forward page
    driver.navigate().forward();
    
    //To refresh a page
    driver.navigate().refresh();
    
    
	}

}
