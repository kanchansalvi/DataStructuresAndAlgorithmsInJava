package myPractice;

public class ArraysPS {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arri[] = {1,2,3,4,5,6,7,8};
		char arrc[] = {'A','B', 'C','D','E','F'};
		String arrs[] = {"Mumbai", "Pune", "Noida","Delhi", "Ooty" };
		
		System.out.println("Printing Integer Array");
		for(int i=0; i<arri.length; i++) {
			System.out.print("   arri[" +i+ "]=" +arri[i]);
		}
		
		System.out.println("\n\nPrinting Character Array");
		for(int i=0; i<arrc.length; i++) {
			System.out.print("   arrc[" +i+ "]=" +arrc[i]);
		}
		
		System.out.println("\n\nPrinting String Array");
		for(int i=0; i<arrs.length; i++) {
			System.out.print("   arrs[" +i+ "]=" +arrs[i]);
		}
	}

}
