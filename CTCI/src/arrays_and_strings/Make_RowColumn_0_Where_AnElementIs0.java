package arrays_and_strings;

public class Make_RowColumn_0_Where_AnElementIs0 {

	public int[][] makeRowColumn0(int [][] inpArray){
		
//		int[][] finalArray = new int[inpArray.length][inpArray[0].length];
		int[] row = new int[inpArray.length];
		int[] col = new int[inpArray[0].length];
		/*for(int[] column:inpArray){
			finalArray[i][0] = column[0];
		}*/
		for (int j = 0; j < inpArray.length; j++) {
			for(int i=0;i<inpArray[0].length;i++){
				if(inpArray[j][i]==0){
					row[j] = 1;
					col[i] = 1;
				}
			}
		}
		
		for (int j = 0; j < inpArray.length; j++) {
			for(int i=0;i<inpArray[0].length;i++){
				if(row[j]==1 || col[i]==1){
					inpArray[j][i]=0;
				}
			}
		}
		
		for (int j = 0; j < inpArray.length; j++) {
			for(int i=0;i<inpArray[0].length;i++){
				System.out.println(inpArray[j][i]);
			}
		}
		return inpArray;
	}
	
	public static void main(String[] args) {
		Make_RowColumn_0_Where_AnElementIs0 anElementIs0 = new Make_RowColumn_0_Where_AnElementIs0();
		int [][] inpArray = new int[][]{{0,3,3},{4,5,6},{7,8,9}};
		anElementIs0.makeRowColumn0(inpArray);
	}

}
