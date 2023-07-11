import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class File{
 
    public static void main(String[] args) {
 
        try {
            FileWriter writer = new FileWriter("file1.txt",true);
            writer.write("Java is a widely-used programming language for coding web applications.");
            writer.close();
            FileReader reader = new FileReader("file1.txt");
            BufferedReader br= new BufferedReader(reader);
            String line;
            System.out.println("---Data from the file---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            System.out.println("-----Error-----");
        }
 
    }
 
}
