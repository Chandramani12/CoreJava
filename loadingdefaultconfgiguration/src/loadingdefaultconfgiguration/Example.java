package loadingdefaultconfgiguration;

import java.util.*;

public class Example {
	
	private String name;

	public String setName(String name) {
		if(name!=null && name.length()>2) {
			this.name=name;
		}
		return name;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		Example e=new Example();
		
		System.out.println(e.setName(name));
		sc.close();
	}
}
