package com.scalerAssignment;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nSpiral Order Matrix II");
		print2D(generateMatrix(3));
		
		int[][] A = generateMatrix(3);
		System.out.println("\nRotate Matrix"); 
		rotateMatrix(A); print2D(A);
		
		System.out.println("\nAnti Diagonals ");
		print2D(diagonal(A));
		
		System.out.println("\nPascal Triangle");
		print2D(pascal(10));
		
		System.out.println("\nRow with maximum number of ones=" +max1(A));
		
		System.out.println("\nSearch in a row wise and column wise sorted matrix=" +rowColSearch(A,5));
		
	}

/*
 * Spiral Order Matrix II
 * Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.
 */
	public static int[][] generateMatrix(int A) {
        
	    int[][] ret = new int[A][A];
		int left = 0,top = 0;
		int right = A -1,down = A - 1;
		int count = 1;
		
		while (left <= right) {
			for (int j = left; j <= right; j ++) {
				ret[top][j] = count++;
			}
			top ++;
			for (int i = top; i <= down; i ++) {
				ret[i][right] = count ++;
			}
			right --;
			for (int j = right; j >= left; j --) {
				ret[down][j] = count ++;
			}
			down --;
			for (int i = down; i >= top; i --) {
				ret[i][left] = count ++;
			}
			left ++;
		}
		return ret;
	 }
	
/*
 * Rotate Matrix
 * You are given a n x n 2D matrix A representing an image.
Rotate the image by 90 degrees (clockwise).
You need to do this in place.
 */
public static void rotateMatrix(int[][] A) {
        
        int len=A.length-1;
        
        for(int i=0; i<=len/2; i++){
            
            int j=i;
            
            while(j < len-(i) ){
            int pos1=A[i][j], pos2=A[j][len-i],pos3=A[len-i][len-j], pos4=A[len-j][i];
            
            A[j][len-i] = pos1; 
            A[len-i][len-j] = pos2;
            A[len-j][i] = pos3;
            A[i][j] = pos4;
            j++;
            }
        }
    }
	
/*
 *  Anti Diagonals
 *  Give a N * N square matrix A, return an array of its anti-diagonals.
 */
public static int[][] diagonal(int[][] A) {
    
    int diaglen = (A.length*2) - 1;
    int diag[][] = new int[diaglen][A.length];
    int cnt=0, step=A.length-1;
    
    for(int i=0; i<A.length; i++){
        cnt=i;
        for(int j=0; j<=step;j++){
            
            diag[cnt][i] = A[i][j];
            cnt++;
            
            if(j==step){
                for(int k=i+1; k<A.length; k++){
                    
                    diag[cnt][i] = A[k][j];
                    cnt++;
                   
                }
            }
            
        }
        step--;
    }
 
    return diag;
}
	
/*
 * Pascal Triangle
 */
public static int[][] pascal(int A) {
    int[][] sol = new int[A][A];
    
    if(A==0) return sol;

    sol[0][0] = 1;
    
    if(A >1){
       sol[1][0] =1; sol[1][1]=1;

        for(int i=2; i<A; i++){
            sol[i][0] = 1;
            for(int j=1; j<A; j++){
                
                sol[i][j] = sol[i-1][j-1] + sol[i-1][j];
                
            }
        }
    }
    
    return sol;
}

/*
 * Row with maximum number of ones
 * Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.

NOTE:

If two rows have the maximum number of 1 then return the row which has a lower index.
Rows are numbered from top to bottom and columns are numbered from left to right.
Assume 0-based indexing.
Assume each row to be sorted by values.
Expected time complexity is O(rows).
 */
public static int max1(int[][] A) {
    
	 int sum, rowsum=0, rowno=0;
     
     for(int i=0; i<A.length; i++){
         sum=0;
         for(int j=0; j<A[0].length; j++){
             if(A[i][j] == 1) sum++;
         }
         
         if(sum > rowsum){
             rowsum=sum;
             rowno = i;
         }
	 }
	 return rowno;
}


/*
 * Search in a row wise and column wise sorted matrix
 * Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in increasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
 */

public static int rowColSearch(int[][] A, int B) {
    
    for(int i=0; i<A.length; i++){
        for(int j=0; j<A[0].length; j++){
            if(A[i][j] == B) return (i+1)*1009 +(j+1);
        }
    }
    return -1;
}



//Print 1D Array
public static void print1D(String[] strings) {
	
	for(int i=0; i<strings.length; i++) {
		System.out.print(strings[i]+" ");
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
