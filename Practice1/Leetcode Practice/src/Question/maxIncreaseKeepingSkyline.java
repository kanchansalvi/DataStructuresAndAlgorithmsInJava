/*
 * In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there. We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings). Height 0 is considered to be a building as well. 

At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.

What is the maximum total sum that the height of the buildings can be increased?

Example:
Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
Output: 35
Explanation: 
The grid is:
[ [3, 0, 8, 4], 
  [2, 4, 5, 7],
  [9, 2, 6, 3],
  [0, 3, 1, 0] ]

The skyline viewed from top or bottom is: [9, 4, 8, 7]
The skyline viewed from left or right is: [8, 7, 9, 3]

The grid after increasing the height of buildings without affecting skylines is:

gridNew = [ [8, 4, 8, 7],
            [7, 4, 7, 7],
            [9, 4, 8, 7],
            [3, 3, 3, 3] ]

 */

package Question;

public class maxIncreaseKeepingSkyline {
	
	static int grid[][] = {{5,0,4,4},{2,4,5,7},{9,8,6,3},{0,3,1,0}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		keepSkyline();

	}

	private static void keepSkyline() {
		// TODO Auto-generated method stub
		int maxRow[] = {0,0,0,0};
		int maxCol[] = {0,0,0,0};
		int sum=0;
		for(int i=0;i<grid.length; i++) {
			maxRow[i] = getMaxRow(i);
		}
		
		for(int i=0;i<grid[0].length; i++) {
			maxCol[i] = getMaxCol(i);
		}
		
		for(int i=0;i<grid.length; i++) {
			System.out.println("max:" +maxRow[i] + " "+ maxCol[i]);
		}
		
		for(int i=0;i<grid.length; i++) {
			for(int j=0;j<grid[0].length;j++) {
			sum += Math.min(maxRow[i],maxCol[j]) - grid[i][j];
			}
		}
		
		System.out.println("sum= " +sum);
		
	}

	private static int getMaxRow(int i) {
		// TODO Auto-generated method stub
		
		int max=grid[i][0];
		for(int j=1; j<grid[0].length; j++) {
			if(max < grid[i][j]) {
				max=grid[i][j];
			}
		}
		return max;
	}
	
	private static int getMaxCol(int i) {
		// TODO Auto-generated method stub
		
		int max=grid[0][i];
		for(int j=1; j<grid[0].length; j++) {
			if(max < grid[j][i]) {
				max=grid[j][i];
			}
		}
		return max;
	}
	

}
