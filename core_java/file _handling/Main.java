package p1;

 class MyCalculator {

	  public long power(int n, int p) throws Exception {
		  
		  if(n < 0 || p<0) {
			  throw new Exception("n or p should not bw negative");
			  
			  
		  }
		  if( n == 0 && p == 0) {
			  throw new Exception("n and p should not be zero");
		  }
		  
		  long result = 1;
		  
		  for(int i = 1; i <= p; i++) {
			  result = result * n;
		  }
		  return result;
	  }
}
 
  public class Main {
	  
	  public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		
		int[][] arr = {
				{3,5},
				{2,4},
				{0,0},
				{-1,-2},
				{-1, 3},
		};
		
		for (int i =0; i<arr.length; i++) {
			try {
				System.out.println(mc.power(arr[i][0], arr[i][1]));
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
  }
  
