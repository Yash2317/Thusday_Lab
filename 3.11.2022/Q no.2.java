/*Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept. 
Producer Consumer problem: The producer-consumer problem is the classical concurrency of a multi process synchronization problem. 
It is also known as bound-buffer problem. The problem describes two processes, the producer and the consumer, 
who share a common, fixed-size buffer used as a queue. The producer generates a piece of data, put it into the buffer and starts again.
*/
package Thursday03;

public class Consumer_Class  extends Thread {
	
	Problem_Class Shop;	//declared variable for using the class name.........
	      int num,value = 0,i;  //declared varaible and data type......
	     
	      //create construtor.............
	      public Consumer2(Problem_Class c, int number)
	      {
	            Shop = c;
	            this.num = number;//use this keyword for use the same class variable...........
	      }
	      public void run()//create run method......
	      {
	            for ( i = 0; i < 10; i++)//using the for loop
	            {
	                  System.out.println("Consumed value " + this.num+ " got: " + value);//for print
	            }
	      }

}
---------------
package Revision;
class Main_Class // main class
{
	public static void main(String[] args) // main method
	{
		Problem_Class pc = new Problem_Class(); // creating object of Problem class
		Producer_Class p1 = new Producer_Class(pc, 1); // creating object of Producer_class and passing the arguments to the constructor
		Consumer_Class c1 = new Consumer_Class(pc, 2);  // creating object of Consumer_class and passing the arguments to the constructor
	      c1.start(); // calling a run method
	      p1.start(); // calling a run method
	}
}
------------------
package Revision;
public class Problem_Class  {  // this is problem class that carry problem according to the ques

   int materials;  // global variables here
    boolean available = false;
    public synchronized int get() // synchronized method to get a true or false
    {
          while (available == false) // while loop for false condition
          {
                try
                {
                      wait(); // if false then problem will be wait
                }
                catch (InterruptedException ie) // catching the exception
                {
                }
          }
          available = false; // material not available
          notifyAll();
          return materials; //return a material to the method
    }
    public synchronized void put(int value) // synchronized method for true conditions
    {
          while (available == true) // while loop for true condition
          {
                try
                {
                      wait(); // wait the program
                }
                catch (InterruptedException ie) // catching the Interrupted Exception here
                {
                      ie.printStackTrace();
                }
          }
          materials = value; // material available in a value
          available = true; // material available here
          notifyAll();
    }


}
----------------
package Revision;
public class Producer_Class extends Thread {
	         	      //use the thread class property.......
	Problem_Class  Shop;  //declared variable for using the class name.........
      	int number;           //declared varaible and data type......
	
     public Producer_Class(Problem_Class c, int number) //create construtor and taking a paramether
     {
           Shop = c;
           this.number = number;	//use this keyword for use the same class variable
     }
     public void run()			//create run method.....
     {
           for (int i = 0; i < 10; i++)  //using  for loop....
           {
                 
                 System.out.println("Produced value " + this.number+ " put: " + i);
                 try						//use try block where exception show........
                 {
                	
                       sleep((int)(Math.random() * 100));	//sleep method of thread
                 }
                 catch (InterruptedException ie)		//catch block to handle the exception.....
                 {
                     System.out.println(ie);			//simply print the exception.......
                 }
           }
     }

}

					
