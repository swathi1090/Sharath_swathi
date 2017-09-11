package Day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg {

	public static void main(String[] args) {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");

		WebDriver driver = new FirefoxDriver(fp);
		driver.get("http://amazon.com");
		
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		
	    Select s = new Select(drop);
	    
	   // s.selectByIndex(2);
	    //s.selectByValue("search-alias=instant-video");
	    //s.selectByVisibleText("All Departments");
	    
	    List<WebElement> list = s.getOptions();
	    System.out.println(list.size());
	    
	    for (int i = 0; i < list.size(); i++) {
	    	
	    	s.selectByIndex(i);
	    	System.out.println(list.get(i).getText());
			
		}
	}

}
