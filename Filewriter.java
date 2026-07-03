import java.io.FileWriter;
import java.io.IOException;

public class Filewriter{
    public static void main(String[]args){
        try{
            FileWriter writer = new FileWriter("student1.txt");

            writer.write("Name:John\n");
            writer.write("Age:20\n");
            writer.write("Department:CSE");

            writer.close();

            System.out.println("Data Written");
        }
        catch(IOException e){
            System.out.println("An error occur");
            e.printStackTrace();
        }
    }
}