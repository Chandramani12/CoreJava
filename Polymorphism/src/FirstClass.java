//Runtime
class Bike{
	
	void run() {
		System.out.println("Hello, I am parent your");
	}
	
}

class FirstClass  extends Bike{

	void run() {
		System.out.println("Hello, I am your child");
	}
	
	public static void main(String[] args) {
		Bike a=new FirstClass();//upcasting
		a.run();
		
	}
	
	
	

}

