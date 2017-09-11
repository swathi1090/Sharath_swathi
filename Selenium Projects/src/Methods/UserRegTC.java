package Methods;

import java.io.IOException;

public class UserRegTC {

	public static void main(String[] args) throws IOException {
		OrgMaster om = new OrgMaster();

		String res = om.launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("launch successful " + res);

		res = om.Login("Admin", "admin");
		System.out.println("Login successful " + res);
		
		res=om.Userreg("orange master", "orangemaster12", "plum12", "plum12");
		System.out.println("User registrantion "+ res);


		res = om.Logout();
		System.out.println("Logout " + res);

		om.close();
		System.out.println("Closed successfully");

	}

}
