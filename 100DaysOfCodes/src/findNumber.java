import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class findNumber {
	//find the number in Array
	
	public static void main(String[] args) {
		int anum[]= {1,2,3,4,6,7,8};
		int fnum[]= {2,3,4,5};
		for (int i=0;i<fnum.length;i++) {
			int finum=fnum[i];
			if(IntStream.of(anum).anyMatch(num->num==finum)) {
			System.out.println("Already exists"+finum);	
			}
		}
		
		//Find the number in arrayList
		ArrayList<Integer>array=new ArrayList<>(Arrays.asList(34,54,38,97,56,75));
		int[] flistnum= {54};
		for(int i=0;i<flistnum.length;i++) {
			if(array.contains(flistnum[i])) {
				System.out.println(flistnum[i]+"exists");
			}
		}
		
	}
	
}
