import java.io.*;
import java.io.IOException;
public class Filehandling{
    public static void main(String[]args){
        try{
            File file = new File("student2.txt");
            if(file.createNewFile()){
                System.out.println("File Created");
            }
            else{
                System.out.println("File Already exists");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}