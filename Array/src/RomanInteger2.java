import java.util.HashMap;

public class RomanInteger2 {
	
	public static void main(String[] args) {
		
		String str="XLVI";
		int num=checkString(str);
		System.out.println(num);
	}

	private static int checkString(String s) {
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        
        int result=0;
        int prevValue=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = map.get(s.charAt(i));
	            if (currValue >= prevValue) {
                result += currValue;
            } else {
                result -= currValue;
            }
            prevValue = currValue;
        }

        return result;
    }
        
	
	
	

}
