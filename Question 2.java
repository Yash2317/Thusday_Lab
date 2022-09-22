/*Write a program to accept choice from user and perform the operation:
1:Factorial
2:Sum of digit
3:Armstrong number or not
4:Fibonacci series
5:Prime no or Not
*/
import java.util.*;
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		char ans;

		do {
			System.out.println(
					"Choice the Operater\n1. Facorial \n2. Sum of Digits \n3. Armstrong number \n4. Fibonacci Series \n5. Prime number or Not");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				facto();
				break;
			case 2:
				sum();
				break;
			case 3:
				armstrong();
				break;
			case 4:
				fibo();
				break;
			case 5:
				prime();
				break;
			default:
				System.out.println("Invalid choice");

			}
			System.out.println("Do you want to select another option y/n");
			ans = sc.next().charAt(0);
		} while (ans == 'Y' || ans == 'y');
		System.out.println("You have selected No, so the proccess is stoped");
	}

	public static void facto() {
		int i=1, fact = 1, num;
		System.out.println("Enter the Number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}

	public static void sum() {
		int numb, digi, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		numb = sc.nextInt();
		while (numb > 0) {

			digi = numb % 10; // finds the last digit of the given number

			sum = sum + digi; // adds last digit to the variable sum

			numb = numb / 10; // removes the last digit from the number
		}
		// prints the result
		System.out.println("Sum of Digits: " + sum);
	}

	public static void armstrong() {
		int num, org, r, res = 0;
		System.out.println("Enter the Number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		org = num;
		while (org > 0) {
			r = org % 10; //
			res = res + (r * r * r);
			org /= 10;
		}
		if (res == num) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");
		}
	}

	public static void fibo() {
		int q1 = 0, q2 = 1, q3, i, count; //Variable declaration
		System.out.println("Enter the required number for list : ");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		System.out.print(q1 + " " + q2); // printing 0 and 1
		for (i = 2; i < count; ++i) // loop starts from 2 because 0 and 1 are already printed
		{
			q3 = q1 + q2;
			System.out.print(" " + q3);
			q1 = q2;
			q2 = q3;
		}
	}

	public static void prime() {
		int num, i, count = 0;       //Variable declaration
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		num = sc.nextInt();

		for (i = 2; i < num; i++) {   //loop starts with 2 because prime number is a number which is divided by itself.
			if (num % i == 0) {
				count++;
				break;
			}
		}

		if (count == 0)
			System.out.println(+num + " is a Prime Number.");
		else
			System.out.println(+num + " is not a Prime Number.");
	}
}
