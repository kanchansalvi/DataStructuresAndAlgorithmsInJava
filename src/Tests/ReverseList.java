package Tests;

import java.util.LinkedList;

/*
 * author : Deepkanchan
 * 
 * PS  : Reverse a singly linked list.
 * 
 * Example:
 *      Input: 1->2->3->4->5->NULL
 *      Output: 5->4->3->2->1->NULL
 */
public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(2); list1.add(4); list1.add(3);
		System.out.println(reverseList(list1));
	}

	public static LinkedList<Integer> reverseList(LinkedList<Integer> list1) {
		// TODO Auto-generated method stub
		LinkedList<Integer> reverselist = new LinkedList<Integer>();
		int j=0;
		for( int i=list1.size()-1;i>=0; i--)
		{
			reverselist.add(j, list1.get(i));
			j++;
			}
		return reverselist;
	}
}
