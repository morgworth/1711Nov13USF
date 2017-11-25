import java.util.Scanner;

public class WellHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "The One";
		
		
		try (!name.equals(name.toString()){ 
			
			Scanner scan = new Scanner(System.in);
			name = scan.nextLine();
			System.out.println("Well hello there: " + name);
		}catch(Exception e) {
			
		}
		return name;
	}

}
