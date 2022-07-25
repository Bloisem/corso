package carapp;

public class Car {
	private double resaCarburante;
	private double quantitaCarburante;
	private int serbatoio = 40;
	private double percorso;
	private double kmPercorsi;
	
	//costruttore
	public Car(double resaCarburante) {
		this.resaCarburante = resaCarburante;
	}
	
	public Car(double resaCarburante, int serbatoio) {
		this(resaCarburante);
		this.serbatoio = serbatoio;
	}
	
	//setter, getter
	public double getQuantitaCarburante() {
		return quantitaCarburante;
	}

	public void setQuantitaCarburante(double quantitaCarburante) {
		this.quantitaCarburante = quantitaCarburante;
	}
	
	public int getSerbatoio() {
		return serbatoio;
	}

	public void setSerbatoio(int serbatoio) {
		this.serbatoio = serbatoio;
	}
	
	public double getKmPercorsi() {
		return kmPercorsi;
	}
	public void setKmPercorsi(double kmPercorsi) {
		this.kmPercorsi = kmPercorsi;
	}

	public double getPercorso() {
		return percorso;
	}

	public void setPercorso(double percorso) {
		this.percorso = percorso;
	}



	//metodi di elaborazione 
	
	public void addCarburante(double quantitaCarburante) {
		if(quantitaCarburante < 0) {
			System.out.println("Errore, non puio caricare " + quantitaCarburante);			
		}
		else {
		this.quantitaCarburante += quantitaCarburante;
		percorso+=(quantitaCarburante*resaCarburante);
		}
	}
	public double drive(Car car) {
		if(percorso-kmPercorsi<0) {
			System.out.println("Errore, con la tua quantità di carburante non puio fare solo" + percorso+ " km");
			percorso = 0;
			quantitaCarburante=0;
		}
		percorso -=kmPercorsi;
		if(percorso<0) {
			System.out.println();
		}
		quantitaCarburante=percorso/resaCarburante;
		return (quantitaCarburante);
		
	}

	
	
	

	
}
