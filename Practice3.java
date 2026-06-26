import java.util.HashMap;

public class Practice3{
    public static void main(String[]args){

        HashMap <Integer,String> employee = new HashMap <>();
        employee.put(10000,"Dhivya");
        employee.put(10500,"Dharshini");
        employee.put(23000,"Preethika");
        employee.put(24000,"Thenu");

        System.out.println(employee);
        System.out.println(employee.containsKey(4));
        System.out.println(employee.containsValue("Thenu"));
        System.out.println(employee.size());
    }
}