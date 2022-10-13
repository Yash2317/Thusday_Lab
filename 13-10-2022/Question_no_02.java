/*Q2)"Multilevel:

WAP to create a class Reverse No, second class SOD , Third class use both the class 
property and display the output*/

package Thusday;

import java.util.Scanner;

public class Reverse_no {
	static Scanner sc = new Scanner(System.in);

	public static void rev() {
		int number, reverse = 0;
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}
}

package Thusday;

public class SOD extends Reverse_no {
	public static void sod() {
		int number, digit, sum = 0;
		System.out.print("Enter the number: ");
		number = sc.nextInt();
		while (number > 0) {

			digit = number % 10; // finds the last digit of the given number

			sum = sum + digit; // adds last digit to the variable sum

			number = number / 10; // removes the last digit from the number
		}

		System.out.println("Sum of Digits: " + sum); // prints the result
	}
}

package Thusday;

public class Third extends SOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rev();
		sod();
	}

}
	
