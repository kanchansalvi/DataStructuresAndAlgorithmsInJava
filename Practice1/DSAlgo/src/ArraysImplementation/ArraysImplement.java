package ArraysImplementation;

public class ArraysImplement {
	
public void printIntArr(int arr[]){
	System.out.println("Printing Integer Array");
	for(int i=0; i<arr.length; i++) {
		System.out.print("   arr[" +i+ "]=" +arr[i]);
	}
}
	public void reverseArray(int arr[]) {
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
//Sum of all pairs in an array
public void arrayPairSum(int arr[]) {
	
	if(arr == null) { return;}
	
	if(arr.length == 0) { return; }
	
	for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		System.out.println("Sum("+arr[i]+","+arr[j]+") = " + (arr[i]+arr[j]));
		}
	}
}

//Find middle element of an array
public void arrMid(int arr[]) {
	
	if(arr == null) { return;}
	
	if(arr.length == 0) { return; }
	
	System.out.println("Mid of an array" + arr[(int) Math.floor(arr.length/2)]);
}

//Check if array is sorted
public boolean isArraySorted(int arr[]) {
	if(arr == null) { return false;}
	
	if(arr.length == 0) { return false; }

	if(isAsc(arr) || isDesc(arr)) {
	return true;
	}
	
	return false;
}
public boolean isAsc(int arr[]) {
	
	for(int i=0; i<arr.length-1; i++) {
		if(arr[i] > arr[i+1]) {
			return false;
		}
	}
	return true;
}

public boolean isDesc(int arr[]) {
	
	for(int i=0; i<arr.length-1; i++) {
		if(arr[i] < arr[i+1]) {
			return false;
		}
	}
	return true;
}

public void missingNum(int arr[]) {
	
	if(arr == null) { return;}
	
	if(arr.length == 0) { return; }
	
	for(int i=1; i<arr.length; i++) {
		if(arr[i] != (arr[i-1]+1)) {
			System.out.println("Missing no: " + (arr[i-1]+1));
		}
	}
}

// Sorting an array in asc order
public void arraySortAsc(int arr[]){
	
	if(arr == null) { return;}
	
	if(arr.length == 0) { return; }
	
	for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1;j<arr.length; j++) {
			
			if(arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	printIntArr(arr);
}

//Sorting an array in desc order
public void arraySortDesc(int arr[]){
	
	if(arr == null) { return;}
	
	if(arr.length == 0) { return; }
	
	for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1;j<arr.length; j++) {
			
			if(arr[i] < arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	printIntArr(arr);
}
}
