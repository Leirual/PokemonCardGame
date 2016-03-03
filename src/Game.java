import java.util.Arrays;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		System.out.println("Welcome to Pokemon - The Card Game!");
				
		Player player = new Player();
		player.setPName();
		
		System.out.println("Welcome " + player.getPName());
		
		System.out.println("Choose your starting deck of cards! \n"
				+ "Will it be the extreemly hot 'FlameOn' deck? \n"
				+ "Or maybe you would preffer something more down-to-earth with the 'GreenPower' deck? \n"
				+ "No? Than perhaps you're not afraid to get wet with the 'Tsunami' deck?");
		
		
		//Cards StarterDeck = new Cards();
		Cards nowe = new Cards();
		Cards[] FlameOn = new Cards[3];
		FlameOn[0] = new Cards("CHARMANDER", "FIRE");
		FlameOn[1] = new Cards("CHARMANDER", "FIRE");
		FlameOn[2] = new Cards("CHARMELEON", "FIRE");
		Cards[] GreenPower = new Cards[3];
		GreenPower[0] = new Cards("BULBASAUR", "GRASS");
		GreenPower[1] = new Cards("BULBASAUR", "GRASS");
		GreenPower[2] = new Cards("IVYSAUR", "GRASS");
		Cards[] Tsunami = new Cards[3];
		Tsunami[0] = new Cards("SQUIRTLE", "WATER");
		Tsunami[1] = new Cards("SQUIRTLE", "WATER");
		Tsunami[2] = new Cards("WARTORTLE", "WATER");
		Cards[] StartDeck = new Cards[3];
				
		boolean x = true;
		while(x){
			Scanner scan = new Scanner(System.in);
			String deck = scan.nextLine().toLowerCase();
			switch (deck){
			case "flameon":
				System.out.println("FlameOn it is!");
				StartDeck = FlameOn;
				x = false;
				break;
			case "greenpower":
				System.out.println("GreenPower it is!");
				StartDeck = GreenPower;
				x = false;
				break;
			case "tsunami":
				System.out.println("Tsunami it is!");
				StartDeck = Tsunami;
				x = false;
				break;
			default:
				System.out.println("Wrong deck name. Please Write again.");
				break;
			}			
		}
		
		System.out.println("This deck contains: ");
		FlameOn.toString();		
		//System.out.println(Arrays.toString(StartDeck));
		System.out.println(Arrays.toString(Tsunami));
		
		

	}

}
