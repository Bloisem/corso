package giococarte;

public class Carta {
	private SemeCarta semeCarta;
	private ValoreCarta valoreCarta;

	public Carta(SemeCarta semeCarta, ValoreCarta valoreCarta) {
		this.semeCarta = semeCarta;
		this.valoreCarta = valoreCarta;
	}

	public SemeCarta getSemeCarta() {
		return semeCarta;
	}

	public void setSemeCarta(SemeCarta semeCarta) {
		this.semeCarta = semeCarta;
	}

	public ValoreCarta getValoreCarta() {
		return valoreCarta;
	}

	public void setValoreCarta(ValoreCarta valoreCarta) {
		this.valoreCarta = valoreCarta;
	}

}