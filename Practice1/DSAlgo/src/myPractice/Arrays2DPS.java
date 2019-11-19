package myPractice;
import ArraysImplementation.Arrays2DImplement;
import Implementation.LinkedListsImplementation;

public class Arrays2DPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2,3,4},
					   {5,6,7,8},
					   {9,10,11,12},
					   {13,14,15,16}};
		
		 Arrays2DImplement arr2D = new Arrays2DImplement();
		arr2D.printArray(arr);
		arr2D.spiralMat(arr);
		arr2D.addMat(arr,arr);
		arr2D.printDiag(arr);
		arr2D.transposeMat(arr);
	}

}
