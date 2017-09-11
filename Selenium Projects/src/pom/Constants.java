package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Constants {

	public static WebDriver driver= new FirefoxDriver();
	public static Org_LoginPage lp = PageFactory.initElements(driver, Org_LoginPage.class);
	public static Adminpage ap = PageFactory.initElements(driver, Adminpage.class);
}
