import java.util.Scanner;

public class Player {
	
	private String pName;
	
	
	public Player(){
		
	}
	
	public String setPName(){
		System.out.println("Please input player name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		return name;
	}
	
	
}
