package Day1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchChrome {

	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\swathi yoganand\\Downloads\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
	InternetExplorerDriver driver = new InternetExplorerDriver();
	driver.get("https://www.google.com");
		
	}

}
