import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class pro15{
    public static void main(String[] args) throws FileNotFoundException , IOException {
        Scanner cin = new Scanner(System.in);
        System.out.println(" Enter the file name to write");
        BufferedWriter fout = new BufferedWriter(new  OutputStreamWriter( new FileOutputStream(new File( cin.next()))));
        System.out.println("Enter the text to write");
        String s ;
        while((s=cin.nextLine()) !=null && ( !s.equals("exit"))){
            fout.write(s);
            fout.newLine();
            s=null;
        }
         
  fout.close();
  cin.close();
    }
    
}
