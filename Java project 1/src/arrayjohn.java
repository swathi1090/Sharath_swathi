
public class arrayjohn {
	public static void main(String[] args){
		// Initializing arrays directly, where values is the name of the array and 5,6 are the list of integers in the array.
		int[] values = { 5, 6 };
		
		System.out.println(values[1]);
		

		for(int i=0; i<values.length;i++)
		{
		System.out.println(values[i]);
		}
		//Creating an array named numbers of integer type
		
			int[] numbers;
			// Adding the size of the array as 3
			numbers = new int[3];
			// Adding values to the array.
			numbers[0] = 45;
			numbers[1]=65;
			numbers[2]=90;
			
			System.out.println(numbers[2]);
			//Array iteration
			for (int i=0; i< numbers.length;i++){
				System.out.println(numbers[i]);
			}
	}

}
