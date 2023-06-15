import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class pro14{
    public static void main(String[] args) throws FileNotFoundException , IOException {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the file name ");
        String name = cin.nextLine();
        BufferedReader br = new BufferedReader(new InputStreamReader( new  FileInputStream( new File( name))));
        String line;
        int countLines =0;
        int countWords =0;
        int countCharacters =0;
        while((line = br.readLine()) != null){
            System.out.println(line);
            countLines++;
             String s []=   line.split(" ");
             countWords += s.length;
             for(String word : s){
                 countCharacters += word.length();
             }
        }
        System.out.println("Number of lines = " + countLines);
        System.out.println("Number of words = " + countWords);
        System.out.println("Number of characters = " + countCharacters);
        cin.close();
    }
}
