package Tests;

public class PascalTriangle {
	
	static int mylevel = 8;

	public static void main(String[] args) {
		
/******** Pascals triangle ***********
 *        1
 *       1 1
 *      1 2 1
 *     1 3 3 1
 *    1 4 6 4 1
 *  1 5 10 10 5 1
 */		
		
		getPascal1(mylevel);
		getPascal2(mylevel);

	}

/******** Pascals triangle ***********
 * Using 1-D Array
 * @param mylevel : no. of levels you want to print
 */
	private static void getPascal1(int mylevel) {
		
		if(mylevel <1) {
			System.out.print("Invalid input");
			return;
		}
		
		int pascal[] = new int[mylevel];
		int prev=1, curr=0;  //To store previous and current values
		int rows=1, cols;
		
		pascal[0] = 1;
		System.out.print("\n\n\n"+pascal[0]);
		
		while(rows < mylevel) {
			
			System.out.print("\n" + pascal[0]+ " ");
			
			for(cols=1;cols<rows; cols++) {
				curr = pascal[cols];
				pascal[cols] = prev + curr;
				prev = curr;
				System.out.print(pascal[cols] + " ");	
			}
			pascal[cols] = 1;
			System.out.print("" + pascal[cols]+ " ");
			rows++;
		}
	}

/******* Pascals triangle ***********
 * Using 2-D Array
 * @param mylevel : no. of levels you want to print
 */
	private static void getPascal2(int level) {
		
		if(level <1) {
			System.out.print("Invalid input");
			return;
		}
		
		int[][]  pascal = new int[level][level];
		
		pascal[0][0] = 1;
		System.out.print("1");
		
		for(int i=1; i<level; i++) {
			pascal[i][0] = 1;
			System.out.print("\n"+ pascal[i][0]);
			int j;
			for(j=1; j<i; j++) {
				pascal[i][j] = pascal[i-1][j-1] +pascal[i-1][j];
				System.out.print(" "+ pascal[i][j]);
			}
			pascal[i][j] = 1;
			System.out.print(" "+ pascal[i][j]);
			
		}
		
	}

		
		
}
