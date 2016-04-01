import java.util.Scanner;

public class StartDecks extends Cards {

	public Cards[] main;
	public Cards[] FlameOn;
	boolean x;

	
	public void setFlameOn() {
		FlameOn = new Cards[3];
		FlameOn[0] = new Cards("CHARMANDER", "FIRE");
		FlameOn[1] = new Cards("CHARMANDER", "FIRE");
		FlameOn[2] = new Cards("CHARMELEON", "FIRE");
		
		/*System.out.println("Your deck consists of: ");
		for(int x=0; x<FlameOn.length; x++){
			FlameOn[x].toString();*/
		/*}*/
	}
	
	public Cards[] getFlameOn() {
		System.out.println("Your deck consists of: ");
		for(int x=0; x<FlameOn.length; x++){
			FlameOn[x].toString();
		}
		return FlameOn;
	}
	

	public void setMain() {
		System.out.println("Choose your starting deck of cards! \n"
				+ "Will it be the extreemly hot 'FlameOn' deck? \n"
				+ "Or maybe you would preffer something more down-to-earth with the 'GreenPower' deck? \n"
				+ "No? Than perhaps you're not afraid to get wet with the 'Tsunami' deck?");
		do{
			Scanner scan = new Scanner(System.in);
			String deck = scan.nextLine().toLowerCase();
			switch (deck){
			case "flameon":
				main = FlameOn;
				x=false;
				break;
			default:
				System.out.println("Wrong deck name. Please Write again.");
				x=true;
				break;
			}		
		}while (x=false);
	}
	
	public Cards[] getMain() {
		System.out.println("Your deck consists of: ");
		for(int x=0; x<main.length; x++){
			main[x].toString();
		}
		return main;
	}
	
	
}
