import java.util.Arrays;

public class IterativeBinary {
	
	
	static int Search(int arr[],int key) {
		
		
		int lower=0;
		int high=arr.length-1;
		
		while(lower<=high) {
			
			int m=lower+(high-lower)/2;
			
			if(arr[m]==key) {
				return m;
			}
			
			if(arr[m]<key) {
				lower=m+1;
			}
			else {
				high=m-1;
			}
			
			
		}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		
		int arr[]= {1,2,14,6,10,15};
		
		Arrays.sort(arr);
		int key=15;
		
		
		IterativeBinary i=new IterativeBinary();
		
		int index=i.Search(arr,key);
		
		if(index==-1) {
			System.out.println("Element is not present");
		}
		else {
			System.out.println("Elemtn is present in arrya: "+Arrays.toString(arr));
		}
	
	}

}
