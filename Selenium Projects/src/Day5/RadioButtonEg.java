package Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class RadioButtonEg {

	public static void main(String[] args) {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");

		WebDriver driver = new FirefoxDriver(fp);
		driver.get("http://echoecho.com/htmlforms10.htm");

		WebElement block = driver.findElement(By.xpath(
				"html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radios = block.findElements(By.name("group1"));
		System.out.println(radios.size());
		for (int i = 0; i < radios.size(); i++) {
			String text = radios.get(i).getAttribute("value");
			System.out.println(text);
			if (text.equalsIgnoreCase("milk")) {
				radios.get(i).click();

			}

		}
		List<WebElement> radios1 = block.findElements(By.name("group2"));
		System.out.println(radios1.size());
		for (int j = 0; j < radios1.size(); j++) {
			String text1 = radios1.get(j).getAttribute("value");
			System.out.println(text1);
			if (text1.equalsIgnoreCase("water")) {
				radios1.get(j).click();

			}
		}

	}
}
