
public class StartDecks extends Cards {

	public StartDecks[] FlameOn;

	public void setFlameOn() {
		Cards[] FlameOn = new Cards[3];
		FlameOn[0] = new Cards("CHARMANDER", "FIRE");
		FlameOn[1] = new Cards("CHARMANDER", "FIRE");
		FlameOn[2] = new Cards("CHARMELEON", "FIRE");
		
		System.out.println("Your deck consists of: ");
		for(int x=0; x<FlameOn.length; x++){
			FlameOn[x].toString();
		}
	
	}
}
