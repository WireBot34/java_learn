
import java.io.*;

public class fileWrite {

    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Secret things!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
