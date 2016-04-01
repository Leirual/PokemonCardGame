import java.util.Arrays;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		System.out.println("Welcome to Pokemon - The Card Game!");
				
		Player player = new Player();
		player.setPName();
		
		System.out.println("Welcome " + player.getPName());
		
		Deck starterDeck = new Deck();
		starterDeck.setStartDeck();
		
		System.out.println("This deck contains: ");
		for(int x=0; x<starterDeck.length; x++){
			
		}
		starterDeck.toString();		

	/*	System.out.println(Arrays.toString(starterDeck));
		*/
		

	}

}
