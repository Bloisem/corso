package alishev.day12.task3;
import java.util.ArrayList;
import java.util.Collections;

public class MusicBandTest {

	public static void main(String[] args) {
		ArrayList <MusicBand> musicBand = new ArrayList<>();
		musicBand.add(new MusicBand("Queen",1970));
		musicBand.add(new MusicBand("Depeche Mode",1980));
		musicBand.add(new MusicBand("Led Zeppelin",1968));
		musicBand.add(new MusicBand("Pink Floyd",1965));
		musicBand.add(new MusicBand("System of a Down",1995));
		musicBand.add(new MusicBand("Negramaro",2000));
		musicBand.add(new MusicBand("Boomdabash",2002));
		musicBand.add(new MusicBand("Maneskin",2016));
		musicBand.add(new MusicBand("Plach Yeremiyi",1990));
		musicBand.add(new MusicBand("BoomBox ",2004));
		musicBand.add(new MusicBand("Okean Elzy",1994));
		musicBand.add(new MusicBand("La Rappresentante di Lista", 2011));
		musicBand.add(new MusicBand("DDT",1980));
		System.out.println(musicBand);
		Collections.shuffle(musicBand);
		System.out.println(musicBand);
		System.out.println(groupsAfter2000(musicBand));
		
	}
		public static ArrayList<MusicBand> groupsAfter2000(ArrayList<MusicBand>
		bands){
			ArrayList<MusicBand>resultBands = new ArrayList<>();
			for(MusicBand a:bands) {
				if (a.getYear()>=2000) {
					resultBands.add(a);
				}
			}
			return resultBands;
		
		

	}

}
