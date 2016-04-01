import java.util.Arrays;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

/*		Game game = new Game();
		StartDecks[] main;*/
		
		StartDecks deczek = new StartDecks();
		deczek.setFlameOn();
		deczek.getFlameOn();
		
		deczek.setMain();
		deczek.getMain();
		
		System.out.println("Welcome to Pokemon - The Card Game!");
				
		Player player = new Player();
		player.setPName();
		
		System.out.println("Welcome " + player.getPName());
		
		/*Deck starterDeck = new Deck();
		starterDeck.setStartDeck();
		
		System.out.println("This deck contains: ");
		starterDeck.toString();		*/

	/*	System.out.println(Arrays.toString(starterDeck));
		*/
		

	}

}
