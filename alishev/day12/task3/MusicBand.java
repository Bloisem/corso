package alishev.day12.task3;

public class MusicBand {
	private String name;
	private int year;
	private Language language;
	private String[] songs;

	// costruttori
	public MusicBand(String name, int year, Language language, String... songs) {
		this.name = name;
		this.year = year;
		this.songs = songs;
		this.language = language;

	}

	public MusicBand() {
	}

	// getters, setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String[] getSongs() {
		return songs;
	}

	public void setSongs(String[] songs) {
		this.songs = songs;
	}

	@Override
	public String toString() {
		return "name: " + name + " year: " + year;
	}

}
