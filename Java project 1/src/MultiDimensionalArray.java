
public class MultiDimensionalArray {

	public static void main(String[] args) {
      int[][] values = new int[2][2];
      values[0][0] = 25;
      values[0][1]= 45;
      values[1][0]= 89;
      values[1][1]=78;
      
     System.out.println(values[1][1]);
     
     String[][] puppies = new String[2][2];
      puppies[0][0] ="bruno";
      puppies[0][1] ="sunshine";
      puppies[1][0] = "ginger";
      puppies[1][1]="scooper";
      
     
      for(int row =0; row<puppies.length; row ++){
    	  for(int col =0; col<puppies.length; col++){
    		  System.out.print(puppies[row][col] + "\t");
    	  }
    	  System.out.println();
      }
    	  }
      
     
      
      
	}


