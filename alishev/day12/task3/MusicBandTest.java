package alishev.day12.task3;

import java.util.ArrayList;

public class MusicBandTest {

	public static void main(String[] args) {
		ArrayList<MusicBand> musicBand = new ArrayList<>();
		Player player = new Player();
		musicBand.add(new MusicBand("Queen", 1970, Language.ENGLISH, "Killer Queen", "Bohemian Rhapsody",
				"Under Pressure", "Another One Bites The Dust", "We Are The Champions", "Don’t Stop Me Now",
				"I Want It All", "Innuendo", "The Show Must Go On", "Play the Game", "Princes of the Universe",
				"I Want to Break Free ", " I Was Born To Love You", "Love Of My Life", "Living On My Own"));
		musicBand.add(new MusicBand("Depeche Mode", 1980, Language.ENGLISH, "Personal Jesus", "Enjoy The Silence",
				"A Question of Lust "));
		musicBand.add(new MusicBand("Led Zeppelin", 1968, Language.ENGLISH, "Whole Lotta Love", "Stairway to Heaven",
				"Kashmir"));
		musicBand.add(new MusicBand("Pink Floyd", 1965, Language.ENGLISH, "Another Brick In The Wall", "Time",
				"Shine On You Crazy Diamond", "Hey Hey Rise Up"));
		musicBand.add(new MusicBand("System of a Down", 1995, Language.ENGLISH, "Chop Suey!", "Toxicity", "Lonely Day",
				"Aerials", "Sky Is Over", "Lie Lie Lie"));
		musicBand.add(new MusicBand("Vasco Rossi", 1977, Language.ITALIAN, "Come Nelle Favole", "Siamo Soli", "Vivere",
				"Sally", "Albachiara", "Vita Spericolata", "Una Canzone per Te", "Ogni Volta", "Il Mondo Che Vorrei",
				"La Compagnia", "Generale", "Non l'hai mica capito", "La nostra relazione", "Dormi, dormi"));
		musicBand.add(new MusicBand("Marco Masini", 1990, Language.ITALIAN, "Vaffanculo", "T'innamorerai",
				"Principessa", "Ci vorrebbe il mare", "Bella stronza"));
		musicBand.add(new MusicBand("Maneskin", 2016, Language.ITALIAN, "Amandoti", "Chosen",
				"We're Gonna Dance on Gasoline"));
		musicBand.add(new MusicBand("Leonard Cohen ", 1956, Language.ENGLISH, "Hallelujah", "Suzanne", "Who By Fire"));
		musicBand.add(new MusicBand("Ukraine", 1990, Language.UKRAINIAN, "Vona", "Koly do gub tvoih", "SHUM",
				"Ty vtrete ciogo lita zacvitesh", "Bilya topoli", "Bude nam z toboyu sho zgadaty"));
		musicBand
				.add(new MusicBand("DDT", 1980, Language.RUSSIAN, "Chto takoe osen", "Eto vse", "Ty ne odin", "Dozhd"));
		musicBand.add(new MusicBand("SingleSong", 1960, Language.ENGLISH, "Zombie", "Still Loving You ",
				"Wind Of Change", "It's My Life"));
		System.out.println(musicBand);
		System.out.println(player.groupsAfterYear(1980, musicBand));
		System.out.println(player.allSongs(musicBand).toString());
		System.out.println(player.languageSong(musicBand, Language.ITALIAN));
		System.out.println(player.playlistForToday(musicBand, 10));
		System.out.println(player.playlistForToday(musicBand, 5));

	}

}
