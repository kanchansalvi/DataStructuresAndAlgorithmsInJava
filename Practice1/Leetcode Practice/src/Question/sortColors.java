/*
 Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */

// Code submitted on leetcode and is accepted
package Question;

public class sortColors {

	public static void main(String[] args) {
		int nums[] = {4,3,1,0};
		sort(nums);

	}
	
int start, next, temp;
    
    public static void sort(int[] nums) {
        
        int start = 0;
        
        for(int i=0; i<nums.length-1; i++){
        	
            for(int j=i; j< nums.length; j++){
                if(nums[j] == start){
                	int temp=nums[i];
                	nums[i]=nums[j];
                	nums[j]=temp;
                	System.out.println(" i= " + i + " val= " + nums[i]);
                	i++;
                }
              } 
            start++; 
            i--;
            }
    }
}
