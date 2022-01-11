package com.scalerAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IntroToHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A={3,3,4,4,5,1,5,6,7,8,8,7};
		System.out.println("2 Sum : "); print1D(twoSum(A , 8) );
		System.out.println("Common Elements : "); print1D(commonElements(A,A) );
		System.out.println("Pairs With Given Xor  : " +pairXOR(A,6));
		System.out.println("Permutations of A in B  : " +permOfAinB("abc", "abcbacabc") );
		System.out.println("Valid Sudoku  : " );
	}
	
/*
 * 2 Sum
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 */

public static int[] twoSum(final int[] A, int B) {
    
    HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
    int sol[] = {0,0};
   
   for(int i=0; i<A.length; i++){
       
       if(!set.containsKey(A[i])) set.put(A[i],i);
       if(set.containsKey(B-A[i]) && i != set.get(B-A[i])){
           sol[0] = set.get(B-A[i])+1; sol[1]=i+1;
           return sol;
       }
       
   }
   
   //if(sol[0] == 0 && sol[1] == 0) return null;
       
       return new int[0];
   }
/*
 * Common Elements
 * Given two integer array A and B of size N and M respectively. 
 * Your task is to find all the common elements in both the array.
 */
public static int[] commonElements(int[] A, int[] B) {
    
    HashMap<Integer, Integer> mapA  = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> mapB  = new HashMap<Integer, Integer>();
    
    for(int i=0; i<A.length; i++){
        
        if(mapA.containsKey(A[i])){
            mapA.replace(A[i], mapA.get(A[i])+1 );
        }
        else{
            mapA.put(A[i], 1);
        }
        
    }
    //System.out.println(mapA);
    
    for(int i=0; i<B.length; i++){
        
        if(mapB.containsKey(B[i])){
            mapB.put(B[i], mapB.get(B[i])+1 );
        }
        else{
            mapB.put(B[i], 1);
        }
       
    }
     //System.out.println(mapB);
    
    int cnt = 0;
    ArrayList<Integer> sol = new ArrayList<>();
    
     for(Map.Entry m : mapA.entrySet()){    
         
         if(mapB.containsKey(m.getKey())) {
             
            int fre = Math.min((int)m.getValue(), mapB.get(m.getKey()));
             //System.out.println("Key="+m.getKey()+" Value="+(int)m.getValue()+" Freq="+fre);
             
             for(int j=0; j<fre; j++){
                 
                sol.add((int) m.getKey());
             }
           
        }

    }
     int[] arr = sol.stream().mapToInt(i -> i).toArray();
    return arr;  
}
/*
 * Pairs With Given Xor
 * Find the number of unique pairs of integers in the array whose XOR is equal to B.
 */
public static int pairXOR(int[] A, int B) {
    
    HashSet<Integer> map = new HashSet<>();
    int count=0;
    for(int i=0; i<A.length; i++){
        if(map.contains(A[i]^B)){
            count++;
        }
        map.add(A[i]);
    }
    
    return count;
}

/*
 * Permutations of A in B
 * You are given two strings A and B of size N and M respectively.
You have to find the count of all permutations of A present in B as a substring. 
You can assume a string will have only lowercase letters.
 */
public static int permOfAinB(String A, String B) {
    int n = A.length();
   int m = B.length();
   int hash1[] = new int[26];
   int hash2[] = new int[26];
   int count = 0;
   // count frequency of each char in A 
   for (int i = 0; i < n; i += 1) {
       hash1[A.charAt(i) - 'a'] += 1;
   }
   // count frequency of each char in first window of size n in G
   for (int i = 0; i < n; i += 1) {
       hash2[B.charAt(i) - 'a'] += 1;
   }
   count += same(hash1, hash2);
   // move current window 1 step ahead
   for (int i = n, j = 0; i < m; i += 1, j += 1) {
       hash2[B.charAt(j) - 'a'] -= 1;
       hash2[B.charAt(i) - 'a'] += 1;
       count += same(hash1, hash2);
   }
   return count;
}

public static int same(int[] hash1, int[] hash2) {
   for (int i = 0; i < 26; i += 1) {
       if (hash1[i] != hash2[i])
           return 0; // not a permutation of A
   }
   return 1; // got a permutation of A in G
}

/*
 * Valid Sudoku
 * Given SUDOKU
 * 	  ["53..7....", 
	 * "6..195...", 
	 * ".98....6.", 
	 * "8...6...3", 
	 * "4..8.3..1", 
	 * "7...2...6", 
	 * ".6....28.", 
	 * "...419..5", 
	 * "....8..79"]
 * 
 */


//Print 1D Array
public static void print1D(int[] js) {
	
	for(int i=0; i<js.length; i++) {
		System.out.print(js[i]+" ");
	}
	System.out.println();
}

//Print 2D Array
public static void print2D(int[][] arr) {
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[0].length; j++) {
		System.out.print(arr[i][j]+" ");
		}
		System.out.print("\n");
	}
}
}
