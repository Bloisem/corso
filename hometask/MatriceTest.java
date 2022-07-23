package hometask;

public class MatriceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrice matrice = new Matrice();
		int[]arrayFirst = {1,2,3,4,5};
		int[]arraySecond = {1,10,100,1000,10000};
				
		int[][] arrayResult = matrice.createMatrice(arrayFirst, arraySecond);
		matrice.toString(arrayResult);	
		
		//test change diagonal metod
		System.out.println("\n Swap elements main and side diagonals");
		arrayResult = matrice.changeDiagonal(arrayResult);
		matrice.toString(arrayResult);
			
		//test mirrorMatrixHorizontalAsis
		System.out.println("\n Mirror the matrix along the horizontal axis: ");
		arrayResult = matrice.mirrorMatrixHorizontalAxis(arrayResult);
		matrice.toString(arrayResult);	
		
		//test min max in line metod
		System.out.println("Print min and max in line");
		matrice.maxMinMatrixLine(arrayResult);
	
		//test rotate matrix 90 clockwise
	//	System.out.println("Rotate matrix 90° clockwise");
	//	arrayResult = matrice.rotate90clockwise(arrayResult);
	//	matrice.toString(arrayResult);
		
	

	}

	
	}


