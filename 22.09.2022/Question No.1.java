//Write a program to accept a number from the user and check if a given number is palindrome or not.
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, rev, sum = 0, temp = 0; // Variable declaration
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		num1 = sc.nextInt();
		while (num1 > 0) {
			rev = num1 / 10; // getting reminder
			sum = (sum * 10) + rev;
			num1 = num1 / 10;
		}
		if (temp == sum)
			System.out.println("It is a Palindrome" );
		else
			System.out.println("It is not a Palindrome");
	}

}

