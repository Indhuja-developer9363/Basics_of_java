import java.io.FileWriter;
import java.io.IOException;

public class Filewriter{
    public static void main(String[]args){
        try{
            FileWriter writer = new FileWriter("student1.txt",true);

            writer.write("Name:John\n");
            writer.write("Age:20\n");
            writer.write("Department:CSE");
            writer.write("Marks:98");

            writer.close();

            System.out.println("Data Written");
        }
        catch(IOException e){
            System.out.println("An error occur");
            // e.printStackTrace();
        }
    }
}