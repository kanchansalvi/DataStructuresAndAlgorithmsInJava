package myPractice;

import ArraysImplementation.ArraysImplement;
public class ArraysPS {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arri[] = {1,2,3,5,4,6,7,9};
		char arrc[] = {'A','B', 'C','D','E','F'};
		String arrs[] = {"Mumbai", "Pune", "Noida","Delhi", "Ooty" };
		
		ArraysImplement impl = new ArraysImplement();
		impl.printIntArr(arri);
		
		System.out.println("\n\nPrinting Character Array");
		for(int i=0; i<arrc.length; i++) {
			System.out.print("   arrc[" +i+ "]=" +arrc[i]);
		}
		
		System.out.println("\n\nPrinting String Array");
		for(int i=0; i<arrs.length; i++) {
			System.out.print("   arrs[" +i+ "]=" +arrs[i]);
		}
		
		System.out.println("Printing Integer Array in Reverse");
		impl.reverseArray(arri);
		
		System.out.println("Sum of all pairs in an array");
		impl.arrayPairSum(arri);
		
		System.out.println("Mid of an array");
		impl.arrMid(arri);
		
		boolean sort = impl.isArraySorted(arri);
		System.out.println("Is the array Sorted ? " + sort);
		
		System.out.println("Find he missing number in an array");
		impl.missingNum(arri);
		
		System.out.println("Sorted an array in ascending order");
		impl.arraySortAsc(arri);
		
		System.out.println("Sorted an array in descending order");
		impl.arraySortDesc(arri);
	}

}
