import java.util.Scanner;

public class atm_test
{
	static int balance=10000;			//class variable
	static int amt; 
	static Scanner sc = new Scanner(System.in);
	static String name,bank,address;
	
	Atm(String name,String bank,String address)
	{
		this.name=name;
		this.bank=bank;
		this.address =address;
		
		
		
	}
	 //for deposit amount
	Atm(int amt)			
	{
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextInt();  
        balance = balance+ amt;  
		System.out.println("Your Bank Balance is: "+balance);
	}
	 //for withdrawal amount
	Atm(int amt,int a)			
	{
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextInt();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
	}
	// Default constructor
	Atm()				
	{
		System.out.println("Your Bank Balance is: "+balance);
	}
	
	
}

