import java.util.*;
import java.io.*;


public class Dictionary {

    HashSet<String> dict;
    File f;
    Scanner s;

    public Dictionary(String filename) {
        dict = new HashSet<String>();
        try {
            f = new File(filename);
            s = new Scanner(f);
            while (s.hasNextLine()) {
                dict.add(s.nextLine());
            }
        }
        catch(FileNotFoundException e) {
            System.err.println("File not found");
            System.exit(1);
        }
    }


    public boolean checkWord(String word) {
        if (dict.contains(word)) return true;
        else return false;
    }

}