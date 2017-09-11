package Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CheckBoxEg2 {

	public static void main(String[] args) {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");
		
		WebDriver driver = new FirefoxDriver(fp);
		driver.get("http://echoecho.com/htmlforms09.htm");
		
		WebElement block = driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> input = block.findElements(By.tagName("input"));
		System.out.println(input.size());
		for (int i = 0; i < input.size(); i++) {
			
			String text = input.get(i).getAttribute("value");
			System.out.println(text);
			if(!input.get(i).isSelected()){
				input.get(i).click();
			}
			
			
		}

	}

}
