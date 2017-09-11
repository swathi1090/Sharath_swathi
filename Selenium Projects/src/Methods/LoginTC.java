package Methods;

import java.io.IOException;

import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LoginTC {

	public static void main(String[] args) throws IOException {
		
		OrgMaster om = new OrgMaster();
		
		String res = om.launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("launch successful "+ res);
		
		res = om.Login("Admin", "admin");
		System.out.println("Login successful "+ res);
		
		Sleeper.sleepTightInSeconds(5);
		
		res = om.Logout();
		System.out.println("Logout "+ res);
		
		om.close();
		System.out.println("Closed successfully");

	}

}
