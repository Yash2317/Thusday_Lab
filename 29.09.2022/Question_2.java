//Write a program to calculate HCF of Two given number.
import java.util.Scanner;

public class Question_2 {
	public static void main(String arg[]) {
		Question_2 obj = new Question_2();
		obj.hcf();
	}

	public void hcf() {
		int num1, num2, i, hcf = 0;          //Initialisation of variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");  //Accepting the First number
		num1 = sc.nextInt();
		System.out.println("Enter second number : "); //Accepting the Second number
		num2 = sc.nextInt();

		for (i = 1; i <= num1 || i <= num2; i++) {    //Loop till the is same as the input
			if (num1 % i == 0 && num2 % i == 0)       //Logic for HCF, as till the mod of num1 and num2 will become zero
				hcf = i;
		}
		System.out.println("HCF of given two numbers is :" + hcf);  //print the the HCF of two given number
	}
}
