import java.util.Arrays;

public class ThreeSecondMethod {

	public static void FindthreeLargestValue(int arr[],int index) {
		
		int count=1,check=0;
		 	Arrays.sort(arr);
		 	
		 	for(int i=1;i<=index;i++) {
		 		if(count<4) {
		 				if(check!=arr[index-i]) {
		 					System.out.print(arr[index - i] + " ");
		                    check = arr[index - i];
		                    count++;
		 				}
		 		}
		 		else
		 			break;
		 		
		 	}
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {3,1,2,2,54,65,23,100};
		
		int index=arr.length;
		
		FindthreeLargestValue(arr,index);
	}
}



