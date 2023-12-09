
public class AddNumber {
	
	
		
		public static void main(String[] args) {

	        int a[][] = {{2, 3}, {3, 4}};
	        int b[][] = {{2, 5}, {6, 7}};

	        int c[][] = new int[2][2];

	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	            	
	                c[i][j] = a[i][j] + b[i][j];
	            }
	        }

	        System.out.println("The sum of the two matrices is: ");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(c[i][j] + " ");
	            }
	            System.out.println();
	        }
	        //Multiplication of code 
	        System.out.println("Multiplication of this code");
	        int p[][] = new int[2][2];
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	            	for(int k=0;k<2;k++) {
	                p[i][j] = p[i][j]+a[i][k] * b[k][j];
	                
	            	}
	            	System.out.print(p[i][j]+" ");
	            }
	            System.out.println();
	        }
	       
	        
	    }
}
