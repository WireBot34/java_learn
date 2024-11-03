import java.util.*;
import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException{
        String str = "Text to the file";
        FileWriter fw = new FileWriter("out.txt");

        for(int i=0;i<str.length();i++){
            fw.write(str.charAt(i));       
        }
        fw.close();
        
    }
}
