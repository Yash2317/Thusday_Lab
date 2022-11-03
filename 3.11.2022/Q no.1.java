/* Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor). 
 * The threads should display the messages continuously till the user presses any key.*/
package Thursday03;

public class Revision extends Thread {
	String str; // global variable

	Revision(String s) // constructor taking a parameter
	{
		str = s;
	}

	public void run() // run method calling by the another class
	{

		for (;;) // infinity loop
		{
			System.out.println((Thread.currentThread()).getName() + " " + "Message: " + str); // printing the message
			System.out.println(
					(Thread.currentThread()).getName() + " " + "Priority:  " + (Thread.currentThread()).getPriority()); // printing
																														// the
																														// priority
																														// here

			try {
				Thread.sleep(1000); // sleeping the thread for 1 sec
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

package Thursday03;

public class Loop extends Thread {
	// main method
	public static void main(String[] args) {
		Revision ob = new Revision("ACTIVE"); // passing the argument to the constructor
		Revision ob1 = new Revision("UNACTIVE"); // passing the argument to the constructor
		System.out.println("Display Output Here..");
		ob.start(); // calling the run method
		ob1.start(); // calling the run method
	}

}

