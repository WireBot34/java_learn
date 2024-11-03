import java.util.*;
import java.io.*;

public class ReadFile {

    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("out.txt");
            BufferedReader br = new BufferedReader(fr);

            String s = br.readLine();
            if(s==null){
                System.out.println("Empty");
                System.exit(0);
            }
            while (s!=null) {
                System.out.println(s);
                System.exit(0);
            }
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
    
}