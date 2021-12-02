package com.ScalerMentor;


import java.util.ArrayList;
import java.util.List;

/*
* str = "My name is Deep"
* M n i D
* y a s e
* m e
* e p
*/

public class mentor_Oct12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "My name    isss Deepkanchan";
     //System.out.print(str+"\n");
     //getArray1(str);
     String str2 = "str1 str2 str3                   str4 str5 str7 str8 str9 str10 str11 str12 str13 str14 str15 str16 str17 str18 str19";
     print10Lines(str2);
	}

	public static ArrayList<ArrayList<String>> getArray1(String str) {
		
		if(str.length() == 0) return null;
		
		ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
		int row=0;
		arr.add(new ArrayList<String>());
		
		for(int i=0; i<str.length(); i++) {
			
			char temp = str.charAt(i);
			
			if(temp == ' ') {
				while(str.charAt(i) == ' ') i++;
				i--;
				row=0;
			}
			
			else {
				if(row>=arr.size()) 
					arr.add(new ArrayList<String>());
				arr.get(row).add(temp+"");
				row++;
				
			}

		}
		System.out.print(arr);
		
		return arr;
		
	}
	
/* Qstn-2
 * 	Given some text lines in one string, each line is separated by ‘\n’ character. 
 * Print the last ten lines. If number of lines is less than 10, then print all lines.

Input :
str1\nstr2\nstr3\nstr4\nstr5\nstr6\nstr7\nstr8\nstr9\nstr10\nstr11\nstr12\nstr13\nstr14\nstr15\nstr16\nstr17\nstr18\nstr19\nstr20\nstr21\nstr22\nstr23\nstr24\nstr25
 */

	public static String print10Lines(String str) {
		
		int cnt=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)==' ') {
			while(i<str.length() && str.charAt(i)==' ') i++;
			cnt++;
			}
		}
		
		System.out.print(cnt+ "\n");
		
		if(cnt<10) {
			System.out.print(str);
			return str;
		}
		
		else {
			int pos = cnt-10+1;
			cnt=0;
			for(int i=0; i<str.length(); i++) {
				
				if(str.charAt(i)==' ' && cnt<pos) {
					while(i<str.length() && str.charAt(i)==' ') i++;
					i--;
					cnt++;
				}
				if(cnt>=pos) 
				System.out.print(str.charAt(i));
			}
		}
		return str.trim();
		
	}
	
}
