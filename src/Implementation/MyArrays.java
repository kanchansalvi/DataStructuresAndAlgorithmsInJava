package Implementation;

public class MyArrays<T>{
	
	public Integer arr[];
	public static final boolean DEBUG = true;

	public MyArrays(Integer[] arr2) {
		this.arr = arr2;
	}
	
	
	public int size() {
		if(DEBUG) System.out.println("Length of an array = " + arr.length);
		return arr.length;
	}
	
/************ 7. Find middle of array section 
 *     given the the start and end of the section
 ****************************************************************/
	public int arraymid(int start, int end) {
		int mid =-1;
		if(start<=end) {
			mid = ((end-start)/2)+start;
			if(DEBUG) System.out.println("Mid of an array = " + arr[mid]);
		}
		return mid;
	}

/************  Print Sum of n array using recursion *********************/
	public int arrRecSum() {
		return arrSumHelper(0, 0);
	}

	private int arrSumHelper(int i, int sum) {
		if(i == arr.length) {
			return sum;
		}
		sum += (Integer) arr[i] + arrSumHelper(i+1,sum);
		if(DEBUG) System.out.println("Array Sum by recrsive method : "+sum);
		return sum;
	}
/******* 18. Find the smallest and second smallest elements in an array****/
	public void smallSecSmall() {

		int small;
		int secsmall;
	 
		if((Integer)arr[0] < (Integer)arr[1]) {	
			small = (Integer)arr[0];
			secsmall = (Integer)arr[1];
		} else {
			small = (Integer)arr[1];
			secsmall = (Integer)arr[0];
		}
		
		for(int i=2; i<arr.length; i++) {
			
			if((Integer)arr[i] < small) {
				secsmall = small;
				small = (Integer)arr[i];
			}
			if((Integer)arr[i] > small && (Integer)arr[i] < secsmall) {
				secsmall = (Integer)arr[i];
			}
		}
			System.out.println("***********Smallest and second smallest elements in an array****");
			System.out.println("Smallest : " + small + " \nSecond smallest = :" + secsmall);
	 
	}

/*********** 19. Find the minimum element in a sorted and rotated array. *********/
	public int minSortRot() {
		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if((Integer)arr[i] < min) {
				min = arr[i];
			}
		}
		
		if(DEBUG) System.out.println("***********Minimum element in a sorted and rotated array****");
		if(DEBUG) System.out.println("Minimum : " +min);
		return min;
	}

/************* 20. Find a missing element in the sorted array such that 
 * 		all the elements in array are consecutive.
 *  	In O(logn) complexity.********
 * E.g. arr = {4,5,6,7,9,10} // here missing is 8
 * 
 *  Since the array is sorted start traversing the array under given cases:
 * case 1: Elements are sorted in ASC Order
 * 		Go to the mid of Array
 * 			if value at mid = required value then continue traversing to Right side of the mid
 *    		Else traverse to Left side of mid.
 *case 2: Elements are sorted in DESC Order
 * 		Go to the mid of Array
 * 			if value at mid > required value then continue traversing to Left side of the mid
 *    		Else traverse to Right side of mid.
 *Continue traversing until the Element is found
 *************************************************************************/
	public int missElement() {
		
		int firstElement = (Integer) arr[0];
		int pos = (arr.length-1) / 2, mypos = 0;
		int arrStart = 0;
		int last = arr.length;
		int n = pos+1;
		
		if(arr[arr.length-1] != (arr.length-1 + firstElement)){
			
//			while(pos != firstElement) {
			for(int i=0; i<arr.length-1/2; i++) {
				n=(n+1)/2;
				if(((pos+firstElement) == arr[pos] && arr[arrStart] < arr[last-1]) ||
					(firstElement-pos) == arr[pos] && arr[arrStart] > arr[last-1]){  //  Goto Right
					arrStart = pos; 
					mypos = pos; System.out.println("Sort mypos =  " + mypos);  
					pos = pos  + n;
			    
				}	else if(((pos+firstElement) !=  arr[pos] && arr[arrStart] < arr[last-1]) ||
						(firstElement-pos) !=  arr[pos] && arr[arrStart] > arr[last-1]){ //Goto Left
					last = pos;
					pos = pos - n; 
				}
			}
			if(arr[0] < arr[arr.length-1]) {
				if(DEBUG) System.out.println("Missing Element value for ASC is : " + (arr[mypos] + firstElement));
			return (arr[mypos] + firstElement);
			} else {
				if(DEBUG) System.out.println("Missing Element value for DESC is : " + (arr[mypos] -(pos) +1));
			return (arr[mypos] -(pos) +1);
			}
		} else {
			System.out.println("No element is missing ");
			return -1;
		}

	}

