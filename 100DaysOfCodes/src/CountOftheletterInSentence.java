//Identify and count a letter in  the sentence
public class CountOftheletterInSentence {
	
	
	
	public static int countSentence(String str,char ch) {
		
		int count=0;
		
		String lstr=str.toLowerCase();
		char lch=Character.toLowerCase(ch);
		
		char[] firstchar=lstr.toCharArray();
		for(char c:firstchar) {
		if(c==lch) {
			count++;
		}
		}
		
		
		return count;
	}
	
public static void main(String[] args) {
String name="Chandramani Tiawri";
	
	char ch='a';
	System.out.println(countSentence(name,ch));
}
}
