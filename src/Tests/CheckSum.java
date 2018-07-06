package Tests;
/**
 * 
 */

/**
 * @author Deepkanchan N S
 * PS : Given an array of integers and numbers, 
 * 		return true or False if sum of any two integers in an array 
 * 		equals the given number
 */
public class CheckSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello !");
		int set[] = {2,3,4,5,6,7,8,9};
		int target  = 7;
		System.out.println(twoSum(set, target));
		set = new int[]{1, 2};
		target = 4;
		System.out.println(twoSum(set, target));
		
		System.out.println(twoSum(null, 1));
		
		System.out.println(twoSum(new int[]{}, 1));
		
		System.out.println(twoSum(new int[]{1,2,3,4}, 1));
		
	}
	public static boolean twoSum(int[] arr, int num)
	{
		if(arr == null){ 
			return false; 
		}
		
		for(int i =0;i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				int sum = arr[i] + arr[j];
				if(sum == num){ 
					System.out.println("Indices of two numbers are [" +i+ "," +j+ "]");
					return true; 
				}
			}
		
		}
		return false;
	}
	
}

