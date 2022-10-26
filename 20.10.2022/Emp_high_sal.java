/*Question 1 WAP to Accept details from the Employee :- name, e_id, phone_no, address, salary, Expenses(User) N number of employee 
Calculate the highest salary,highest extpenses Calc and display highest salary Display the employee name who is getting highest salary.*/
package thusadaylab_20_10_higestSalary;

import java.util.Scanner;

public class Emp_variables 
{	
	int  e_id,salary,exp;
	String name,address;
	long phone_no;
	static int max_sal;   //for calculating max salaray
	
	
	//we take getter setter method because we want that max_sal in another class also and store value also
	public int getSalary() 
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
}

package thusadaylab_20_10_higestSalary;

import java.util.Scanner;

public class Emp_MaxSal extends Emp_variables
{
	static Scanner sc=new Scanner(System.in);
    static int emp_no;        //for accepting size of array or number of employee
	int total_exp=0;        //calculate the total expenses from all expenses of that emp

	
	
	public static void main(String[] args) 
	{
		
		System.out.println("Enter Total Employee Number");
		emp_no=sc.nextInt();
		Emp_MaxSal emp[]=new Emp_MaxSal[emp_no];
		for(int i=0;i<emp_no;i++)      //accept the employee info
		{
			emp[i]=new Emp_MaxSal();
			emp[i].accept();
		}
		
		max_sal=emp[0].getSalary(); //for comparing others we initialize max_sal=emp[o]
		//to calculate max salary we initialize i=1 because we want to compare max sal and we already initialize max_sal=emp[0] 
		for(int i=1;i<emp_no;i++) 
		{
			if(emp[i].getSalary()>max_sal)
			{
				max_sal=emp[i].getSalary();
			}
		}
		//display  details of employee who has max salary
		for(int i=0;i<emp_no;i++)
		{
			if(emp[i].getSalary()==max_sal)  //for displaying max salary emp details
				
			{
				System.out.println("The Details Employee with Highest Salary is Given Below");
				emp[i].display();
			}
		}
	}
	
	//accepting emp information
	public void accept() 
	{
    	char ch;
    	System.out.println("Enter Employee's name : ");
    	name=sc.next();
    	System.out.println("Enter Employee's Id : ");
    	e_id=sc.nextInt();
    	System.out.println("Enter Employee's Phone no : ");
    	phone_no=sc.nextLong();
    	System.out.println("Enter Employee's address : ");
    	address=sc.next();
    	System.out.println("Enter Employee's salary : ");
    	salary=sc.nextInt();
    	setSalary(salary);
    	System.out.println(" expenses ");
    	
    	//for entering number of expenses and reason we use do while
    	do {	
    		System.out.println("Enter Expenses :");
    		exp=sc.nextInt();
    		System.out.println("Enter Expense Reason where u are expense that money: ");
    		String reason=sc.next();
    		total_exp=total_exp + exp;
    		System.out.println("Add More Expenses? y/n");
    		ch=sc.next().charAt(0);
    	}while(ch=='y'|| ch=='Y');
    }
    
	
	//Display method
    public void display() 
    {
    	System.out.println("Employee's name : "+name);
    	System.out.println("Employee's ID : "+e_id);
    	System.out.println("Employee's Phone No. : "+phone_no);
    	System.out.println("Employee's Address : "+address);
    	System.out.println("Employee's Salary : "+salary);
    	System.out.println("Total Expenses of "+name+" are "+total_exp);
    	System.out.println("after Expenses Remaining Salary of Employee  "+(salary-total_exp));
    }
}
	
	
	 
	
	

