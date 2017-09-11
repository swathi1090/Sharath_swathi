package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinkEg {
public static void main(String args[]){
//FirefoxDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","‪D:\\chromed\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();

driver.get("http:gmail.com");
//Identifying the email text box
WebElement email = driver.findElement(By.id("identifierId"));
//Sending text to the email text box
email.sendKeys("swathi.yoganand");
//Clicking on the next button
driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
Sleeper.sleepTightInSeconds(5);
//Identifying the password
driver.findElement(By.name("password")).sendKeys("coolwinter@90");
//click on next button
driver.findElement(By.cssSelector(".RveJvd.snByac")).click();

}
}
