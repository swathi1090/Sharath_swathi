package Methods;

import java.io.IOException;

public class Reuse {

	public static void main(String[] args) throws IOException {
		
		
		
		MethodsEg.function1();
		
		MethodsEg m = new MethodsEg();
	    m.function3();
  
	    String res = MethodsEg.function2();
	
	    System.out.println(res);
	    
	    boolean flag = m.function4();
	    System.out.println(flag);
       
	    int sum = m.sum(45, 89);
	    System.out.println(sum);
	    
	    m.Br_Launch("firefox", "http://opensource.demo.orangehrmlive.com");
	   // m.Screenshot("google");
	    
	    m.send_text("id", "txtUsername", "Admin");
	    m.send_text("id","txtPassword", "admin");
	    m.click("id", "btnLogin");
	    
	

}
}
