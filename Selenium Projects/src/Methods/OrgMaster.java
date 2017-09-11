package Methods;

import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class OrgMaster {

	public static WebDriver driver;
	public static String actval, expval;
	public static FileInputStream fi;
	public static Properties po;
	public static String pr_Path ="C:\\code repository\\Selenium Projects\\src\\Properties\\OrgMaster.properties";

	// Launch
	public String launch(String Url) throws IOException {
		
		fi= new FileInputStream(pr_Path);
		po = new Properties();
		po.load(fi);
		
		expval = "LOGIN";
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("MyProfile");
		driver = new FirefoxDriver(fp);
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		actval = driver.findElement(By.id(po.getProperty("login"))).getAttribute("value");
		if (expval.equalsIgnoreCase(actval)) {

			return "pass";

		} else {
			return "fail";
		}

	}

	// Login
	public String Login(String u, String p) {
		expval = "Welcome";
		driver.findElement(By.id(po.getProperty("username"))).sendKeys(u); 
		driver.findElement(By.id(po.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(po.getProperty("login"))).click();
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		if (expval.equalsIgnoreCase(actval)) {

			return "pass";

		} else {
			return "fail";
		}

	}
	//Logout
	public String Logout(){
		
		expval = "LOGIN";
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div/ul/li[2]/a")).click();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		if (expval.equalsIgnoreCase(actval)) {

			return "pass";

		} else {
			return "fail";
		}

	}
	//close
	
	public void close(){
		driver.close();
	}
	
	//Employee registration
	
	public String Empreg(String f, String l){
		
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		if(expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "fail";
		}
		}
	
	//User registration
	public String Userreg(String ename, String uname,String pswd, String cpswd){
		
		expval=uname;
		boolean flag= false;
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pswd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpswd);
		driver.findElement(By.id("btnSave")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) {
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			actval=cols.get(1).getText();
			if(actval.equalsIgnoreCase(expval)){
				
				flag = true;
				break;
			}
		}
			if(flag==true)
			{
				return "Pass";
			}
			else
			{
				return "fail";
			}
			}
					
		}
	
	


