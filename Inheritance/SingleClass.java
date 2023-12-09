
class First{
	
	void eat()
	{
		System.out.println("Eating.........");
	}
}

class Second extends First{
	void walk()
	{
		System.out.println("Walking............");
	}
}

public class SingleClass{
	
	public static void main(String[] args) {
		Second s=new Second();
		s.walk();
		s.eat();
	}
	

}
