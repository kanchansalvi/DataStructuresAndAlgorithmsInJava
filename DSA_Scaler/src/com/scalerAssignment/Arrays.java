package com.scalerAssignment;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A={3,3,4,4,5,1,5,6,7,8,8,7};
		
		System.out.println("Good pair exist?="+solve(A, 10));
		System.out.println("FizzBuzz="); print1D(fizzBuzz(8));
		System.out.println("Odd Even Subsequences="+oddEven(A));
		System.out.println("Time to Equality="+time(A));
		System.out.println("Rotation Game: Make a new class and add code");
		System.out.println("primalPower=" +primalPower(A) );
		int B[] = {2,3};
		System.out.println("Multiple left rotations of the array=");
		print2D(MultipleLeftRotations(A,B) );
		
	}
/*
 * Good Pair
 * Given an array A and a integer B. A pair(i,j) in the array is a good pair if i!=j and (A[i]+A[j]==B). 
 * Check if any good pair exist or not.
 */
	public static int solve(int[] A, int B) {
        for(int i=0; i<A.length-1; i++){
            for(int j=0; j<A.length; j++){
                if((A[i]+A[j] == B) && (i != j)) return 1;
            }
        }
        
        return 0;
    }
/*
 * FizzBuzz
 * Given a positive integer A, return an array of strings with all the integers from 1 to N. But for multiples of 3 the array should have “Fizz” instead of the number. For the multiples of 5, the array should have “Buzz” instead of the number. For numbers which are multiple of 3 and 5 both, the array should have "FizzBuzz" instead of the number.
 * A = 5  O/p  [1 2 Fizz 4 Buzz]
 */
public static String[] fizzBuzz(int A) {
        
        String Str[] = new String[A];
        
        for(int i=1; i<=A; i++){
            if(i%3 == 0 && i%5==0)   Str[i-1]="FizzBuzz";
            else if(i%3 == 0)    Str[i-1]= "Fizz";
            else if(i%5 == 0)    Str[i-1]= "Buzz";
            else Str[i-1] = Integer.toString(i);
            
        }
        
        return Str;
    }

/*
 * Odd Even Subsequences
 * Given an array of integers A of size N. Find the longest subsequence of A which is odd-even
 * Input 1:
    A = [1, 2, 2, 5, 6]
Output 1:
    4
    Explanation 1:
        Maximum length odd even subsequence is [1, 2, 5, 6]
 */
public static int oddEven(int[] a) {
    
    int result=0;
    boolean even=a[0]%2==0?true:false; //check if first number is even
    boolean odd=a[0]%2!=0?true:false; //check if first number is odd
    for(int i=0; i<a.length;i++){
        if(a[i]%2==0 && even){
            result=result+1;
            even=false; //setting even flag to false implies that next element in the sub-sequence should be odd
            odd=true;
        }else if(a[i]%2!=0 && odd){
            result=result+1;
            odd=false; //setting odd flag to false implies that next element in the sub-sequence should be even
            even=true;
        }
    }
    return result;
}

/*
 * Time to equality
 * Given an integer array A of size N. In one second you can increase the value of one element by 1.
Find the minimum time in seconds to make all elements of the array equal.
A = [2, 4, 1, 3, 2] O/p = 8
 */
public static int time(int[] A) {
    
    int max = A[0];
    int count = 0;
    
    for(int i=1; i<A.length; i++){
        
        if(A[i] > max){
            count += i*(A[i]-max);
            max = A[i];
        }
        
        else if(A[i] < max){
            count += (max-A[i]);
        }
        
        else {}
    }
    
    return count;
}

/*
 * Rotation Game
 * You are given an integer array A and an integer B. You have to print the same array after rotating it B times towards right.
NOTE: You can use extra memory.
4 1 2 3 4
 2    O/p 3 4 1 2
 */
/*
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int T = s.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i=0; i<T; i++) {
        arr.add(s.nextInt());
    }
    int B = s.nextInt();
    int N = arr.size();
    B = B%N; //take mod with length of array 
    ArrayList<Integer> C = new ArrayList<Integer>(arr);
    for(int i=0; i<N; i++) {
       int newindex = (i+B)%N; //calculate the new index of the element
       C.set(newindex, arr.get(i));
        
    }
    
    for(int i=0; i<N; i++) {
        System.out.print(C.get(i)+" ");
    }
           
}
*/

/*
 * Primal Power
 * "Primal Power" of an array is defined as the count of prime numbers present in it.

Given an array of integers A of length N, you have to calculate its Primal Power.
 */
public static int primalPower(int[] A) {
    
    int cnt=0;
    
    for(int i=0; i<A.length; i++){
         
        if( isPrime(A[i]) ) cnt++;
        
    }
    return cnt;
}

public static boolean isPrime(int n){
    if (n <= 1) {  
       return false;  
   }  
    
    for (int j = 2; j <= Math.sqrt(n); j++) {  
       if (n % j == 0) {  
           return false; 
       }  
   }
   
   return true;
}

/*Multiple left rotations of the array
 * Given an array of integers A and multiple values in B which represents number of times array A needs to be left rotated.

Find the rotated array for each value and return the result in the from of a matrix where i'th row represents the rotated array for the i'th value in B.
 */
public static int[][] MultipleLeftRotations(int[] A, int[] B) {
    
    int numCnt = A.length;
    int sol[][] = new int[B.length][numCnt];
    
    int pos=0;
    for(int i=0; i<B.length; i++){
        int rotate=Math.abs(B[i]%numCnt);
        for(int j=0; j<A.length; j++){
            if(j-rotate < 0) pos=numCnt+j-rotate;
            else pos = j-rotate;
            sol[i][pos] = A[j];
        } 
    }
   return sol;    
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
