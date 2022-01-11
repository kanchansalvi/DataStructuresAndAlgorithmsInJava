package com.scalerAssignment;

public class SortingIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {0, 1, 2, 0, 1, 2};
		System.out.println("Sort by Color : "); print1D(sortColors(A));
		System.out.println(" : " +kthsmallest(A, 2) );
		System.out.println("Noble Integer : ");
		System.out.println("Arithmetic Progression? : ");
		System.out.println("Stepwise Selection Sort! : ");
	}
/*
 * Sort by Color
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
public static int[] sortColors(int[] A) {
        
        int red=0, white=0, blue=0;
        
        for(int i=0; i<A.length; i++){
            
            if(A[i] == 0) red++;
            else if(A[i] == 1) white++;
            else blue++;   
        }
        for(int i=0; i<A.length; i++){
            if(red > 0){
                A[i] = 0; red--;
            }
            else if(white > 0){
                A[i] = 1; white--;
            }
            else A[i] = 2;
        }
       
       return A; 
    }

/*
 * Kth Smallest Element
 * Find the Bth smallest element in given array A .
NOTE: Users should try to solve it in <= B swaps.
 */
public static int kthsmallest(final int[] A, int B) {
for (int i = 0; i < B; i++) {
    int minn = Integer.MAX_VALUE, idx = 0;
    for (int j = i; j < A.length; j++) {
        if (A[j] < minn) {
            minn = A[j];
            idx = j;
        }
    }
    int tmp = A[i];
    A[i] = A[idx];
    A[idx] = tmp;
}
return A[B - 1];
}

/*
 * Noble Integer
 * Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p.
 */


/*
 * Arithmetic Progression?
 * Given an integer array A of size N. Return 1 if the array can be rearranged to form an arithmetic progression, otherwise, return 0.
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 */

/*
 * Stepwise Selection Sort!
 * Given an integer array A of size N.
You need to sort the elements in increasing order using SelectionSort. Return a array containing the min value's index position before every iteration.
NOTE:
Consider 0 based indexing while looking for min value in each step of selection sort.
There will be total N - 1 iterations in selection sort so the output array will contain N - 1 integers.
 */

//Print 1D Array
public static void print1D(int[] js) {
	
	for(int i=0; i<js.length; i++) {
		System.out.print(js[i]+" ");
	}
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
