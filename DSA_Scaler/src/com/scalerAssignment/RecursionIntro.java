package com.scalerAssignment;

public class RecursionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Check Palindrome : " +isPalindrome("naman") );
		System.out.println("Find Fibonacci : " + findAthFibonacci(9));
		System.out.println("Sum of Digits! : " + sumOfDigits(10) );

	}

/*
 * Check Palindrome
 * Write a recursive function that checks whether a string A is a palindrome or Not.
Return 1 if the string A is palindrome, else return 0.
Note: A palindrome is a string that's the same when reads forwards and backwards.
 */
public static int isPalindrome(String A) {
        
        if(A.length()==1 || A.length()==0) return 1;
        
        if(A.charAt(0) == A.charAt(A.length()-1))
        return isPalindrome(A.substring(1, A.length()-1));
        
        return 0;
    }

/*
 * Find Fibonacci
 * The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation
Fn = Fn-1 + Fn-2
Given a number A, find and return the Ath Fibonacci Number.
Given that F0 = 0 and F1 = 1.
 */
public static int findAthFibonacci(int A) {
    if(A==0) return 0;
    if(A==1 || A==2) return 1;
    return findAthFibonacci(A-1) + findAthFibonacci(A-2);
}
/*
 * sumOfDigits
 * Given a number A, we need to find sum of its digits using recursion.
 */
public static int sumOfDigits(int A) {

    if(A<10) {
        System.out.print("A="+A+"; ");
        return A;
    }
   int rem = A%10;
   System.out.print("rem="+rem+"; ");
   return (rem) + sumOfDigits(A/10);

}
// static int sum_of_digit(int n) 
// {  
//     if (n == 0) 
//         return 0; 
//     return (n % 10 + sum_of_digit(n / 10)); 
// }
}
