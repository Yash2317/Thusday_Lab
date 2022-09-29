
//Write a program to accept a number from user and then prints the sum of the even and odd integers.
import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int n, se = 0, so = 0;   //Initialisation the variable
		char ans;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter the number of elements you want to add:\n"); //Accept the number of elements that have to add 
			n = sc.nextInt();
			int[] a = new int[n];
			System.out.println("Enter the numbers"); //Accept the numbers from the user
			for (int i = 0; i < n; i++) {            
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 0) {               //Logic for sorting of even number
					se = se + a[i];
				} else {
					so = so + a[i];
				}
			}
			System.out.println("Do you want to addd another item y/n"); // for break or continue the proccess
			ans = sc.next().charAt(0);
		} while (ans == 'Y' || ans == 'y');
		System.out.println("Sum of Even Numbers:" + se);
		System.out.println("Sum of Odd Numbers:" + so);
	}
}

