package harb;

public class RandomElementWeight {
	private int[]arrayValue;
	private int[]arrayWeight;
	
public RandomElementWeight(int[] arrayValue, int[] arrayWeight) {		
		this.arrayValue = arrayValue;
		this.arrayWeight = arrayWeight;		
	}
public int numberFromArray() {
	int arrayValueLenght = sumElementsArray();
	int[] arrayResult = new int[arrayValueLenght];
	int count=0;
	 for (int i = 0; i <arrayWeight.length; i++) {
		 int elementArrayWeight = arrayWeight[i];
		 while(elementArrayWeight!=0) {
		 arrayResult[count]= arrayValue[i];
		 elementArrayWeight--;
		 count++;		 
	}}
	return randomFromArray(arrayResult);
}

private int sumElementsArray() {
	int sum = 0;
	for(int a: arrayWeight) {
		sum+=a;
	}
	return sum;
}
private int randomFromArray(int [] arrayResult ) {
	int result = (int)Math.floor(Math.random()*(arrayResult.length));
	return arrayResult[result];
	
}
}
