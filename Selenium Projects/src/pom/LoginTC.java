package pom;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class LoginTC extends Constants {
	
	@Test
	public void org_Login(){
		
		
		
		driver.get(lp.url);
		
		lp.org_login(lp.u, lp.p);
		
		Sleeper.sleepTightInSeconds(3);
		
		
		ap.welcomeadminclick();
		
		ap.Logoutclick();
	}
}
