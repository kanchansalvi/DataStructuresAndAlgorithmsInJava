package Question;

/* 1317. Convert Integer to the Sum of Two No-Zero Integers
 * Given an integer n. No-Zero integer is a positive integer which doesn't contain any 0 in its decimal representation.

Return a list of two integers [A, B] where:

A and B are No-Zero integers.
A + B = n
It's guarateed that there is at least one valid solution. If there are many valid solutions you can return any of them.
Input: n = 2
Output: [1,1]
Explanation: A = 1, B = 1. A + B = n and both A and B don't contain any 0 in their decimal representation.
Example 2:

Input: n = 11
Output: [2,9]
Example 3:

Input: n = 10000
Output: [1,9999]
 */
public class getNoZeroInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInt(1010);

	}

	private static int[] getInt(int num) {
		// TODO Auto-generated method stub
		boolean track = false;
		int i=1; 
		int arr[] = {0,0};
		
		
		while(track == false) {
			
		    if((checkZero(i) == true) && (checkZero(num-i) == true)) {
				arr[0] = i;
				arr[1] = num-i;
				track = true;
			}
		    
			i++;
		}
			
	System.out.println(arr[0] + "  " + arr[1]);
		
		return arr;
	}

	private static boolean checkZero(int chk) {
		// TODO Auto-generated method stub
		
		while(chk > 9) {
			if(chk % 10 == 0) {
				return false;
			}
			chk=chk/10;
		}
		
		return true;
	}

}
