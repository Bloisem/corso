package hometask;

public class MatriceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrice matrice = new Matrice();
		int[]arrayFirst = {1,2,3,4,5};
		int[]arraySecond = {1,10,100,1000,10000};
		
		
		int[][] arrayResult = matrice.createMatrice(arrayFirst, arraySecond);
		System.out.println();
		System.out.println("Swap elements main and side diagonals");
		 int[][] arrayChanged =matrice.changeDiagonal(arrayResult);
		
		for (int i = 0; i < arrayChanged.length; i++) {
			for (int j = 0; j < arrayChanged[i].length; j++) {
				System.out.print(arrayChanged[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Print min and max in line");
		matrice.maxMinMatrixLine(arrayResult);
		

	}

	
	}


