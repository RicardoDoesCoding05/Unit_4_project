import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("top100streams.txt");
        Scanner text = new Scanner(file);

        while (text.hasNextLine()) {
            String line = text.nextLine()+1;
            int titlePos = line.indexOf("|")+1;
            int artistPos = line.indexOf("|", titlePos);
            System.out.println(titlePos);
            System.out.println(artistPos);
            
            // Song music = new Song(songName, artistName, albumName, yearName);
            // System.out.println(music.toString());
        }
        
    }
}
