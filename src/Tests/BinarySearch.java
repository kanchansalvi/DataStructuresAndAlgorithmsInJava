/**
 * 
 */
package Tests;

/**
 * @author Ganesh-Salvi
 *
 */
public class BinarySearch {

	static int arr[] = {1,2,3,4,5,6,7};
	static boolean DEBUG = true;
	
	
	
	public static void main(String[] args) {	
//		search(2);
//		search(1);
//		search(3);
//		search(7);
//		
		
	}

	public static  int size() {
//		if(DEBUG) System.out.println("Size of an array : " + arr.length);
		return arr.length;
	}

	public static boolean search(int num) {
		
		int start = 0;
		int end = size() - 1;
		int mid = 0;
		int pos = 1;
		mid = (end-start)/2;
		
		while(start <= end) {
		mid = (end-start)/2 + start;
			if(arr[mid] == num) {
				   if(DEBUG) System.out.println("Found Start end mid pos"+start+" "+end+" "+mid+" "+pos);
							return true;
				}
			
//			if(DEBUG) System.out.println("0.. Start end mid " + start+" " + end + " "+ mid);
			else if(arr[mid] > num) {
				end = mid-1;
				//pos = mid;
				if(DEBUG) System.out.println("1.. Start end mid pos"+start+" " +end+" "+mid+" "+pos);
				//mid = mid/2;
				
			}
			else if(arr[mid] < num) {
				start =  mid+1 ;
//				if(DEBUG) System.out.println("2.. Start end mid pos"+start+" " +end+" "+mid+" "+pos);
				//mid = (end - start)/2;
			}
//		   pos++;
		}
		
		
		return false;
	}
	

}
