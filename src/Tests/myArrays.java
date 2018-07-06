package Tests;

import Implementation.MyArrays;

/*Find middle of array section given the the start and end of the section
 */

public class myArrays {
	
	
	static int sum = 0;
	static int i = 0;

	public static void main(String[] args) {
		
		 Integer arr[] = {1,2,3,4,5,6};
		MyArrays<Integer> myArr= new MyArrays<Integer>(arr);
		
		

/********** Print size of an array ****************/
		myArr.size() ;
		
		try {
/************ 7. Find middle of array section 
 *     given the the start and end of the section
 ****************************************************************/
			myArr.arraymid(0,1);
			
/************ 16. Print Sum of n array using recursion *********************/
		myArr.arrRecSum();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
/********* 18. Find the smallest and second smallest elements in an array****/
		myArr.smallSecSmall();
		
/************ 19. Find the minimum element in a sorted and rotated array. *********/
		myArr.minSortRot();
		
/************* 20. Find a missing element in the sorted array such that 
 * 		all the elements in array are consecutive.
 *  	In O(logn) complexity.********
 * E.g. arr = {4,5,6,7,9,10} // here missing is 8
 *************************************************************************/	
		myArr.missElement() ;
 		
/*21. Find the first occurrence of an element in the sorted array. 
 * Return index of first occurrence. O(logn) solution
*/
		myArr.firstOccur(6);
/*************************************************************************/
/***  22. Divide the array given a pivot element
arr={1,3,5,2,10} pivot=4 so output arr = {1,3,2,4,5,10}
Basically on left of 4 there are small numbers 
and on right there are larger numbers than 4
*/
		myArr.pivotDivide(4);

	
/*************************************************************************/
/***** 23.Given two sorted arrays, find the no. of elements in common 
	  Eg. A: 13 27 35 40 49 55 59
	      B: 17 35 39 40 55 58 60
	   O/P : 35 40 55
**************************************************************************/
	
	Integer arr1[] = {13, 27, 35, 40, 49, 55, 59};
	//MyArrays<Integer> myArr1= new MyArrays<Integer>(arr1);
	
	Integer arr2[] = {17, 35, 39, 40, 55, 58, 60};
	//MyArrays<Integer> myArr2= new MyArrays<Integer>(arr2);
	
	System.out.println("\n***** Given two sorted arrays, find the no. of elements in common ");
	myArr.commomElements(arr1, arr2);
	
	}
}




