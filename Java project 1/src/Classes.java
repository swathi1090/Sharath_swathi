 class car
{
	String name;
	String color;
	int year;
	void features(){
		System.out.println("Model is "+ name + " and is " + color + " in color " + "and was designed in the year " + year + ".");
	}
}
public class Classes {

	public static void main(String[] args) {
		car model1 = new car();
		model1.name ="Maruthi 800";
		model1.color ="red";
		model1.year = 1995;
		model1.features();
	
		
		car model2 = new car();
		model2.name ="BMW";
		model2.year = 2007;
		model2.features();
		System.out.println(model1.name);
		
		
	}

}
