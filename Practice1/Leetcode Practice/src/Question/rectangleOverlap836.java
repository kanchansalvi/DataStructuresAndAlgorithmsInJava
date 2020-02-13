/*
 * A rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) are the coordinates of its bottom-left corner, and (x2, y2) are the coordinates of its top-right corner.

Two rectangles overlap if the area of their intersection is positive.  To be clear, two rectangles that only touch at the corner or edges do not overlap.

Given two (axis-aligned) rectangles, return whether they overlap.

Example 1:

Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
Output: true
Example 2:

Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
Output: false
Notes:

Both rectangles rec1 and rec2 are lists of 4 integers.
All coordinates in rectangles will be between -10^9 and 10^9.
 */

package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class rectangleOverlap836 {
	
	 public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
	      // X coordinate of one of rectangles lies between those of other rectangle
	      // Y coordinate of one of rectangles lies between those of other rectangle
	      
	        return Math.min(rec1[2], rec2[2])>Math.max(rec2[0], rec1[0]) && 
	                          Math.min(rec1[3], rec2[3])>Math.max(rec2[1], rec1[1]);   
	    }
	 
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] rec1 = stringToIntegerArray(line);
            line = in.readLine();
            int[] rec2 = stringToIntegerArray(line);
            
            boolean ret = new rectangleOverlap836().isRectangleOverlap(rec1, rec2);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
