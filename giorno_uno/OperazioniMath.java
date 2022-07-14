package giorno_uno;

import java.util.Arrays;

public class OperazioniMath {
	private int countNumeri;
	private int[] arrayNumbers= new int[countNumeri];
	
	
	//metodi setters
	public void setCountNumeri(int a) {
		countNumeri = a;}
	public void setNumeroToArray(int[] num) {
		arrayNumbers= Arrays.copyOf(num,num.length);
	}
	
	//string array to int numbers array
	public int[] strArrayToIntArray(String[] stringArrayNumbers) {
		int [] numbers= new int[stringArrayNumbers.length];
		for(int i = 0; i < stringArrayNumbers.length; i++)
		{
			numbers[i] = Integer.parseInt(stringArrayNumbers[i]);
		}
	return numbers;
	}

	

	
	//operazioni math
	public int somma() {
		int sum = 0;
		for (int i = 0; i < arrayNumbers.length; i++) {
			sum+=arrayNumbers[i];
		}
		return sum;
	}
	
    public double media() {
    	int sum = 0;
		for (int i = 0; i < arrayNumbers.length; i++) {
			sum+=arrayNumbers[i];
		}
		return (sum/(arrayNumbers.length*1.0));
		
	}
    public long prodotto() {
    	long pr =1;
    	for (int i = 0; i < arrayNumbers.length; i++) {
			pr=pr*arrayNumbers[i];
		}
    	return pr;
    }
    public int minore() {
    	int min = arrayNumbers[0];
    	for(int i = 0; i<arrayNumbers.length; i++) {
    		if (arrayNumbers[i]<min) {
    			min= arrayNumbers[i];
    		}
    	}
    	return min;
    }
    public int maggiore() {
    	int max = arrayNumbers[0];
    	for(int i = 0; i<arrayNumbers.length; i++) {
    		if (arrayNumbers[i]>max) {
    			max= arrayNumbers[i];
    		}
    	}
    	return max;
    }
}
