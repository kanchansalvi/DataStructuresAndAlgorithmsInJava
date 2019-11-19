package ArraysImplementation;

public class Arrays2DImplement {
	
//Printing an array
public void printArray(int arr[][]){
	
	System.out.println("Printing Array row wise:");
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[0].length; j++) {
			System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
		}
	}
	
	System.out.println("Printing Array column wise:");
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[0].length; j++) {
			System.out.println("arr["+j+"]["+i+"]="+arr[j][i]);
		}
	}
}

//Addition of two matrices
public void addMat(int arr1[][], int arr2[][]) {
	
	if((arr1.length != arr2.length) || (arr1[0].length != arr2[0].length)) {
		return;
	}
	
	int addMat[][] = new int[arr1.length][arr1[0].length];
	for(int i=0; i<arr1.length; i++) {
		for(int j=0; j<arr1[0].length; j++) {
			addMat[i][j] = arr1[i][j] + arr2[i][j];
			System.out.println("addMat["+j+"]["+i+"]="+ addMat[i][j]);
		}
	}
}

//Print Diagonal elements of an array
public void printDiag(int arr[][]) {
	
	if(arr.length != arr[0].length) return;
	
	int arrSize = arr.length-1;
	for(int i=0;i<arr.length; i++) {
		System.out.println("arr["+i+"]["+i+"]="+arr[i][i]);
	}
	for(int i=arrSize; i>=0; i--) {
		System.out.println("arr["+i+"]["+(arrSize-i)+"]="+arr[i][arrSize-i]);
	}
	
}

//Print transpose of a matrix
public void transposeMat(int arr[][]) {
	int transMat[][] = new int[arr[0].length][arr.length];
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[0].length; j++) {
			transMat[i][j] = arr[j][i];
			System.out.println("transMat["+i+"]["+j+"]="+ transMat[i][j]);
		}
	}
	
}
	
//Print the square 2D Matrix in spiral manner
	
	public void spiralMat(int arr1[][]) {
		
//		int arr[][] = {{1,2,3,4},
//				   {5,6,7,8},
//				   {9,10,11,12},
//				   {13,14,15,16}};
//		int arr[][] = {{1,2,3},
//				       {5,6,7},
//				       {9,10,11}};
		int arr[][] = {{1}};
		
		int spiral=arr.length-1;
		int arrSize=arr.length-1;
		
		if(arr.length != arr[0].length) return;
		if(arr.length == 1) 
			System.out.println("arr[0][0] = " + arr[0][0]);
		
		
	 while((spiral+1) >= Math.ceil(arr.length/2)){
//			For top row
		for(int i=arrSize - spiral; i<spiral; i++) {
			System.out.println("top: arr["+ (arrSize-spiral) + "][" + i +"]=" + arr[arrSize-spiral][i]);
		}
//		For right column
		for(int i=arrSize - spiral; i<spiral; i++) {
			System.out.println("right: arr["+ (spiral) + "][" + i +"]=" + arr[i][spiral]);
		}
//		For bottom row
		for(int i=spiral; i>arrSize-spiral; i--) {
			System.out.println("bottom: arr["+ (spiral) + "][" + i +"]=" + arr[spiral][i]);
		}
//		For left column
		for(int i=spiral; i>arrSize-spiral; i--) {
			System.out.println("left: arr["+ (i) + "][" + spiral +"]=" + arr[i][arrSize-spiral]);
		}
		spiral--;
	
		}
		
	}
 
}
