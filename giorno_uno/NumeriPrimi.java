package giorno_uno;

public class NumeriPrimi {
	private int numeroInserito;
	
	
	public void setNumeroInserito(int a) {
		if (a<1) {
			System.out.println("Inserisci il numero maggiore di 0!");
		}
		numeroInserito = a;
	}
	public String verificaNumeroPrimo() {
		int count = 0;
		if (numeroInserito == 1) {
			return "Il numero non é primo! ";
		}
		else {
		for(int i = 1; i<=numeroInserito; i++) {
			
			if(numeroInserito%i==0) {
				count++;
			}
		
		}
		
		}
		return count==2?"Il numero è primo!":"Il numero non é primo! ";
}
	public String divisoriPositivi() {
		StringBuilder temp = new StringBuilder();
		StringBuilder temp1 = new StringBuilder();
		int count = 0;
		
		for(int i = 2; i<numeroInserito; i++) {
			if(numeroInserito%i==0) {
				count++; 
				temp.append(i).append(" ");
			}
		}
		if(count ==0) {
			temp1.append("Il numero non ha divisori positivi!");
		}
		else {
			temp1.append("Il numero ha ").append(count).append(" divisori, ").append("e sono ").append(temp);
			 
		}
		return temp1.toString();
	}
}