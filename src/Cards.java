import java.util.Scanner;

public class Cards {
	
	private String name;
	private String type;
	private String typeCost;
	private int cost;
	
	
	public Cards(){
		
	}
	
	public Cards(String name, String type, String typeCost, int cost){
		this.name = name;
		this.type = type;
		this.typeCost = typeCost;
		this.cost = cost;
	}
	
	
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public String getTypeCost(){
		return typeCost;
	}
	public int getCost(){
		return cost;
	}
	
	
	
	
	
	public Cards[] startDeck;	
		
	Cards[] FlameOn = new Cards[29];
	Cards[] GreenPower = new Cards[29];
	Cards[] Tsunami = new Cards[29];
	
	public Cards[] setStartDeck(){
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
				FlameOn = new Cards[29];
				x=false;
				break;
			case "greenpower":
				System.out.println("GreenPower it is!");
				GreenPower = new Cards[29];
				x=false;
				break;
			case "tsunami":
				System.out.println("Tsunami it is!");
				Tsunami = new Cards[29];
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
