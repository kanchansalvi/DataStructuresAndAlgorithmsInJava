package com.scalerAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sum of digits
		System.out.println("\nSum of digits:\n"+solve(46));
		
		//Palindrome:
		System.out.println("\nPalindrome:\n"+solve("malayalam"));
		
		//Fibonacci
		System.out.println("\nFibonacci:\n"+findAthFibonacci(8));
		
//Recursion - Day 34
//Generate parenthesis
		System.out.println("\nGenerate parenthesis:\n"+generateParenthesis(4));

// Generate permutations:
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1); arr.add(2); arr.add(3);
		System.out.println("\nGenerate permutations:\n"+permute(arr));	
	}

/*Given a number A, we need to find sum of its digits using recursion.
 * * A = 46 ===>10
 */
	public static int solve(int A) {

        if(A<10) {
            System.out.print("A="+A+"; ");
            return A;
        }
       int rem = A%10;
       System.out.print("rem="+rem+"; ");
       return (rem) + solve(A/10);
   }
	
/*
 * Write a recursive function that checks whether a string A is a palindrome or Not.
Return 1 if the string A is palindrome, else return 0.
Note: A palindrome is a string that's the same when reads forwards and backwards.
 */
public static int solve(String A) {
        
        if(A.length()==1 || A.length()==0) return 1;
        
        if(A.charAt(0) == A.charAt(A.length()-1))
        return solve(A.substring(1, A.length()-1));
        
        return 0;
    }
/*
 * The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:
Fn = Fn-1 + Fn-2
Given a number A, find and return the Ath Fibonacci Number.
Given that F0 = 0 and F1 = 1.
Eg A=2 ====> 1 Exp:  f(2) = f(1) + f(0) = 1
 */
public static int findAthFibonacci(int A) {
    if(A==0) return 0;
    if(A==1 || A==2) return 1;
    return findAthFibonacci(A-1) + findAthFibonacci(A-2);
}

/*
 * Given an integer A pairs of parentheses, 
 * write a function to generate all combinations of well-formed parentheses of length 2*A.
 * A = 3 ===> [ "((()))", "(()())", "(())()", "()(())", "()()()" ]
 */
public static ArrayList<String> generateParenthesis(int A) {
    
    ArrayList<String> list = new ArrayList<String>();
    generate(list, "", 0, 0, A);
    return list;
    
}

public static void generate(ArrayList<String> list, String str, int nOpen, int nClosed, int num){
    
    if(str.length() == (num*2)){
        list.add(str);
        return;
    }
    
    if(nOpen < num){
        generate(list, str+"(", nOpen+1, nClosed, num);
    }
    
    if(nClosed < nOpen){
        generate(list, str+")", nOpen, nClosed+1, num);
    }
    
}

/*Given an integer array A of size N denoting collection of numbers , 
 * return all possible permutations.
 * 
 * Eg. A = [1, 2, 3] ==>[ [1, 2, 3]
						  [1, 3, 2]
						  [2, 1, 3] 
						  [2, 3, 1] 
						  [3, 1, 2] 
						  [3, 2, 1] ]
 */

public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
    
    ArrayList<ArrayList<Integer>> finalResult = new ArrayList<>();
    
    permuteRecur(nums, finalResult, new ArrayList<Integer>(), new boolean[nums.size()]);
    
    return finalResult;
    
}

private static void permuteRecur(ArrayList<Integer> nums, ArrayList<ArrayList<Integer>> finalResult, List<Integer> currResult, boolean[] used) {

    if (currResult.size() == nums.size()) {
        finalResult.add(new ArrayList<>(currResult));
        return;
    }

    for (int i = 0; i < nums.size(); i++) {
       // if (used[i])
       if( used[i] || ( i > 0 && nums.get(i) == nums.get(i - 1) && !used[i-1]) )
            continue;
        currResult.add(nums.get(i));
        used[i] = true;
        permuteRecur(nums, finalResult, currResult, used);
        used[i] = false;
        currResult.remove(currResult.size() - 1);  //// v v v IMP step....this is where backtrack magic happens...
    }
}

/*
 * Given a digit string A, return all possible letter combinations that the number could represent.
 *  A = "23" ==> ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
 */
public static ArrayList<String> letterCombinations(String A) {
    
    HashMap<Character, String> map = new HashMap<>();
    ArrayList<String> soln = new ArrayList<String>();
    
    map.put('0',"");
    map.put('1',"");
    map.put('2',"abc");
    map.put('3',"def");
    map.put('4',"ghi");
    map.put('5',"jkl");
    map.put('6',"mno");
    map.put('7',"pqrs");
    map.put('8',"tuv");
    map.put('9',"wxyz");
    
    
    combine(A, map, soln, new StringBuilder(), 0);
    return soln;
}

public static void combine(String A, HashMap<Character, String> map, ArrayList<String> soln, StringBuilder comb, int curr){
    
    if(curr>A.length()){
        return;
    }
    if(curr==A.length()){
        //fill
        soln.add(comb.toString());
        return;
    }
    
    String temp = map.get(A.charAt(curr));
    if(temp=="") temp = A.charAt(curr)+""; 
    
    for(char c : temp.toCharArray()){
        comb.append(""+c);
        combine(A, map, soln, comb, curr+1);
        comb.deleteCharAt(comb.length()-1);
    }
}
}
