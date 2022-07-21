package lotto;


public class Lotto {
private	int[]numeriLotto = new int[5];
	
	
public int [] generaNumeriLotto () {
	 int j=0;
	 int [] numeriLotto = new int[5];
	 
	 
	 while (j!=5) {
		 boolean isRepeat =false;
		 int numeroSingoloLotto = (int) Math.floor(Math.random()*(90)+1);
		 for (int i = 0; i <= j; i++) {
				if (numeriLotto[i] == numeroSingoloLotto) {
					isRepeat = true;
					break;
				}
			}

			if (!isRepeat) {
				numeriLotto[j] = numeroSingoloLotto;
					j++;

				}
		 
	 }
	 return numeriLotto;
 }
 public String controllaVincita(int []array, int [] numeriLotto) {
	 
	 int CountNumeriVincenti = 0;
	 String result = "";
	 for (int i = 0; i<array.length; i++)
	 {
		 for (int j= 0; j<numeriLotto.length; j++) {
			 if (array[i]==numeriLotto[j])
			 {
				 CountNumeriVincenti++;
			 }
		 }
	 }
	 boolean resultB =false;
	 switch(CountNumeriVincenti) {
	  case 2:
	    result ="Ambo";
	    break;
	    
	  case 3:
		  result ="Terno";
	    break;
	  case 4:
		  result ="Quaterna";
		  System.out.println("Quaterna");
		 
		   break;
		   
	  case 5:
		  result = "Cinquina";
		  
		   break;
	  default:
	    result = "Mi dispiace non hai vinto";
	}
	 for(int i= 0;i<numeriLotto.length;i++) {
		 System.out.print(numeriLotto[i]+ " ");
	 }
	 System.out.println();
	 return result;
 }
}
