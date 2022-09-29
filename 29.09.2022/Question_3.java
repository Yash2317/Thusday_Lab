import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question_3 q = new Question_3();
		int num = q.accept(); // call accept and pass valuein num
		q.prime(num); // call function prime
	}

	public static int accept() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");
		num = sc.nextInt();

		return num;

	}

	public void prime(int nu) {
		boolean flag = true;
		for (int j = 2; j < nu; j++) // we take i from 2 because concept of prime number is no divided by itself and
										// 1 so start from 2
		{

			if (nu % j == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(nu + " is prime");
			EvenOdd(nu);

		} else {
			System.out.println(nu + " is Not prime");
			EvenOdd(nu);
		}
	}

	public void EvenOdd(int nu) {
		if (nu % 2 == 0) {
			System.out.println(nu + " is Even ");
			Div5(nu); // call Div5 if number is even

		} else {
			System.out.println(nu + " is Even ");
			Div3(nu);// call Div3 if number is odd
		}
	}

	public void Div5(int nu) {
		if (nu % 10 == 0) // num divisiable by 10
			System.out.println(nu + " is divisiable by 10");
	}

	public void Div3(int nu) {
		if (nu % 3 == 0) //// num divisiable by 10
			System.out.println(nu + " is  divisiable by 3");
	}

}
