package Tests;

import java.util.LinkedList;
/*
 * author:Deepkanchan
 * 
 * PS : You are given tow empty Linked List representing two non-negative integers.
 * 		The digits are stored in reverse order and each of their nodes contain a single digit.
 * 		Add the two numbers and return it as a linked list.
 *      You may assume the two numbers do not contain any leading zero, except the number zero itself.
 *      
 */

public class sum {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(2); list1.add(4); list1.add(3);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(5); list2.add(6); //list2.add(4); list2.add(8);
		
		System.out.println(listSum(list1, list2));
	}
public static LinkedList<Integer> listSum(LinkedList<Integer> list1, LinkedList<Integer> list2){
	
	LinkedList<Integer> sum = new LinkedList<Integer>();
	int x=0,y=0,carry=0,tot=0;
	
	for(int i=0; i<list1.size(); i++){
		x=(Integer) list1.get(i);
		y=0;
		
	 if(i < list2.size()){ y=(Integer) list2.get(i); System.out.println(y);}
	 if(i > list2.size()) { y= 0 ;}
	 
	  tot = (x+y+carry)%10;
	  if(x+y > 9) {carry = 1;}
	  else {carry = 0;}
	  
	  sum.add(tot);
	}
	if (list1.size()<list2.size()){
		 {  for( int j=list1.size(); j<list2.size(); j++) {sum.add((Integer) list2.get(j));   }}}
		 
	return sum;
}
}
