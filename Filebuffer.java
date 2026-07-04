import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filebuffer {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("student2.txt"));

            
            }

            br.close();
         catch (IOException e) {
            System.out.println();
        }
    }
}
