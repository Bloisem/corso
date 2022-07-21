package sortarray;


public class SortArrayTest {

	public static void main(String[] args) {
		int[] myArray = {100,1,2,3,4,5};
		SortArray sortMyArray = new SortArray();		

		sortMyArray.ordinaArray(myArray, true); //true per crescente, false decrescente
		System.out.println(sortMyArray.arrayToString(myArray));

	}

}
