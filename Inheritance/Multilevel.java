

class FirstClass{
	
	void eat()
	{
		System.out.println("Eating.........");
	}
}

class Secondclass extends FirstClass{
	void walk()
	{
		System.out.println("Walking............");
	}
}

class Thirdclass extends Secondclass{
	void sleeping() {
		System.out.println("sleeping...");
	}
}
public class Multilevel {
	
	public static void main(String[] args) {
		Thirdclass t=new Thirdclass();
		t.eat();
		t.walk();
		t.sleeping();
	}
	
	
	
}
