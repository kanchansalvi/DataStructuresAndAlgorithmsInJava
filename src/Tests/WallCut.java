package Tests;

public class WallCut {

	public static void main(String[] args) {
		
		int[][] wallbricks = {
								{1,2,3,0,0,0},  
								{2,1,2,1,0,0},
								{2,4,0,0,0,0},
								{2,1,3,0,0,0},
								{1,1,1,2,1,0},
								{2,1,2,1,0,0}
							};
		int wallsize  = 6;
		
		myCut(wallbricks, wallsize);
	}

	
/******* Cutting the wall *****
 * @param wallbricks :array with size of brick
 * @param wallsize :size of wall
 * 
 * Find solution such that 
 * within given wallsize minimum no. of bricks are needed to cut.
 */
	private static void myCut(int[][] wallbricks, int wallsize) {
		
		int mywall[][] =new int[wallsize][wallsize];
		int cutcounter[] = new int[wallsize+1];
		int curr, i=0;
		int mycut;
		
		while(i < wallsize) {
			
			mywall[i][0] = wallbricks[i][0];
			cutcounter[mywall[i][0]]++;
		
			for(int j=1;j<wallsize; j++) {
				if(wallbricks[i][j] != 0) {
				mywall[i][j] = mywall[i][j-1] + wallbricks[i][j];;
				cutcounter[mywall[i][j]]++;
				}
			}
			i++;
		}
		
		System.out.print("\nFor minimum cutting of bricks \nCut should occur");
		mycut = cutcounter[0];
		for(int k=0; k<wallsize; k++) {
			
			if(cutcounter[mycut] < cutcounter[k]) {
				mycut = k;
			}
		}
		
		System.out.print(" after "+ mycut+ " position \nNo.of cuts present : " +cutcounter[mycut]);
		
	}

}
