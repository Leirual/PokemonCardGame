
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
	
	
	
	

}
