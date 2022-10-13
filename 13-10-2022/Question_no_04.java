/*Q4)
Write a program to accpet the positive numbers  from user and display the sum of 
that numbers using loop.
*/
package Thusday;

import java.util.Scanner;

public class Sum_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size, i, sum = 0;
		System.out.println("Enter how many number you want to add: ");
		size = sc.nextInt();
		int arry[] = new int[size];
		System.out.println("Enter the  numbers :");
		for (i = 0; i < size; i++) {
			arry[i] = sc.nextInt();
			if (arry[i] > 0) {           //to accept online positive numbers
				sum = sum + arry[i];
			}
		}
		System.out.println("Sum of positive numbers is = " + sum);
	}
}
