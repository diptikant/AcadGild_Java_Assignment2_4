package Java_Assignment2_4;
/*
 * The class is created master the following concepts:
*  Loops and Conditional statements
*  Operators
*  As per the assignment given in 2.4
*/
import java.util.*;
public class TestDemo {


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner Sc = new Scanner(System.in);// Scanner object to take the input from the user.
		
		//declaring all the variables 
		int PhysicsMark;
		int ChemistryMark;
		int MathMark;
		float AvgMark;
		
		System.out.println("Enter Physics Mark");
		PhysicsMark=Sc.nextInt();  //initializing the Physics Mark
		ValidateNumber(PhysicsMark);  // Validating the Physics Mark
		
		System.out.println("Enter Chemistry Mark");
		ChemistryMark=Sc.nextInt(); //initializing the Chemistry Mark
		ValidateNumber(ChemistryMark); // Validating the Chemistry Mark
		
		System.out.println("Enter Math Mark");
		MathMark=Sc.nextInt(); //initializing the Math Mark
		ValidateNumber(MathMark); // Validating the Math Mark
		
		//Calculating Avarage Mark
		AvgMark = (float) ((PhysicsMark+ChemistryMark+MathMark)/3.0);
		
		System.out.println("");
		System.out.println("---------------------------------------");
		// Calculating and Printing the Grade
		if(AvgMark>70)
		{
			System.out.println(" A Grade");
		}
		else if ((AvgMark>61) && (AvgMark<=70))
		{
			System.out.println(" B Grade");
		}
		else 
		{
			System.out.println(" C Grade");
		}
		
		
		Sc.close();
		
		

	}
	//Function to validate the entry as per the Assignment
	private static void ValidateNumber(int value) 
	{
		
		if (value == 0)
		{
			System.out.println("You Have Entered Zero");
		}
		else if (value > 0)
		{
			System.out.println("You Have Entered Positive Value");
		}
		else
		{
			System.out.println("You Have Entered Negative Value");
		}
		
      //Calculating the ASCII Value
	    int length = 4;
	    StringBuilder builder = new StringBuilder(length);
	    for (int i = length - 1; i >= 0; i--) {
	        builder.append((char) ((value >> (8 * i)) & 0xFF));
	    }
	    //Printing the ASCII value
	    System.out.println("ASCII of "+value+ "  is : " + builder + "\t");
	    
	}

}
