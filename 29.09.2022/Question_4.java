
/*WAP to accept size from user accordingly accept numbers from user and also accept the 
no from user which you want to delete from your array and display the output.*/
import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num, x, temp = 1, loc = 0; // Initialization of variables
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in array : "); // Accept the number of elements
		num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Input the array elements : "); // Accept the number of array elements
		for (i = 0; i < num; i++) {
			
			arr[i] = sc.nextInt();

		}	
		System.out.print("\nEnter the element you want to delete:"); //Accept the number from array which user want to delete
		x = sc.nextInt();
		for (i = 0; i < num; i++) {      
			if (arr[i] == x) {      //If x found in array
				temp = 1;
				loc = i;
				break;
			} else {
				temp = 0;
			}
		}
		if (temp == 1) {          
			for (i = loc + 1; i < num; i++) {
				arr[i - 1] = arr[i];       //reduce the size of the array and move all elements
			}
			System.out.println("After Deleting:");
			for (i = 0; i < num - 2; i++) {
				System.out.print(arr[i] + ",");
			}
			System.out.print(arr[num - 2]);
		} else {
			System.out.println("Element not found");
		}
	}
}
