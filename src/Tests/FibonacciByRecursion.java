/**
 * 
 */
package Tests;

/**
 * @author Deepkanchan
 *
 */
public class FibonacciByRecursion {

	static int num = 0;
	static int series = 0;
	static int prev1 = 1, prev2 = 1;
	
	public static void main(String[] args) {
		
		System.out.print(" " + prev1 + "  "+ prev2);
		recFibonacci(num);

	}

/******* 14. Fibonacci Series using Recursion ***************
 *  Repeat the following steps until the numbers required in the series are done.
 *      Assign the next no in series as sum of previous two nos. -> prev1 + prev2
 *      Assign prev1 = prev1
 *      Assign prev2 = series
 *      call function 
 */
	private static void recFibonacci(int num) {
		
		while(num > 2) {
			series = prev1 + prev2 ;
			prev1 = prev2;
			prev2 = series;
			System.out.print(" " + series);
			
			num--;
			
		}
	}

}
