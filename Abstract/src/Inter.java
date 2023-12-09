interface data{
	void circle1();
	
}
class Shapetest implements data{
	public void circle1() {
		System.out.println("reactangle");
	}
	
}
class Circle implements data{
	public void circle1() {
		System.out.println("Circle is best way to search the position ");
	}
}
public class Inter {
	public static void main(String[] args) {
		data c=new Shapetest();
		c.circle1();
		data c1=new Circle();
		c1.circle1();
		
	}

}
