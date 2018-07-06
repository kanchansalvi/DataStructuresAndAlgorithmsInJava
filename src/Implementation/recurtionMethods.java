package Implementation;

public class recurtionMethods {

	public int fact = 1;
	public recurtionMethods() {
		// TODO Auto-generated constructor stub
	}
	
	/******** 15. Factorial of a no. using Recursion ***********/
public int recFact(int num){
	fact = 1;
	return recFactHandler(num);
}
	public  int recFactHandler(int num){
			if(num > 0){
				fact = (fact) * num;
				num--;
				recFactHandler(num);
				
		}
		  return fact;		
	}

/******** Permutation of string: ******************
 * P(n,r) = (n!)/(n-r)!
 * C(n,r) = n!/((n-r)! *(r!))
 */
	
public  void permString(String str, int n, int r) {
	
	int perm = 0;
	perm = recFact(n)/recFact(n - r);
	
	System.out.println("RecFact((n!)/(n-r)!) of P("+n+","+r+") = " + perm);
	
	perm(str, "");
	
}

public void perm(String str, String prefix) {

	if(str.length() == 0) {
		System.out.println( prefix);
	} else {
		for(int i=0; i<str.length(); i++) {
			String rem = str.substring(0, i) + str.substring(i+1);
			perm(rem,prefix + str.charAt(i));
		}	
	}
}
}
