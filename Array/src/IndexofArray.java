import java.util.HashMap;

public class IndexofArray {
	
	

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		int target =7;
		int num[]=ChecktargetValue(arr,target);
		System.out.println(num);
	}

	private static int[] ChecktargetValue(int[] arr, int target) {
		
		HashMap<Integer, Integer> indexmap=new HashMap<Integer,Integer>();
		
		for(int start=0;start<arr.length;start++) {
			Integer reuirednumber=(Integer)(target-arr[start]);
			if(indexmap.containsKey(reuirednumber)) {
				 int toReturn[] = {indexmap.get(reuirednumber), start};
	                return toReturn;
			}
			indexmap.put(arr[start], start);
		}
		
		
		return null;
	}
}
