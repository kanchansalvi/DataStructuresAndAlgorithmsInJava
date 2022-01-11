package com.scalerAssignment;

public class ArrayProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A={3,3,4,4,5,1,5,6,7,8,8,7};
		
		System.out.println(" Special Subsequences \"AG\": " +subsequenceAG("ABCGAG") );
		System.out.println("Closest MinMax : " +MinMax(A) );
		System.out.println("Print a Pattern According to The Given Value of A : "); print2D(pattern(5));
		System.out.println("Length of longest consecutive ones : " + consecutive1s("0010110010011101") );
		
	}
	
/*
 *  Special Subsequences "AG"
 *  You have given a string A having Uppercase English letters.
You have to find that how many times subsequence "AG" is there in the given string.
NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 */
public static int subsequenceAG(String A) {
    int cntA=0, cntG=0, strcnt=0;
    
    for(int i=0; i<A.length(); i++){
        
        if(A.charAt(i) == 'A'){
             cntA++;
        }
        if(A.charAt(i) == 'G'){
            cntG++; 
            strcnt += (cntA);
            
        }
    }
    return strcnt;
}

/*
 * Q2. Closest MinMax
 * Given an array A. Find the size of the smallest subarray such that it contains atleast one occurrence of the maximum value of the array
and atleast one occurrence of the minimum value of the array.
 */
public static int MinMax(int[] A) {
    
    
    int min = A[0], max = A[0], minpos=0, maxpos=0;
    
    for(int i=1; i<A.length; i++){
        
        if(min>A[i]){
            min=A[i];
            minpos=i;
        } 
        if(max < A[i]){
            max=A[i];
            maxpos=i;
        } 
       
    }
    int cnt = Math.abs(maxpos-minpos);
    
    for(int i=0; i<A.length; i++){
        if(A[i]==min) minpos = i;
        if(A[i] == max) maxpos=i;
        if(cnt>Math.abs(maxpos-minpos)) cnt = Math.abs(maxpos-minpos);
    }
    
    return cnt+1;
}

/*
 * Print a Pattern According to The Given Value of A.
 */
public static int[][] pattern(int A) {
    
    int[][] sol = new int[A][A];
    int cnt=1;
    for(int i=0; i<A; i++){
        for(int j=A-1; j>=A-i-1; j--){
            sol[i][j] = cnt;
            cnt++;
            
        }
        cnt=1;
    }
    return sol;
}

/*
 * Length of longest consecutive ones
 * Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
 *  Find and return the length of the longest consecutive 1’s that can be achieved.
 */
public static int consecutive1s(String A) {
    
    int count = 0, current_count=0, total_count=0, zero_count=0, size=0;
int start = 0;
for(int i=0; i<A.length(); i++)
{
if(A.charAt(i) == '1')
count++;
}
for(int i=0; i<A.length(); i++)
{
char ch = A.charAt(i);
if(ch == '1')
current_count++;

if( count > current_count )
total_count = current_count + zero_count;
else
total_count = current_count;
size = (total_count>size) ? total_count : size;

if(ch == '0')
zero_count++;

while(zero_count == 2)
{
if(A.charAt(start) == '0')
zero_count--;
else
current_count--;
start++;
}
}
return size;    
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
