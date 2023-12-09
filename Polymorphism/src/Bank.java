import java.io.ObjectInputStream.GetField;

class SBIBank extends CommonBank{
	float getRate() {
		return 5f;
	}
}

class AXis extends CommonBank{
	float getRate() {
		return 5.5f;
	}
}
class HDFC extends CommonBank{
	float getRate() {
		return 6f;
	}
}
class KotakBank extends CommonBank{
	float getRate() {
		return 3f;
	}
}
class CommonBank {
	float getRate() {
		return 0;
	}
}


public class Bank {
	
	public static void main(String[] args) {
		CommonBank b;
		
		b=new SBIBank();
		System.out.println("SBI Return the rate value :" +b.getRate());
			
		b=new AXis();
		System.out.println("Axis Return the rate value :" +b.getRate());
			
		
		b=new KotakBank();
		System.out.println("Kotak  Return the rate value :" +b.getRate());
			
	}

}
