package selectionsort;

public class SelectionSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		int []startArray = {100, 1,2,3,4,8,29,-96,-41,2,7,6,5,-100};
		
		//elaborazione
		SelectionSort sortSelectionArray = new SelectionSort();
		int [] resultArray =sortSelectionArray.selectionSort(startArray, false); //crescente true, decrescente false
		sortSelectionArray.printArray(resultArray);

	}

	

}
