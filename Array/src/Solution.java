//Given an array of N elements and L and R, print the number of sub-arrays such that the value of the maximum array element in that subarray is at least L and at most R.
public class Solution {
	
	public static void main(String arg[]) 
	{
	    int a[] = {2, 0, 11, 3, 0};
	    int n = a.length;
	    int l = 1, r = 11;
	    System.out.print(countSubarrays(a, n, l, r));
	}

	private static int countSubarrays(int[] a, int n, int l, int r) {
		int result=0;
		  long exc = 0, inc = 0;
		
		for(int i=0;i<n;i++) {
			if(a[i]>r) {
				result+=(countSubarrays(inc)-countSubarrays(exc));
				inc=0;
				exc=0;
				
			}
			else if(a[i]<l) {
		        

				exc++;
		        inc++;
			}
			else {
		        result -= countSubarrays(exc);
		        exc = 0;
		        inc++;

			}
		}
		result += (countSubarrays(inc) - countSubarrays(exc));
		return result;
	}
	static long countSubarrays(long n) {
		return n*(n+1)/2;
	}
	
}
