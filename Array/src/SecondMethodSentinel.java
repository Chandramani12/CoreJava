import java.util.Arrays;

public class SecondMethodSentinel {
	
	
	static int  Search(int arr[],int length,int key) {
		
		int last=arr[length-1];
		
		arr[length-1]=key;
		
		
		int i=0;
		
		while(arr[i]!=key) {
			i++;
		}
		arr[length-1]=last;
		
		if(i<length-1 ||last==key) {
			return i;
		}
		
		
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		int key=1;
		
		int index=Search(arr,arr.length,key);
			
		if (index == -1) {
            System.out.println(key + " is not found in the array :" +Arrays.toString(arr));
        } else {
            System.out.println(key + " is found at index " + index + " in the array: " + Arrays.toString(arr));
        }
		
		
	}

}
