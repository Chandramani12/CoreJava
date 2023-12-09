import java.lang.constant.*;
public class ThreeLargestValue {
	
	public static int FindthreeLargestValue(int arr[],int index){
		int i,first,second,third;
		if(index<3) {
		 return 1;
		}
		
		third=first=second=Integer.MIN_VALUE;
		
		for(i=0;i<index;i++) {
			if(arr[i]>first) {
				 third = second;
	             second = first;
	                first = arr[i];
				
			}
			else if(arr[i]>second) {
				third = second;
                second = arr[i];
				
			}
			else if (arr[i] > third)
                third = arr[i];
		}
		
		System.out.println("Three largest elements are " + first + " " + second + " " + third);
		
		
		return 10;
		
	}
	
	
	
	public static void main(String[] args) {
	
		int arr[]= {3,1,2};
		
		int index=arr.length;
		
		int result = FindthreeLargestValue(arr,index);
		String dayString=Integer.toString(result);
		switch (result) {
		case 1: 
			
			dayString ="Ivalid Input";
			break;
			
		case 10: 
			
			dayString ="Valid Input";
			break;
			
		
		}
		System.out.println(dayString);
	}

}
