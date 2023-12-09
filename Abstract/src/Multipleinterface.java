interface Drawable{
	static void print() {
		
		
	}
}

public class Multipleinterface implements Drawable {
	void print() {
		System.out.println("Hello Mutiple inheritance");
	}
	public static void main(String[] args) {
		Multipleinterface m=new Multipleinterface();
		m.print();
	}

}
