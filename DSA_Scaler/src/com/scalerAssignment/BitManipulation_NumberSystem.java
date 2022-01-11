package com.scalerAssignment;

import java.util.Arrays;

public class BitManipulation_NumberSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("sum=" +addBinary("11", "101"));
		System.out.println("set bits in binary representation=" +solve(5));
		System.out.println("Set bits in a no.="+numSetBits(11));
		int[] num={3,3,4,4,5,1,5,6,7,8,8,7};
		System.out.println("Single number=" + singleNumber(num));
		

	}
	
/* Add binary Strings
 * Given two binary strings, return their sum (also a binary string).
 * a = "100" b = "11"  Return a + b = "111".
 */
public static String addBinary(String A, String B) {
        
        StringBuilder result = new StringBuilder();
		int i = A.length() - 1, j = B.length() - 1, carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (j >= 0)
				sum += B.charAt(j--) - '0';
			if (i >= 0)
				sum += A.charAt(i--) - '0';
			result.append(sum % 2);
			carry = sum / 2;
		}
		if (carry != 0)
			result.append(carry);
		return result.reverse().toString();
		
    }
/* Count Total Set Bits
 * Given a positive integer A, the task is to count the total number of set bits in the binary representation of all the numbers from 1 to A.
 * A = 3 O/p = 4
 */
public static int solve(int A) {
    
    int two = 2,ans = 0;
    int n = A;
 while(n != 0)
 {
     ans += (A / two)*(two >> 1);
     if((A&(two - 1)) > (two >> 1) - 1)
         ans += (A&(two - 1)) - (two >> 1) + 1;
     two <<= 1;
     n >>= 1;
 }
 return ans%1000000007;
//A simple solution , using the fact that for the ith least significant bit, answer will be  
//(N/2^i)*2^(i-1)+ X
//where
//X = N%(2^i)-(2^(i-1)-1)
//iff
//N%(2^i)>=(2^(i-1)-1)
 }

/* Single Number
 * Given an array of integers A, every element appears twice except for one. Find that single one.
 */
public static int singleNumber(final int[] A) {
    Arrays.sort(A);
    int i=0;
    for(i=0;i<A.length-1; i++){
        if( (A[i] ^ A[i+1]) != 0) return A[i];
        else i++;
    }
    
    return A[i];
    // XOR operation
}

/* Number of 1 Bits
 * Write a function that takes an integer and returns the number of 1 bits it has.
 */
public static int numSetBits(long A) {
    int total_ones = 0;
    while (A != 0) {
        A = A & (A - 1);
        total_ones++;
    }
    return total_ones;
}
}



