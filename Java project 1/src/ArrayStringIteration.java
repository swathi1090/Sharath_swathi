
public class ArrayStringIteration {

	public static void main(String[] args) {
		// Creating a string array and giving it a size
		String[] cartoons = new String[3];
		cartoons[0] = "Shinchan";
		cartoons[1] = "Tom";
		
		
		System.out.println(cartoons[2]);
		for(String role : cartoons){
			System.out.println(role);
		}
	

	}

}
