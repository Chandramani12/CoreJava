	
	public class RandomNumber {
		
		public int randonN() {
			int srand;
			
			do{
				double randnumber=Math.random();
				
				int rand=(int)(randnumber*10000);
				
				srand=Integer.valueOf(rand);
				
				
			}
			while(String.valueOf(srand).length()!=4);
			return srand;
		}
		
		public static void main(String[] args) {
		
			RandomNumber obj=new RandomNumber();
			
			System.out.println(obj.randonN());
		}
		
	}
