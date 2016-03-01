import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		System.out.println("Welcome to Pokemon - The Card Game!");
		System.out.print("Please state your name: ");
		
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.nextLine().toUpperCase();
		
		System.out.println("Nice to meet you " + name);
		System.out.println("Please pick your starting deck of cards from the ones available below.");
		
		Cards[] FlameOn = new Cards[30];
		FlameOn[0] = new Cards();
		
		Cards[] GreenPower = new Cards[30];
		Cards[] Tsunami = new Cards[30];
				
		System.out.println("1. Flame On   2. Green Power   3. Tsunami");
		System.out.println("Deck 1, 2 or 3?");
		
		Scanner scan2 = new Scanner(System.in);
		String deck = scan2.nextLine().toLowerCase();
		
		switch(deck){
		case "1":
			
		}	
	
		
		

	}

}
