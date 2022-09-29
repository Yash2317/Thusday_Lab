
//WAP to accept the choice for a restaurant menu.
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu_item, menu1, i_price = 0, Quantity = 1;
		char ans;
		String i_name = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Menu:\n1: Starters \n2: Main course \n3: Deserts");
			menu_item = sc.nextInt();
			switch (menu_item) { // Swtich used for Count total bill, Items and calutale quantity.1
			case 1:
				System.out.println("1: Masala Papad\t\t 50Rs.");
				System.out.println("2: Tandoori\t\t 200Rs.");
				System.out.println("3: Manchurian\t\t 100Rs.");
				System.out.println("Select your Starter:");
				menu1 = sc.nextInt();
				System.out.println("Enter Quantity:");
				Quantity = sc.nextInt();
				switch (menu1) {
				case 1:
					i_price += Quantity * 50;
					i_name += "\nMasala Papad\t" + Quantity + "\t50Rs.";
					System.out.println("You have ordered  " + Quantity + " Masala Papad");
					break;
				case 2:
					i_price += Quantity * 200;
					i_name += "\nTandoori\t  " + Quantity + "\t200Rs.";
					System.out.println("You have ordered  " + Quantity + " Tandoori");
					break;
				case 3:
					i_price += Quantity * 100;
					i_name += "\nManchurian\t  " + Quantity + "\t100Rs.";
					System.out.println("You have ordered  " + Quantity + " Manchurian");
					break;
				default:
					System.out.println("Invalid choice");

				}
				break;

			case 2:
				System.out.println("1: Panner Tikka\t\t 150Rs.");
				System.out.println("2: Panner Masala\t 300Rs.");
				System.out.println("3: Chinken Masala\t 250Rs.");
				System.out.println("Select your Main course:");
				menu1 = sc.nextInt();
				System.out.println("Enter Quantity:");
				Quantity = sc.nextInt();

				switch (menu1) {
				case 1:
					i_price += Quantity * 150;
					i_name += "\nPanner Tikka\t  " + Quantity + "\t150Rs.";
					System.out.println("You have ordered " + Quantity + " Panner Tikka");
					break;
				case 2:
					i_price += Quantity * 300;
					i_name += "\nPanner Masala\t  " + Quantity + "\t300Rs.";
					System.out.println("You have ordered " + Quantity + " Panner Masala");
					break;
				case 3:
					i_price += Quantity * 250;
					i_name += "\nChiken Masala\t  " + Quantity + "\t250Rs.";
					System.out.println("You have ordered " + Quantity + " Chicken Masala");
					break;
				default:
					System.out.println("Invalid choice");

				}

				break;
			case 3:
				System.out.println("1: Gulab jabun\t\t 100Rs.");
				System.out.println("2: Ice Cream\t\t 250Rs.");
				System.out.println("3: Cake    \t\t 200Rs.");
				System.out.println("Select your Desert:");
				menu1 = sc.nextInt();
				System.out.println("Enter Quantity:");
				Quantity = sc.nextInt();
				switch (menu1) {
				case 1:
					i_price += Quantity * 100;
					i_name += "\nGulab jamoon\t  " + Quantity + "\t100Rs.";
					System.out.println("You have ordered " + Quantity + " Gulab jamoon");
					break;
				case 2:
					i_price += Quantity * 250;
					i_name += "\nIce Cream\t  " + Quantity + "\t250Rs.";
					System.out.println("You have ordered " + Quantity + " Ice Cream");
					break;
				case 3:
					i_price += Quantity * 200;
					i_name += "\nCake\t\t  " + Quantity + "\t200Rs.";
					System.out.println("You have ordered " + Quantity + " Cake");
					break;
				default:
					System.out.println("Invalid choice");

				}
				break;

			}
			System.out.println("Do you want to add another item y/n?"); // break or to contine the menu.
			ans = sc.next().charAt(0);
		}

		while (ans == 'Y' || ans == 'y');
		System.out.println("Thanks for coming");
		System.out.println("Your ordered items are:\nItems\t\tQuantity Cost\n------------------------------" + i_name); // diplays
																														// the
																														// Item
																														// names
																														// Quantity
																														// and
																														// price
		System.out.println("------------------------------");
		System.out.println("The Total bill amount is:" + i_price); // display the Total bill
	}

}
