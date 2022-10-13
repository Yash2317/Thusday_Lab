/*Q3)"Write a Java program to print an array after changing the rows and columns of a 
 given two-dimensional array.
Example:
Original Array:
10 20 30
40 50 60
After changing the rows and columns of the said array:
10 40
20 50
30 60 */
package Thusday;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter 2D array size : ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();// reading the number of elements from the that we want to enter in the row
		int columns = sc.nextInt();// reading the number of elements from the that we want to enter in the coloumn

		System.out.println("Enter array elements : ");

		int twod[][] = new int[rows][columns];// creates an 2D array in the memory of length taken from the user.
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				twod[i][j] = sc.nextInt(); // reading array elements from the user
			}
		}
		System.out.print("Original Array:\n");
		print(twod);
		System.out.print("After changing the rows and columns of the said array:\n");
		change(twod);

	}

	public static void change(int[][] twod) {

		int[][] newtwod = new int[twod[0].length][twod.length];

		for (int i = 0; i < twod.length; i++) {
			for (int j = 0; j < twod[0].length; j++) {
				newtwod[j][i] = twod[i][j];
			}
		}

		print(newtwod);
	}

	static void print(int[][] twodm) {
		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; j++) {
				System.out.print(twodm[i][j] + " ");
			}
			System.out.println();
		}

	}

}
