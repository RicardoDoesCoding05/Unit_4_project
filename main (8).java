import java.io.File;
import java.util.Scanner;
public class Main{
    public static void main(String args[]) throws Exception{
        File file = new File("top100streams.txt");
        Scanner text = new Scanner(file);
        while(text.hasNextLine()){
        	System.out.println(text.nextLine());
            Song music = new Song();
            System.out.println(music.toString());
            titl
        	
        }
     
    }
}