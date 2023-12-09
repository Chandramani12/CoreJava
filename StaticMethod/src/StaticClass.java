

public class StaticClass {
	
	public static void main(String[] args) {
		Collgeg c=new Collgeg(1,"Chandramani Tiwari");
		Collgeg c1=new Collgeg(2,"Narayan Yadav");
		c.display();
		c1.display();
	}
	

}

class Collgeg{
	int id;
	String name;
	static String college="Patkar varde college";
	
	Collgeg(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	void display (){System.out.println(id+" "+name+" "+college);}  
	
}
