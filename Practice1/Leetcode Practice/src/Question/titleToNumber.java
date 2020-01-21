/*Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
Example 1:

Input: "A"
Output: 1
Example 2:

Input: "AB"
Output: 28
Example 3:

Input: "ZY"
Output: 701
*/



package Question;

import java.util.HashMap;

public class titleToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getNumber("ZZ");

	}

	private static int getNumber(String str) {
		// TODO Auto-generated method stub
		int sum=0, pos=1;
		
		HashMap<Character,Integer> cMap = new HashMap<>();
		
		for(char c='A'; c<='Z'; c++) {
			cMap.put(c,pos);
			pos++;
		}
		pos=0;
		for(int i=str.length()-1; i>=0; i--) {
			
			sum += cMap.get(str.charAt(i))*Math.pow(26,pos);
			pos++;
			
		}
		
		System.out.println("Sum = " + sum);
		return sum;
	}

}
