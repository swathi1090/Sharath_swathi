import java.util.Scanner;
public class Dowhile {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int value;
	do
		{
		System.out.println("enter a number:");

	    value = input.nextInt();
}
      while( value != 9);
	System.out.println("Got 9");
}
}