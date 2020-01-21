/*  String character
 * 
 */
package Question;

public class reverseOnlyLetter {

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		reverse("fgdg-ghh");
}
	
	 public  String reverse(String S) {
		 
		char SR[] = S.toCharArray();
		int front = 0;
		int back = S.length()-1;
					 
		while(front < back) {
			
			if(!Character.isLetter(SR[front])) front++;
			else if(!Character.isLetter(SR[back])) back--;
			
			else {
			    char tmp = SR[front];
			    SR[front] = SR[back];
			    SR[back] = tmp;
	            front++;
	            back--;
			}
			
		}
		System.out.println(String.valueOf(SR));
		
		return String.valueOf(SR);
		
	    }

}
