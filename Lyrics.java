
import java.lang.StringBuffer;

public class Lyrics {
	
	//String line;
	StringBuffer lyrics;
	int bottleNumber;

	Lyrics(){
		this.bottleNumber = 99;
	}
	
	private StringBuffer makeVerse(int bottleNumber) {
		String line1 = null;
		String line2 = null;
		StringBuffer verse = new StringBuffer();
		
		while (bottleNumber != 0) {
			line1 = bottleNumber + " bottles of beer on the wall, " + bottleNumber + " bottles of beer.";
			verse.append(line1);
			verse.append(System.lineSeparator());
			bottleNumber = bottleNumber - 1;
			if (bottleNumber != 0) {
				line2 = "Take one down and pass it around, " + bottleNumber + " bottles of beer on the wall.";
			}
			else {
				line2 = "Take one down and pass it around, no more bottles of beer on the wall.";
			}
			
			verse.append(line2);
			verse.append(System.lineSeparator() + System.lineSeparator());
		}
		
		String last_verse = "No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
				"Go to the store and buy some more, 99 bottles of beer on the wall.";
		verse.append(last_verse);

		return verse;
	}

	private void createLyrics() {
		this.lyrics = new Lyrics().makeVerse(this.bottleNumber);
	}

	public StringBuffer getLyricsOfSong() {
		Lyrics lyric = new Lyrics();
		lyric.createLyrics();
		return lyric.lyrics;
	}

}
