package com.scalerAssignment;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Reverse the String : " );
		System.out.println("Simple Reverse : " +simpleReverse("Hi and Hello") );
		System.out.println("Rotate string : " +rotate("ABCDEFgh", 3) );
		System.out.println("tolower() : "); char[] A = {'A','B','C'};
		print1D(to_lower(A));
		System.out.println("to_upper : "); print1D(to_upper(A));
		System.out.println("character array are alphanumeric (a-z, A-Z and 0-9) : " + isAllNum(A) );
		System.out.println("Isalpha() : " +isAlpha(A) );
		System.out.println("Amazing Subarrays : " +amazing("hi I am This and that") );
		System.out.println("Count Occurrences : " + Occurences("asd bob heybob"));
		System.out.println("Change character : ");
		System.out.println("Closest Palindrome : " + closestPalindrome("adaddb"));
		String str[] = {"abab", "ab", "abcd"};
		System.out.println("Longest Common Prefix : " + longestCommonPrefix(str));
		System.out.println(" : " + strOperations("AbcaZeoB") );
		System.out.println("Lexicographically Largest : ");
		
	}

/*
 * Reverse the String
 * Given a string A of size N.
Return the string A after reversing the string word by word.
NOTE:
A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
 */
	
/*
 * Simple Reverse
 * Given a string A, you are asked to reverse the string and return the reversed string.
 */

public static String simpleReverse(String A) {
        
        int l=0, r=A.length()-1;
        char[] ch = new char[A.length()];
        
        while(l<=r){
           ch[l] = A.charAt(r);
           ch[r] = A.charAt(l);
           l++; r--;
        }
        return String.valueOf(ch);
    }
/*
 * Rotate string
 * Given a string A, rotate the string B times in clockwise direction and return the string.
 */
public static String rotate(String A, int B) {
    
    char[] ch = new char[A.length()];
    int temp = 0, i=0;
    B=  (B%A.length());
    
        while(B>0){
        ch[i] = A.charAt(A.length()-B);
        B--;
        i++;
        }  
     
    while(i<A.length()){
        ch[i] = A.charAt(temp);
        temp++;
        i++;
    }
    
  return String.valueOf(ch);
}
/*
 * tolower()
 * You are given a function to_lower() consisting of a character array A.

Convert each charater of A into lowercase character if it exists. If the lowercase of a character does not exist, it remains unmodified.
The uppercase letters from A to Z is converted to lowercase letters from a to z respectively.

Return the lowercase version of the given character array.
 */
public static char[] to_lower(char[] A) {
    
    for(int i=0; i<A.length; i++){
       
       if(A[i] >= 'A' && A[i] <= 'Z'){
           A[i] = (char)(A[i]-'A'+'a');
       }
   }
   return A;
}

/*
 * toupper()
 */
public static char[] to_upper(char[] A) {
    
    for(int i=0; i<A.length; i++){
        
        if(A[i] >= 'a' && A[i] <= 'z'){
            A[i] = (char)(A[i]-'a'+'A');
        }
    }
    return A;
}

/*
 * Isalnum()
 * You are given a function isalpha() consisting of a character array A.
Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z and 0-9), else return 0.
 */
public static int isAllNum(char[] A) {
    
    for(int i=0; i<A.length; i++){
        
        if((A[i]<'a' || A[i]>'z') && (A[i]<'A' || A[i]>'Z') && (A[i] < '0' || A[i] > '9')) return 0;
    }
    return 1;
}

/*
 * Isalpha()
 * Return 1 if all the characters of the character array are alphabetical (a-z and A-Z), else return 0.
 */
public static int isAlpha(char[] A) {
    
    for(int i=0; i<A.length; i++){
        
        if((A[i]<'a' || A[i]>'z') && (A[i]<'A' || A[i]>'Z')) return 0;
    }
    return 1;
}
/*
 * Amazing Subarrays
 * You are given a string S, and you have to find all the amazing substrings of S.

Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 */

public static int amazing(String A) {
	int res = 0;
	int size = A.length();
	String vowels = "aeiouAEIOU";
	
		for(int i = 0; i < size; i++){
			if(vowels.contains(String.valueOf(A.charAt(i))))
			res += size - i;
		}
	return res % 10003;
}

/*
 * Count Occurrences
 * Find number of occurrences of bob in the string A consisting of lowercase english alphabets.
 */
public static int Occurences(String A) {
    char ch[] = A.toCharArray();
    int cnt = 0;
    
    for(int i=0; i<A.length()-2; i++){
        if(ch[i] == 'b' && ch[i+1]=='o' && ch[i+2]=='b') cnt++;       
    }
    return cnt;
}

/*
 * Change character
 * Given a string A of size N consisting of lowercase alphabets.
You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.
Find the minimum number of distinct characters in the resulting string.
 */

/*
 * Closest Palindrome
 * A palindrome string is one that reads the same backward as well as forward.
Given a string A of size N consisting of lowercase alphabets, he wants to know if it is possible to make the given string a palindrome by changing exactly one of its character
 */
public static String closestPalindrome(String A) {
    
    int l=0, r=A.length()-1;
    int cnt=0;
    
    while(l<r){
        Character left = A.charAt(l);
        Character right = A.charAt(r);
        if(!left.equals(right)) cnt++; 
        l++; r--;
    }
    if(cnt == 1) return "YES";
    else if(cnt==0 && A.length()%2==1) return "YES";
    return "NO";
}

/*
 * Longest Common Prefix
 */
public static String longestCommonPrefix(String[] A) {

    int len = A.length, cnt=1;
    String prefix="";

  for(int i=0; i<A[0].length(); i++){
      char temp = A[0].charAt(i);
      cnt = 0;
      for(int j=0; j<A.length; j++){
          if((A[j].length()>i) && (A[j].charAt(i) == temp)) cnt++;
          else break;
      }
      if(cnt == len){
       prefix = prefix + temp + "";
      }
      else break;
  }
  return prefix;
}

/*
 * String operations
 * Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.
NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
 */
public static String strOperations(String A) {
 
	StringBuilder sb = new StringBuilder();
	String vowels = "aeiou";
	String upeerCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String str = A + A;
		for(char ch: str.toCharArray()){
			if(vowels.contains(String.valueOf(ch)))
				sb.append('#');
			else if(!upeerCase.contains(String.valueOf(ch)))
				sb.append(ch);
		}
	return sb.toString();
		
}

//Print 1D Array
public static void print1D(char[] c) {
	
	for(int i=0; i<c.length; i++) {
		System.out.print(c[i]+" ");
	}
}
}
