import java.util.Scanner;

public class Deck extends Cards {

	public Deck[] starterDeck;	
	public Deck(){

		}
		
/*	Deck[] FlameOn = new Deck[29];
	Deck[] GreenPower = new Deck[29];
	Deck[] Tsunami = new Deck[29];*/
	
/*	Cards[] FlameOn = new Cards[3];
	Cards[] GreenPower = new Cards[3];
	Cards[] Tsunami = new Cards[3];
	Cards[] StartDeck = new Cards[3];*/
	

/*	public boolean x;
	public Deck[] setStartDeck(){
		System.out.println("Choose your starting deck of cards! \n"
				+ "Will it be the extreemly hot 'FlameOn' deck? \n"
				+ "Or maybe you would preffer something more down-to-earth with the 'GreenPower' deck? \n"
				+ "No? Than perhaps you're not afraid to get wet with the 'Tsunami' deck?");
		
		do{
			Scanner scan = new Scanner(System.in);
			String deck = scan.nextLine().toLowerCase();
			switch (deck){
			case "flameon":
				System.out.println("FlameOn it is!");
				Deck[] FlameOn = new Deck[3];
				FlameOn[0] = (Deck) new Cards("CHARMANDER", "FIRE");
				FlameOn[1] = (Deck) new Cards("CHARMANDER", "FIRE");
				FlameOn[2] = (Deck) new Cards("CHARMELEON", "FIRE");
				x=false;
				break;
			case "greenpower":
				Cards[] GreenPower = new Cards[3];
				GreenPower[0] = new Cards("BULBASAUR", "GRASS");
				GreenPower[1] = new Cards("BULBASAUR", "GRASS");
				GreenPower[2] = new Cards("BULBASAUR", "GRASS");
				x=false;
				break;
			case "tsunami":
				Cards[] Tsunami = new Cards[3];
				Tsunami[0] = new Cards("SQUIRTLE", "WATER");
				Tsunami[1] = new Cards("SQUIRTLE", "WATER");
				Tsunami[2] = new Cards("WARTORTLE", "WATER");
				x=false;
				break;
			default:
				System.out.println("Wrong deck name. Please Write again.");
				x=true;
				break;
			}
			
		}while (x=false);
		
		return starterDeck;
	}*/
	
}
