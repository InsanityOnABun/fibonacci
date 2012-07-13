/*

  This program demonstrates that, when using a recursive method to
  find numbers in the classic Fibonacci sequence, the time taken
  by each subsequent run of the method itself forms a Fibonacci
  sequence.
  
  Author: Charles Rosaaen

/*


public class fibonaccimain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double past1, past2, span, expect;
		past1 = past2 = 0;
		
		for (int x = 41; x < 50; x++)
		{
			long pre = System.nanoTime();
			// get the next fibonacci number
			int y = fibo(x);
			long post = System.nanoTime();
			span = (post - pre) / 1000000000.0;
			expect = past1 + past2;
			System.out.println( y + "\n" + span + " (" + expect + ")\n---------");
			past2 = past1;
			past1 = span;
		}
		
		
		
	}
	
	// gets the x'th fibonacci number
	private static int fibo (int x)
	{
		if (x == 0)
			return x;
		else if (x == 1)
			return x;
		else
			return fibo(x - 1) + fibo (x - 2);
		
	}

}
