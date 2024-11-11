import java.io.*;

class fileReader{
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            reader.readLine();
            System.out.println(reader.readLine());
            reader.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}