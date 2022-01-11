package com.scalerAssignment;

import java.util.HashSet;

public class MoreProbHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A={3,3,4,4,5,1,5,6,7,8,8,7};
		System.out.println("Subarray with given sum : "); print1D(subarray(A,8) );
		System.out.println("Sub-array with 0 sum : " +subArrayWith0Sum(A) );
		System.out.println("Equal : ");
	}

/*
 * Subarray with given sum
 * Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
If the answer does not exist return an array with a single element "-1".
First sub-array means the sub-array for which starting index in minimum.
 */
public static int[] subarray(int[] a, int B) {
	int[] result=null ;
    int start=0;
    int i=0;
    int sum=0;
    
    while(i<a.length){
        sum = sum + a[i];
        if(sum>B){
            while(sum>B){
                sum = sum-a[start];
                start++;
            }
        }
        
        if(sum == B){
            result = new int[i-start+1];
            for(int j=0; j<result.length; j++){
                result[j]=a[start];
                start++;
            }
            break;
        } 
        
        i++;
    }
    
    if(result==null){
        result = new int[1];
        result[0]=-1;
    }
    return result;   
}

/*
 * Sub-array with 0 sum
 * Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
If the given array contains a sub-array with sum zero return 1 else return 0.
 */
public static int subArrayWith0Sum(int[] A) {
    
    int sum=A[0];
     HashSet<Integer> hs = new HashSet<>();
     
     hs.add(0); hs.add(A[0]);
     
     for(int i=1; i<A.length; i++){
       sum +=A[i];
       
       if(hs.contains(sum)) return 1;
       else hs.add(sum);
     }
     return 0;
 }

/*Equal
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
