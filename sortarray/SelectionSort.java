package selectionsort;

public class SelectionSort {
	
	public int[] selectionSort(int []startArray, boolean crescente) {
	for (int i = 0; i<startArray.length-1;i++) {	
		int pos= startArray[i];
		int temp= pos;
		int j =i+1;
		while(j!=startArray.length) {
			if(pos > startArray[j]&& crescente ==true || pos < startArray[j]&& crescente ==false) {
				temp = pos;
				pos = startArray[j];
				startArray[j] = temp;
			}
		j++;
		
		}
		
		startArray[i]=pos;
		
		
	}
	return startArray;

}
	public void printArray(int[] resultArray) {
		for(int i=0;i<resultArray.length;i++) {
			System.out.print(resultArray[i]+" ");
		}
	}
	}
