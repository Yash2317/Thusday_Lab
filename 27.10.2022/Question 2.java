/*Que 2
Write a program to accept basic details name , Phone No , Address , user Id and password from the user .
 throw an exception if the user Id lenght is greater than 8 and password is not matched and should 
 only contain the string value. Password rules: A password must have at least eight characters. 
A password consists of only letters and digits. A password must contain at least two digits.
*/
package Thursday27;

public class User_exp extends Exception 
{
	public User_exp(String msg)
	{
		super(msg);
	}
}


package Thursday27;

import java.util.Scanner;

public class Accept
{
	public static final int PASSWORD_LENGTH = 8;		//password length initialized as 8
	public static void main(String[] args) throws User_exp 
	{
		// TODO Auto-generated method stub
		Accept obj=new Accept();
		obj.accept();
		Accept obj1=new Accept();
		obj1.Password_Rules();
	}
	
	public void accept() throws User_exp
	{
		try 
		{
		String user_id; 
		String name,address;	   
	    long phone;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter user name:");
		name=sc.next();
		
		System.out.println("Enter Phone Number:");
		phone=sc.nextLong();
		
		System.out.println("Enter Address : ");
    	address=sc.next();
    	System.out.println("**************************");
        System.out.print("User name : "+name);
    	System.out.print("\nUser phone number : "+phone);
    	System.out.print("\nUser address : "+address);
    	System.out.println("\n**************************");
    	System.out.println("\nEnter User Id : ");
    	user_id=sc.next();
    	int length = user_id.length();
    	if(length > 8)
    	{
    		throw new User_exp("User Id length is greater than 8 "); //if user id length is greater than 8 then throw Exception 
    	}
    	System.out.println(" ");
		
    	
		}
		catch(User_exp e)
		{
			System.out.println(e.getMessage());		
		}
	}
	
	//for password
	public void Password_Rules()
	{
		Scanner input = new Scanner(System.in);		
        System.out.print("Enter Passward\n"+
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "(You hava to follow above Conditions.): ");
        String s = input.nextLine();

        if (is_Valid_Password(s))			//the password valid or not
        {
            System.out.println("Password is valid: " + s);
        } 
        else 
        {
            System.out.println("Password is not valid" + s);
            System.out.println("password not matched with rules");
        }

	}
	
	public static boolean is_Valid_Password(String password) 
    {

        if (password.length() < PASSWORD_LENGTH) return false;		//for password length

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++)
        {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

	 public static boolean is_Letter(char ch) 	//for checking character
	    {
	        ch = Character.toUpperCase(ch);
	        return (ch >= 'A' && ch <= 'Z');
	    }


	    public static boolean is_Numeric(char ch) 	//for checking numbers
	    {

	        return (ch >= '0' && ch <= '9');
	    }
}
