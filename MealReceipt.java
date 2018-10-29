import java.util.Scanner;

public class MealReceipt {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Please enter the name of your appetizer: ");
		String nameapp= keyboard.nextLine();
		System.out.print("Please enter the price of your appetizer: ");
		String priceapp= keyboard.nextLine();
		System.out.print("Please enter the name of your entree: ");
		String nameentree= keyboard.nextLine();
		System.out.print("Please enter the price of your entree: ");
		String priceentree= keyboard.nextLine();
		System.out.print("Please enter the name of your dessert: ");
		String namedess= keyboard.nextLine();
		System.out.print("Please enter the price of your dessert: ");
		String pricedess= keyboard.nextLine();
		System.out.print("What percent would you like to tip (as a decimal)?: ");
		String tip= keyboard.nextLine();
		
		System.out.println("Item   "+ "  Price");
		System.out.println(nameapp +"    "+ priceapp);
		System.out.println(nameentree+"    "+priceentree);
		System.out.println(namedess+"     "+pricedess);
		int subtotal;
		
		}

}
