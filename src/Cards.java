import java.util.Arrays;
import java.util.Scanner;

public class Cards {
	
	private String name;
	private String type;
	private int retreatCost;
	private Skill skill;

	
	public Cards(){
		
	}
	public Cards(String name, String type){
		this.name = name;
		this.type = type;
	}
	public Cards(String name, String type, int retreatCost, Skill skill){
		this.name = name;
		this.type = type;
		this.retreatCost = retreatCost;
		this.skill = skill;
	}
	
	
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
	
	public int getRetreatCost() {
		return retreatCost;
	}
	public void setRetreatCost(int retreatCost) {
		this.retreatCost = retreatCost;
	}

	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	// metoda do wypisywania kart - nazwa i typ
	public String toString(){
		String str = "Name: " + name + " Type: " + type;
		System.out.println(str);
		return str;
	}
		
	

}
