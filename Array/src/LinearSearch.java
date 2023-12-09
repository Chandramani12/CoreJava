
public class LinearSearch {
	
	public static int Linear(int arr[],int l,int s) {
	
		for(int i=0;i<l;i++) {
			if(arr[i]==s) {
				return i;
			}
		}
		
	return -1;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		
	   int leangth=arr.length;
	   
	   int key=1;
	   int search=Linear(arr,leangth,key);
	   if(search==-1) {
		   System.out.print( 
	                "Element is not present in array"); 
	   }
	   else
           System.out.print("Element is present at index "
                            + search); 
   } 
		
	

}
