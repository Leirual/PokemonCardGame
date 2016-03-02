import java.util.Scanner;

public class Deck {

	public Deck[] startDeck;	
	public Deck(){
		
	}
		
	Deck[] FlameOn = new Deck[29];	
	Deck[] GreenPower = new Deck[29];
	Deck[] Tsunami = new Deck[29];
	
	public Deck[] setStartDeck(){
		System.out.println("Choose your starting deck of cards! \n"
				+ "Will it be the extreemly hot 'FlameOn' deck? \n"
				+ "Or maybe you would preffer something more down-to-earth with the 'GreenPower' deck? \n"
				+ "No? Than perhaps you're not afraid to get wet with the 'Tsunami' deck?");
		boolean x;
		do{
			Scanner scan = new Scanner(System.in);
			String deck = scan.nextLine().toLowerCase();
			switch (deck){
			case "flameon":
				System.out.println("FlameOn it is!");
				FlameOn = new Deck[29];
				x=false;
				break;
			case "greenpower":
				System.out.println("GreenPower it is!");
				GreenPower = new Deck[29];
				x=false;
				break;
			case "tsunami":
				System.out.println("Tsunami it is!");
				Tsunami = new Deck[29];
				x=false;
				break;
			default:
				System.out.println("Wrong deck name. Please Write again.");
				x=true;
				break;
			}			
		}
		while (x = true);
		
		return startDeck;
	}
	
}
