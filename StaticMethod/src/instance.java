
public class instance {
	
	static int count=0;
	instance(){
		count++;
		System.out.println(count);
		
	}
public static void main(String[] args) {
	instance i=new instance();
	instance i1=new instance();
	instance i2=new instance();
	instance i3=new instance();
	instance i4=new instance();
	
}
	
}
