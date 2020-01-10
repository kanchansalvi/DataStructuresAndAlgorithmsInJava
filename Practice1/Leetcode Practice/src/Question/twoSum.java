package Question;

import java.util.Arrays;

public class twoSum {
	
	public static void main(String[] args) {
		
		int arr[] = {7, 2, 11, 15};
        
		twoSumSol(arr,9);         
}
    public static void twoSumSol(int[] nums, int target) {
        
       int sum[] = new int[nums.length];
      int k=0;
      
      for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
          if((nums[i]+nums[j]) == target){
            sum[k]=nums[i];
            k++;
            sum[k] = nums[j];
            k++;
          }
        }
      }
//      Arrays.sort(sum);
      for(int i=0; i<sum.length; i++) {
    	  System.out.println(" " + sum[i]);
      }
    
    }
  
}