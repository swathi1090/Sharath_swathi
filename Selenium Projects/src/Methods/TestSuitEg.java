package Methods;

import java.io.IOException;

import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TestSuitEg {

	public static void main(String[] args) throws IOException {

		// Launch
		OrgMaster om = new OrgMaster();

		String res = om.launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("launch successful " + res);

		res = om.Login("Admin", "admin");
		System.out.println("Login successful " + res);

		Sleeper.sleepTightInSeconds(5);

		res = om.Logout();
		System.out.println("Logout " + res);

		om.close();
		System.out.println("Closed successfully");
		System.out.println("************************");
		
		//Employee registration
		res = om.launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("launch successful " + res);

		res = om.Login("Admin", "admin");
		System.out.println("Login successful " + res);

		Sleeper.sleepTightInSeconds(5);
		
		res = om.Empreg("org", "demo");
		System.out.println("Employee Registration "+ res);

		res = om.Logout();
		System.out.println("Logout " + res);

		om.close();
		System.out.println("Closed successfully");
		System.out.println("************************");
		
		//User reg
		res = om.launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("launch successful " + res);

		res = om.Login("Admin", "admin");
		System.out.println("Login successful " + res);
		
		res=om.Userreg("org demo", "orgdemo1", "orgdemo1", "orgdemo1");
		System.out.println("User registrantion "+ res);


		res = om.Logout();
		System.out.println("Logout " + res);

		om.close();
		System.out.println("Closed successfully");
		System.out.println("************************");
		
		//User Login
		res = om.launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("launch successful " + res);

		res = om.Login("orgdemo1", "orgdemo1");
		System.out.println("Login successful " + res);

		res = om.Logout();
		System.out.println("Logout " + res);

		om.close();
		System.out.println("Closed successfully");
		System.out.println("************************");



	}

}
