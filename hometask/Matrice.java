package hometask;

public class Matrice {
	
	//create matrix with 2 arrays
	public int[][] createMatrice(int[] arrayFirst, int[] arraySecond) {
		int [][]arrayResult = new int[arrayFirst.length][arraySecond.length];
		for (int i= 0;i<arrayFirst.length;i++) {
			for(int j= 0; j<arraySecond.length; j++) {
				arrayResult[i][j] = arrayFirst[i]*arraySecond[j];
			}
		}
		
	return arrayResult;
	}
	
	//print matrix	
		public void toString(int[][] matrix){
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
		}
	
	//max min in line of matrix
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
	
	/*Given a square matrix of numbers. Write a program 
	 * that mirrors its elements about the horizontal axis of symmetry	
	 */
	public int[][] mirrorMatrixHorizontalAxis(int[][] startMatrix)
	{
		for (int i = 0;i<startMatrix.length/2;i++)
		{
			for (int j= 0; j<startMatrix[i].length; j++) {
					int temp = startMatrix[i][j];
					startMatrix[i][j]= startMatrix[startMatrix.length-1-i][j];
					startMatrix[startMatrix.length-1-i][j]=temp;
			}
		}
		return startMatrix;
	}
	/*
	 * Write a program that rotates a square matrix of numbers by 90 clockwise.
	 */
	public int[][] rotate90clockwise(int[][] startMatrix)
	{
		for (int i = 0;i<startMatrix.length;i++)
		{
			for (int j= 0; j<startMatrix[i].length; j++) {
					int temp = startMatrix[i][j];
					startMatrix[i][j]= startMatrix[startMatrix.length-1-i][startMatrix.length-1-j];
					startMatrix[startMatrix.length-1-i][startMatrix.length-1-j]=temp;
			}
		}
		return startMatrix;
	}
	
}
