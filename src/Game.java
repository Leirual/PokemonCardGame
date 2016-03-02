public class Game {

	public static void main(String[] args) {

		System.out.println("Welcome to Pokemon - The Card Game!");
				
		Player player = new Player();
		player.setPName();
		
		System.out.println("Welcome " + player.getPName());
		//System.out.println("Please pick your starting deck of cards from the ones available below.");
		
		//System.out.println("1. Flame On   2. Green Power   3. Tsunami");
		//System.out.println("Deck 1, 2 or 3?");
		
		//Scanner scan2 = new Scanner(System.in);
		//String deck = scan2.nextLine().toLowerCase();
	
		Deck startDeck = new Deck();
		startDeck.setStartDeck();
		

	}

}
