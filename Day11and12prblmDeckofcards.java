package Day11_12problems;


	import java.util.Random;

	public class Day11and12prblmDeckofcards {

		static String[] SUITSArray = { "Clubs", "Diamonds", "Hearts", "Speades" };
		static String[] RANKSArray = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		static String[][] cardCombination = new String[RANKSArray.length][RANKSArray.length];

		public static void main(String[] args) {
			Day11and12prblmDeckofcards deckOfCards = new Day11and12prblmDeckofcards();

			deckOfCards.getCardCombination();
			deckOfCards.shuffleCard();
			deckOfCards.distribute();
		}

		public void getCardCombination() {
			for (int i = 0; i < SUITSArray.length; i++) {
				for (int j = 0; j < RANKSArray.length; j++) {
					cardCombination[i][j] = SUITSArray[i] + RANKSArray[j];
				}
			}
		}

		public void shuffleCard() {
			Random random = new Random();
			for (int i = 0; i < SUITSArray.length; i++) {
				for (int j = 0; j < RANKSArray.length; j++) {
					int m = random.nextInt(i + 1);
					int n = random.nextInt(j + 1);
					String temp = cardCombination[i][j];
					cardCombination[i][j] = cardCombination[m][n];
					cardCombination[m][n] = temp;
				}
			}
		}

		public void distribute() {
			for (int i = 0; i < 4; i++) {
				System.out.println(" ");
				System.out.println("Cards Recieved By The Player " + (i + 1) + " are");
				for (int j = 0; j < 9; j++) {
					System.out.println("  " + cardCombination[i][j]);
				}
			}
		}
	}