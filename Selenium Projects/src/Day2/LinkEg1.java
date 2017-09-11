package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkEg1 {
	public static void main(String args[])
	{
		String d = "?";

		WebDriver driver= new FirefoxDriver();
		driver.get("https://facebook.com");
		//creating an array list to save the number of links on the page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		//Counting the number of links and its text in the given page.
		for(int i=0; i<links.size();i++){
			String text = links.get(i).getText();
			//To get the text of only the visible links and not ignore the white spaces
		if( (!text.equals("")) && (!text.equals(d)) )
			{
					
			System.out.println(text);
			
		
			}
			
		
	}}
}
