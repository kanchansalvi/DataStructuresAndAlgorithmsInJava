package Question;

public class countBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        getCount(15);
	}

	public static int[] getCount(int num) {
		// TODO Auto-generated method stub
		
		int cnt[] = new int[num+1];
		
		for(int i=0; i<=num; i++) {
			cnt[i] = getOnes(i);
			System.out.println("In " + i);
		}
		
		return cnt;
	}
	
	public static int getOnes(int val) {
		
		int ctr = 0;
		
		while(val > 0) {
			
			if(val%2 == 1) {
				ctr++;
			}
			val=val/2;
		}
		System.out.println("number of 1 in  = " + ctr);
		
		return ctr;
	}

}
