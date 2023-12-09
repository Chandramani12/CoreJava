
abstract class Test1{
	
	Test1(){
		System.out.println("Before Prepartion for interview test");
	}
	abstract void run();
	void changes() {
		System.out.println("Changes the position");
	}
}

class Reactangle extends Test1{
	void run() {
		System.out.println("drawing ..............");
	}
}
class Area extends Test1{
	void run() {
		System.out.println("Take full coverage area for drawing the map");
	}
}


public class Shape {
public static void main(String[] args) {
	Test1 t=new Reactangle();
	
	t.run();
	t.changes();
	Test1 t1=new Area();
	t1.run();
	
}
}
