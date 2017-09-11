package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg2 {

	public static void main(String[] args) {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");

		WebDriver driver = new FirefoxDriver(fp);
		driver.get("http://khuranatravel.com");

		driver.findElement(By.xpath(".//*[@id='outerWrapper']/div[2]/div[5]/div/a")).click();
		WebElement drop = driver.findElement(By.xpath(".//*[@id='fromCity']"));

		Select s = new Select(drop);
		List<WebElement> list = s.getOptions();
		System.out.println(list.size());

		WebElement tdrop = driver.findElement(By.xpath(".//*[@id='toCity']"));
       Select t = new Select(tdrop);

		for (int i = 0; i < list.size(); i++) {
			s.selectByIndex(i);
			String text = list.get(i).getText();
			System.out.println(text);

			List<WebElement> tlist = t.getOptions();
			for (int j = 0; j < tlist.size(); j++) {

				t.selectByIndex(j);
				String tcity = tlist.get(j).getText();

				if (text.equalsIgnoreCase(tcity))
				{
					System.out.println("Fail");
				} 
				else 
				{
					System.out.println("pass");
				}

			}
		}
	}

}
