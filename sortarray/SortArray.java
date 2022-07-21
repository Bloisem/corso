
package sortarray;

public class SortArray {

	public int[] ordinaArray(int[] myArray, boolean crescente) {
		int temp = myArray[0];
		for (int i = 0; i < myArray.length; i++) {
			{
				boolean isSorted = true; 
				for (int j = 0; j < myArray.length - 1 - i; j++) {
					if ((crescente == true && (myArray[j] > myArray[j + 1]))
							|| (crescente == false && (myArray[j] < myArray[j + 1]))) {
						temp = myArray[j];
						myArray[j] = myArray[j + 1];
						myArray[j + 1] = temp;
						isSorted = false; 
					}

				}
				if (isSorted) {
					break; 
				}

			}
		}
		return myArray;
	}

	public String arrayToString(int[] myArray) {
		String str = "[";
		for (int i = 0; i < myArray.length; i++) {
			if (i == myArray.length - 1) {
				str += myArray[i];
			} else {
				str += (myArray[i] + ", ");
			}
		}
		str += "]";
		return str;
	}

}
