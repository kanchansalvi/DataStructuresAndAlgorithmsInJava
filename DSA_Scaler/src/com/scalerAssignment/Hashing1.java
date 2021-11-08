/**
 * 
 */
package com.scalerAssignment;


import java.util.HashMap;
import java.util.HashSet;

/**
 * @author kanchan
 * Q1. Shaggy and distances
 *Problem Description

Shaggy has an array A consisting of N elements. 
We call a pair of distinct indices in that array as a special pair if elements at that index in the array are equal.
Shaggy wants you to find a special pair such that distance between that pair is minimum. 
Distance between two indices is defined as |i-j|. If there is no special pair in the array then return -1.
 
 *Example Input
Input 1:

A = [7, 1, 3, 4, 1, 7]
Input 2:

A = [1, 1]


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

Here we have 2 options:
1. A[1] and A[4] are both 1 so (1,4) is a special pair and |1-4|=3.
2. A[0] and A[5] are both 7 so (0,5) is a special pair and |0-5|=5.
Therefore the minimum possible distance is 3. 
Explanation 2:

Only possibility is choosing A[1] and A[2].
 *
 */
public class Hashing1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {7, 1, 3, 4, 1, 7};
        int ans=Q1(arr);
        System.out.println(ans);
        int[] arr2 = {4,2,6,-4,-2, -6,2,4};
         ans = Q2(arr2);
        System.out.println(ans);
	}
	
public static int Q1(int[] A) {
        
        HashMap<Integer, Integer> hs = new HashMap<>();
        int sum=0, prevSum=Integer.MAX_VALUE;
        
        for(int i=0; i<A.length; i++){
            if(hs.containsKey(A[i])){
                sum = i-(hs.get(A[i]));
                if(prevSum>sum){ prevSum = sum;}
            }
            else{
                hs.put(A[i], i);
                sum=0;
            }
        }
        
        return prevSum==Integer.MAX_VALUE?-1:prevSum;
    }


/*
 * Q2. Sub-array with 0 sum
 * Problem Description

Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1 else return 0.



Problem Constraints
1 <= |A| <= 100000

-10^9 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return whether the given array contains a subarray with a sum equal to 0.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [-1, 1]


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No subarray has sum 0.
Explanation 2:

 The array has sum 0.

 * 
 */
public static int Q2(int[] A) {
    HashSet<Integer> hs = new HashSet<>();
    hs.add(0);
    int sum=0;
    
    for(int i=0;i<A.length; i++){
        sum+=A[i];
        if(hs.contains(sum)) return 1;
        else 
          hs.add(sum);
    }
    
    return 0;
}

}

