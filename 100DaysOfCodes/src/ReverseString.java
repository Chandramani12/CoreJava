//Reverse a String
public class ReverseString {
	
	public static void main(String[] args) {
		
		String name="Chandramani Tiwari";
		
		char ch[]=name.toCharArray();
		
		int charlentght=ch.length;
		StringBuilder sb=new StringBuilder();
		for(int i=charlentght-1;i>=0;i--) {
			
			sb.append(ch[i]);
			
		}
		System.out.println(sb.toString());
	}

}
