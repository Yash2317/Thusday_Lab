//WAP to accept no from user in array and find out average and sum of array numbers.
import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum = 0;   //Initialization of the variable
		float average;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements you want in array:"); //Accepting number of elements of the array
		num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter all the elementsof the array:"); // Accepting the array from the user
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];             //sum of array
		}
		System.out.println("The Sum of array is " + sum);
		average = (float) sum / num;        //average of the sum of the array
		System.out.println("The Average is " + average);
	}
}
