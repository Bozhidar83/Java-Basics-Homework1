public class GeneratePDFByExternalLibrary {

	public static void main(String[] args) {
		/* Write a program to generate a PDF document called 
		 * Deck-of-Cards.pdf and print in it a standard deck of 52 cards,
		 * following one after another. Each card should be a rectangle
		 * holding its face and suit
		 */

		//char suit = '\u2660';
		String colors[] = {"\u2663", "\u2666", "u2665", "u2660"};
		for (int i = 2; i <= 14; i++) {
			for (int j = 0; j < 4; j++) {
				if (i <= 10) {
					System.out.println(i + " ");
				}
				else {
					switch (i) {
					case 11:
						System.out.println("J ");
						break;
					case 12:
						System.out.println("Q ");
						break;
					case 13:
						System.out.println("K ");
						break;
					case 14:
						System.out.println("A ");
						break;
					}
				}
				//String currentCard = i + "" + suit;
				System.out.print(colors[j]);
				//suit++;
			}
			System.out.println();
		}
		
		System.out.println("\u0003");
		String COPYRIGHT = "\u00a9";
		System.out.println(COPYRIGHT);
	}

}
