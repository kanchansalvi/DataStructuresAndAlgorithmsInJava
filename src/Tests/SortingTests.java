package Tests;

public class SortingTests {

//	public static int[] arr = {30,1, 28, 45,2,1};
	public static int[] arr = {1,1};
	
	public static void main(String[] args) {
	
		//selectionSort();
		insertionSort();
		
		for(int i = 0; i<arr.length; i++) 
			System.out.print(arr[i] + " ");
	}
	
/******* Selection Sort *******************************************************/
	public static void selectionSort() {
		int temp = 0;
		int min = 0;
		
		for(int i =0; i < arr.length; i++) {
			min = getMin(i);
			if(arr[min] < arr[i]) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
public static int getMin(int start) {
	int myMinIndex = start;
	
	for (int i = start+1; i<arr.length; i++) {
		if(arr[i] < arr[myMinIndex]) {
			myMinIndex = i;
		}
	}
	return myMinIndex;
}
/******************************************************************************/

/************* Insertion Sort **********************************************/

private static void insertionSort() {

		for(int i=1; i<arr.length; i++) {
			if(arr[i-1] > arr[i]) {
				swapElements(i);
				//insertElement();
			}
		}
}

private static void insertElement() {
	// TODO Auto-generated method stub
	
}

private static void swapElements(int i) {
	int temp ;
	for(int j=i; j>0; j--) {
		if(arr[j-1] > arr[j]) {
			temp = arr[j-1];
			arr[j-1] = arr[j];
			arr[j] = temp;
		}
	}

}
}
