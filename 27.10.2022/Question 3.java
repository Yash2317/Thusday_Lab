/*Program to input age from user and throw user-defined exception if entered age is negative In this program, we have created an exception class AgeException which extends the built-in Exception class. In main method, we read the input from user using Scanner after that we check the age in try block. 
 * If it is less than 18 then it will throw an exception other it will display message "Valid age".*/

package Thursday27;

public class AgeException extends Exception
{
	 
	public AgeException(String str)
	{
		System.out.println(str);
	 }
}


package Thursday27;

import java.util.Scanner;

public class Age 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Enter user age :: ");
		  int age = scan.nextInt();
		  //check the age in try block
		  try {
		   if(age < 18) 		//If age is less than 18 then it will throw an exception 
		    throw new AgeException("Invalid age");
		   else
		    System.out.println("Valid age");
		  }
		  catch (AgeException a) {
		   System.out.println(a);
		  }
	}

}
