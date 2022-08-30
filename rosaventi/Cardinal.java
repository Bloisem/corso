package rosaventi;

public enum Cardinal {
	N("Nord"), NNE("Nord Nord Est"), NE("Nord Est"), ENE("Est Nord Est"), E("Est"), ESE("Est Sud Est "), SE("Sud Est"),
	SSE("Sud Sud Est"), S("Sud"), SSO("Sud Sud Ovest"), SO("Sud Ovest"), OSO("Ovest Sud Ovest"), O("Ovest"),
	ONO("Ovest Nord Ovest"), NO("Nord-Ovest"), NNO("Nord-Nord-Ovest");

	private String nome;

	Cardinal(String nome) {
		this.nome = nome;
	}

	public boolean isOpposite(Cardinal start) {
		int opposto;
		if (this.ordinal() + (Cardinal.values().length / 2) < Cardinal.values().length - 1) {
			opposto = this.ordinal() + (Cardinal.values().length / 2);
		} else {
			opposto = this.ordinal() % (Cardinal.values().length / 2);
		}
		if (start.ordinal() == opposto) {
			System.out.println(this + " e " + start + " sono i punti diametralmente opposti");
			return true;
		} else {
			System.out.println(this + " e " + start + " non sono i punti diametralmente opposti");
			return false;

		}
	}

	public static Cardinal mix(Cardinal punto1, Cardinal punto2) {
		Cardinal[] cardinalArray = Cardinal.values();
		if (Math.abs(punto1.ordinal() - punto2.ordinal()) < 2
				|| Math.abs(punto1.ordinal() - punto2.ordinal()) == cardinalArray.length / 2) {
			System.out.println("I dati inseriti non sono validi");
			System.exit(5);
			return null;
		} else if (Math.abs(punto1.ordinal() - punto2.ordinal()) < cardinalArray.length / 2) {
			return cardinalArray[(punto1.ordinal() + punto2.ordinal()) / 2];
		}
		else{
			int primoPunto = Math.max(punto1.ordinal(),punto2.ordinal());
			int secondoPunto=Math.min(punto1.ordinal(),punto2.ordinal());
			int differenza = (cardinalArray.length-primoPunto + secondoPunto)/2;
			return(cardinalArray[(differenza+primoPunto)%cardinalArray.length]);
		}
		
	}

	@Override
	public String toString() {

		return nome;
	}

}
