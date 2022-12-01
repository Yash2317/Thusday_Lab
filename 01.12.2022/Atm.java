import java.util.Scanner;

public class Atm 
{
	static char ans;
	static int ch;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		do
		{
			System.out.println("Welcome to HDFC");
			System.out.println("***************************");
			System.out.println("Do you want to\n1. See information\n2. Diposit \n3.Withdraw\n4.Balance");
			ch=sc.nextInt();
			
			switch (ch) 
			{
			case 1:		
				Atm s = new Atm("Vaishnavi Powar","HDFC","Pune");  
				System.out.println("Name:" +Atm.name + "\nbalance:"+Atm.balance+ "\nAddress : "+Atm.address); 
				break;
			case 2:	
				new Atm(0);		
				break;
			case 3:
				new Atm(0,0);		
				break;
			case 4:
				new Atm();
				break;
				
			default:
				System.out.println("Enter Valid Input");
				break;
				
		}
			System.out.println("Do you want to continue transaction? y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		
		System.out.println("Thank you for coming");
		System.out.println("***************************");
	}

}

