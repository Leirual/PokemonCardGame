import java.util.Arrays;
import java.util.Scanner;

public class Cards {
	
	private String name;
	private String type;

	
	
	public Cards(){
		
	}
	
	public Cards(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	
	Cards[] FlameOn = new Cards[3];
	Cards[] GreenPower = new Cards[3];
	Cards[] Tsunami = new Cards[3];
	Cards[] StartDeck = new Cards[3];
	
	
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setType(String type){
		this.type = type;
	}
	
	/*public String PritnTab(Cards[]){
		for(int x=0, x<29, x++){
			System.out.println(StartDeck[x]);
			
		}*/
	
	public String toString(){
		String str = "Name: " + name + " Type: " + type;
		System.out.println(str);
		return str;
	}
		


	
	
	

}
