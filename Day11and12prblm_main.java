
package Day11_12problems;

import java.util.Scanner;

public class Day11and12prblm_main {

	public static void main(String[] args) {
		System.out.println("__________Welcome to National Stock Exchange__________");
		Day11and12prblm_account stockExchange = new Day11and12prblm_account();
		int choice;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("""
					1: Add Fund.\s
					2: Buy Stocks.\s
					3: Sell Stocks.\s
					4: View portfalio\s
					5: Withdraw Money.""");
			System.out.println();
			System.out.print("Enter Your Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				stockExchange.addFund();
				break;

			case 2:
				stockExchange.buyStock();
				break;

			case 3:
				stockExchange.sellStock();
				break;

			case 4:
				System.out.println("\n-------portfalio-------");
				stockExchange.showNifty();

				break;

			case 5:
				stockExchange.withdrawsMoney();
				break;

			default:
				System.out.println("You have Entered Wrong Choice ");
			}
		}
	}
}
