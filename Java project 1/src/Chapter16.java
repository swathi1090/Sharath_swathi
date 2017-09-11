class dog{
	void bark(String noiselevel)
	{
		System.out.println(noiselevel);
	}
	void features(int distance, double feet){
		System.out.println("It ran " + distance + " meters " +" and " + feet +" feet in length.");
	}
}
public class Chapter16 {
	public static void main(String[] args){
		dog Bruno = new dog();
		String noise ="low";
		Bruno.bark(noise);
		Bruno.features(400, 25.2);
		
		
	}

}
