package hometask;

public class Matrice {
	
	
	public int[][] createMatrice(int[] arrayFirst, int[] arraySecond) {
		int [][]arrayResult = new int[arrayFirst.length][arraySecond.length];
		for (int i= 0;i<arrayFirst.length;i++) {
			for(int j= 0; j<arraySecond.length; j++) {
				arrayResult[i][j] = arrayFirst[i]*arraySecond[j];
				System.out.print(arrayResult[i][j]+" ");
			}
			System.out.println();
		}
		
	return arrayResult;
	}
	public void maxMinMatrixLine(int[][]arrayResult) {
		for (int i= 0;i<arrayResult.length;i++) {
			int min = arrayResult[i][0];
			int max =arrayResult[i][0];
			for (int j =0; j<arrayResult[i].length;j++) {
				if(arrayResult[i][j] < min) {
					min= arrayResult[i][j];
				}
				if(arrayResult[i][j] > max) {
					max= arrayResult[i][j];
				}
			}
			System.out.println("Min in line: "+ min +". Max in line: "+max);
		}
		
		
}
	/*Given a square matrix 
	 * of numbers. Write a program 
	 * that swaps the elements 
	 * on the main and side diagonals,
	 *  while each element must remain in the same 
	 * column (that is, in each column,
	 *  you need to 
	 * swap the element on the main
	 *  diagonal and on the side diagonal).*/
	public int[][] changeDiagonal(int[][]arrayResult){
		for(int i= 0;i<arrayResult.length;i++) {
			for (int j=0;j<arrayResult[i].length;j++) {
				int temp=0;
				if(i==j) {
					temp=arrayResult[arrayResult.length-1-i][j];
					arrayResult[arrayResult.length-1-i][j]= arrayResult[i][j];
					arrayResult[i][j]=temp;
				}
			}
		}
		
		return arrayResult;
	}
		
}

