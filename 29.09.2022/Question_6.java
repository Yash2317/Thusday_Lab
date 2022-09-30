//WAP to display prime no between 1 to 150 in two dimension array
public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, num = 0; // Initialization of variables

		String primeNumbers = "";// Empty String

		for (i = 1; i <= 150; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {

				primeNumbers = primeNumbers + i + " "; // Appended the Prime number to the String
			}
		}
		System.out.println("Prime numbers from 1 to 150 are :");
		System.out.println(primeNumbers);
	}
}		
