package Day9;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class MultipleWindowHandling {

	public static void main(String[] args) {
    ProfilesIni pr = new ProfilesIni();
    FirefoxProfile fp = pr.getProfile("MyProfile");
    WebDriver driver = new FirefoxDriver(fp);
    
    driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
   // String gmail = driver.getWindowHandle();
    //System.out.println(gmail);
    
    driver.findElement(By.linkText("Privacy")).click();
    
    Set<String> s = driver.getWindowHandles();
    Iterator<String> it =s.iterator();   
    
    while(it.hasNext())
    {
    	String wid = it.next();
    	System.out.println(wid);
    	
    	driver.switchTo().window(wid);
    	
    	
    	
    	try {
    		
			driver.findElement(By.linkText("Terms of Service")).click();
			System.out.println(driver.getTitle()+"------"+driver.getCurrentUrl());
			break;
			
		} catch (Exception e) {
			
			System.out.println("The link is not available in the window");
			
		}
    	
    }
    		
    
    
    
    
    
  
	}

}
