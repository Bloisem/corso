package alishev.day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Player {
	private ArrayList[] allSongs;

	public ArrayList<MusicBand> groupsAfterYear(int year, ArrayList<MusicBand> bands) {
		ArrayList<MusicBand> resultBands = new ArrayList<>();
		for (MusicBand a : bands) {
			if (a.getYear() >= year) {
				resultBands.add(a);
			}
		}
		return resultBands;
	}

	public ArrayList<String> allSongs(ArrayList<MusicBand> bands) {
		ArrayList<String> result = new ArrayList<>();
		for (MusicBand band : bands) {
			result.addAll(Arrays.asList(band.getSongs()));
		}
		return result;
	}

	public ArrayList<String> languageSong(ArrayList<MusicBand> bands, Language a) {
		ArrayList<String> resultLanguageSong = new ArrayList<>();
		for (int i = 0; i < bands.size(); i++) {
			if (bands.get(i).getLanguage().equals(a)) {
				resultLanguageSong.addAll(Arrays.asList(bands.get(i).getSongs()));
			}
		}
		return resultLanguageSong;
	}

	public String playlistForToday(ArrayList<MusicBand> bands, int a) {
		ArrayList<String> resultPlaylist = allSongs(bands);
		Collections.shuffle(resultPlaylist);
		String[] array = resultPlaylist.toArray(new String[a]);
		return Arrays.toString(Arrays.copyOf(array, a));
	}

}
