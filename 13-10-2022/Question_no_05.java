/*Q5)

Write a Java program to display the following pattern.


   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a */
package Thusday;

public class Pattern {

	public static void main(String[] args) {               
		// TODO Auto-generated method stub                           
		System.out.println("    J     a    v     v    a");             //used print statement to print the pattern
		System.out.println("    J    a a    v   v    a a");
		System.out.println("J   J   aaaaa    v v    aaaaa");
		System.out.println(" J J   a     a    v    a     a");
	}

}

//Tryed to do A using for loop
package Thusday;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fp=10/2;                           //Taken the first point and given as the center
int sp=10/2;                           //Taken the second and given as the center
for(int row=1;row<=10;row++) {         //for row
	for(int col=0;col<=10;col++) {  //for column
		if(col==fp || col==sp || row==8/2 && col>fp && col<sp && col%2==0)   //if condition to print A
			System.out.print("a");
		else
			System.out.print(" ");
	}
	System.out.println();                                   //printing the statement
	fp--;
	sp++;
}
	}

}
