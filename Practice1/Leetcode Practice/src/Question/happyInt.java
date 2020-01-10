package Question;


    
public class happyInt {
    
    public static void main(String[] args) {
            
            isHappy(18)   ;         
    }
    
    public static void isHappy(int n) {
        int loop=0;
        while(n != 1 && loop<10){
        	loop++;
          n = getSum(n);
      }
        if(n == 1) System.out.println("Happy string found");
        else System.out.println("Happy string not "
        		+ "found");
  } 
    public static int getSum(int num){
      
      int res = 0;
      int m = 0; 
      
      while(num>9){
        m = num%10;
        res=res + (m*m);
        num = num/10;
      }
      res = res + (num*num);
      return res;
    }
}