/********* Missing element only in Ascending sorted areay **************/

private void missElement1() {
	
	int firstElement = arr[0];
	int arrSize = arr.length;
	
	//if no missing element return
	if (arr[arrSize-1] == (firstElement + arrSize-1)) {
		System.out.println("No element is missing ");
		return;
	}

	int start = 0;
	int end = arr.length-1;
	int mymiss= 200;
	boolean asc = false;
	 
	if (arr[0] < arr[arr.length-1]) {
		 asc= true;
	}
	
	while (start<=end) {
		int mid = start+ (end-start)/2;		
		int requiredElement = arr[0]+ mid;
		System.out.println("while Start End mid Req: "+ start+end+mid+requiredElement);
		
		if(requiredElement == arr[mid]){
			//move right
			start = mid+1;
			if(DEBUG) System.out.println(" Start End mid Req: "+ start+end+mid+requiredElement);
		} else {
			end = mid-1;
			mymiss = mid;
			if(DEBUG) System.out.println(" Else    Start End mid Req: "+ start+end+mid+requiredElement);
		}		
	}
	System.out.println(" Missing found at : "+ (mymiss+arr[0]));
}

/*********** 21. Find the first occurrence of an element in the sorted array. 
* Return index of first occurrence. O(logn) solution
* 
* Since the array is sorted start traversing the array under given cases:
* case 1: Elements are sorted in ASC Order
* 		Go to the mid of Array
* 			if value at mid < element then continue traversing to Left side of the mid
*    		Else traverse to right side of mid.
*case 2: Elements are sorted in DESC Order
* 		Go to the mid of Array
* 			if value at mid < element then continue traversing to Right side of the mid
*    		Else traverse to Left side of mid.
*Continue traversing until the Element is found
*    	
*/

public int firstOccur(int element) {
	
	int pos = (arr.length-1) / 2, mypos = 0;
	int first = 0;
	int last = arr.length;
	int n = pos+1;
	
		for(int i=0; i<arr.length-1; i++) {
			n=(n+1)/2;
			if((arr[pos] < element && first <= last) ||   //For ASC sorted Elements
					(arr[pos] > element && first >= last)){  //  Goto Right
				first = pos;  
				pos = pos  + n;
		    
			}	else if((arr[pos] > element && first <= last)||
					(arr[pos] < element && first >= last)){ //Goto Left
				last = pos;
				pos = pos - n; 
			}
			else if(arr[pos] == element) {
				mypos = pos;
			}
		}
		if(DEBUG) System.out.println("Element Found at position: : " + mypos);
	 return mypos;
	}

/***  22. Divide the array given a pivot element **********************************************************
arr={1,3,5,2,10} pivot=4 so output arr = {1,3,2,4,5,10}
Basically on left of 4 there are small numbers 
and on right there are larger numbers than 4
*
*
*Create a new array with length of (given array + 1)
*Insert the given pivotElement in the new array
*Start traversing the given array and do the following for all elements in array:
*	If element in array <= pivotElement then place element to left of pivotElement
*   If element in array > pivotElement then place the element to right of pivotElement's next available place in new Array
***************************************************************************************************************************/
	public void pivotDivide(int pivotElement) {

	int newarr[] = new int[arr.length + 1];
	newarr[0] = pivotElement;
	int elepos = 0;
	int temp;
	int newtemp;
	
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > pivotElement) {  // Place at Right of pivotElement
				for(int j=0; j<newarr.length; j++)
				  if(newarr[j] == 0) {
					  newarr[j] = arr[i];    //Available place for element to right
					  break;
				  }
				
			} 
		if(arr[i] <= pivotElement) { //Place the element to left of pivotElement
			//Shift Array elements to right
			newarr[elepos] = arr[i];
			 temp = pivotElement;
			
				for(int j=elepos+1; j<=newarr.length-1; j++) {
					 newtemp = newarr[j];
					newarr[j] = temp;
					temp = newtemp;
				}
				elepos++;
				}
			}
		

		for(int ii=0; ii<newarr.length; ii++) {
			System.out.println(" newarr["+ii+"] = " + newarr[ii] );
		}

 }
/***** 23.Given two sorted arrays, find the no. of elements in common 
	  Eg. A: 13 27 35 40 49 55 59
	      B: 17 35 39 40 55 58 60
	   O/P : 35 40 55
*/
public void commomElements(Integer arr1[], Integer arr2[]) {

	int start = 0;
	for(int i=0; i<arr1.length; i++) {
		for(int j=start; arr2[j] <= arr1[i]; j++) {
			if(arr2[j] == arr1[i]) {
				System.out.println(" Match found for "+arr1[i] +" at position "+j);
				start=j;
			}
		}
	}

}
}
