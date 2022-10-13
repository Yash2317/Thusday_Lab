/*Q4)
Write a program to accpet the positive numbers  from user and display the sum of 
that numbers using loop.
*/
package Thusday;

import java.util.Scanner;

public class Sum_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0, num1, n;
		System.out.print("Enter how many Numbers you want to add: ");
		num1 = sc.nextInt();
		System.out.println("Enter " + num1 + " Numbers : ");
		for (int i = 0; i < num1; i++) {
			n = sc.nextInt();
			if (n > 0) {         //to accept online positive numbers
				sum = sum + n;
			}
		}
		System.out.println("Sum of numbers is " + sum);

	}
}
