package Question;

public class recerseSInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(2147483647);

	}
	
public static void reverse(int num) {
	long rev=0;
	boolean isNeg = false;
	
	if(num < 0) { 
		num=-num;
		isNeg=true;
		}
	while(num > 0) {
		rev = (rev*10) + (num%10);
		num=num/10;
	}
	
	if(rev > Integer.MAX_VALUE || rev< Integer.MIN_VALUE) {System.out.println("reverse of num cannot be returned in Int.") ;}
	
	if(isNeg == true) { rev = -rev; }
       System.out.println("reverse of num is :"  + rev) ;
    }

}
