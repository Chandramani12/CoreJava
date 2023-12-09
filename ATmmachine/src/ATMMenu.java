import java.util.*;

public class ATMMenu {
	
	public static int Menu(Scanner scanner,ATMMachine account) {
		
		int choice=scanner.nextInt();
		System.out.println("1. WithDraw a cash");
		System.out.println("2. Depoist a cash");
		System.out.println("3. Check Balanced a cash");
		
		return choice;
	}

}
