
public class SentinelSearch {

	public static void seach(int arr[],int length,int key) {
		
		
		int lastelement=arr[length-1];
		
		arr[length-1]=key;
		int i=0;
		
		while(arr[i]!=key) {
			i++;
			
		
		}
		arr[length-1]=lastelement;
		
		 if ((i < length - 1) || (arr[length - 1] == key))
	            System.out.println(key + " is present at index "
	                               + i);
	        else
	            System.out.println("Element Not found");
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		
		   int leangth=arr.length;
		   
		   int key=50;
		   
		   seach(arr,leangth,key);
		   
		   
		  
	}
}
