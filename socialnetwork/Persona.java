package socialnetwork;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Persona {
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private int eta;
	private Nazionalita nazionalita;
	private Sesso sesso;

	public Persona(String nome, String cognome, int year, int mounth, int date, Sesso sesso, Nazionalita nazionalita) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = LocalDate.of(year, mounth, date);
		this.eta = Period.between(dataNascita, LocalDate.now()).getYears();
		this.nazionalita = nazionalita;
		this.sesso = sesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public Nazionalita getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(Nazionalita nazionalita) {
		this.nazionalita = nazionalita;
	}

	public Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nome);
		builder.append(" ");
		builder.append(cognome);
		return builder.toString();
	}

	public int differenzaEta(Persona persona) {
		return differenzaEta(persona, this);

	}

	public static int differenzaEta(Persona persona, Persona persona2) {

		int dif = Math.abs((persona.getDataNascita().getYear() - persona2.getDataNascita().getYear()));
		return dif;
	}

	public long giorniMancanti() {
		LocalDate oggi = LocalDate.now();
		LocalDate compleanno = LocalDate.of(oggi.getYear(), dataNascita.getMonth(), dataNascita.getDayOfMonth());
		long giorniMancanti;
		if (oggi.equals(compleanno)) {
			giorniMancanti = 0;
		} else if (oggi.isBefore(compleanno)) {
			giorniMancanti = ChronoUnit.DAYS.between(oggi, compleanno);
		} else {
			LocalDate compleannoNextYear = LocalDate.of(oggi.getYear() + 1, compleanno.getMonth(),
					compleanno.getDayOfMonth());
			giorniMancanti = ChronoUnit.DAYS.between(oggi, compleannoNextYear);

		}

		return giorniMancanti;
	}

}