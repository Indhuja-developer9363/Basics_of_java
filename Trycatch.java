public class Trycatch{
    public static void main(String[]args){
        try{
            int age = 15;
            if(age < 18){
                throw new Exception("Age must be at least 18");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}