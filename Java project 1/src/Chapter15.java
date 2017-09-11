class Carr {
	String name;
	int Year;

	void features() {
		System.out.println("The name is " + name + " and the year manufactured is " + Year + ".");
		

	}
	int yearsOfExistence(){
		int years = 2017 - Year;
		return years;
		
	}
int getYear(){
	return Year;
	
}
String getName(){
	return name;
	
}
}

public class Chapter15 {
	public static void main(String[] args) {
		Carr car1 = new Carr();
		car1.name = "Mar";
		car1.Year = 1985;
		//car1.features();
		int year = car1.yearsOfExistence();
		System.out.println(year);
		String name1 = car1.getName();
		System.out.println(name1);

		Carr car2 = new Carr();
		car2.name ="BMW";
		car2.Year = 2000;
		int year1 = car2.getYear();
		System.out.println(year1);
		
				
	}
}
