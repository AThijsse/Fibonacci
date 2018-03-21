public class Fibonacci {
	
	public static void main (String [] args) {
	
		int a = 0;
		int b = 1;
		int r = 5;
		// r is input Fibonacci
		int count = 1;
		int x;
		int q = 0;
		
		
	while (count <= r - 2 ) {
		
			x = a + b;
			
			if (x % 2 == 0) {
			q = q + x;
			}
			
			if ( count == (r - 2) ) {
				
				System.out.println("The value of the "+r+"th term of Fibonacci is "+x);
				
				System.out.println("The sum of all even values of the first "+r+" terms is "+ q);
			
			break;
        
			} else {

			a = b;
			b = x;
			
			count = count + 1;
			
			}
		}
	}
}
