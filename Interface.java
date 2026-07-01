interface animal{
    void sound();
}
class dog implements animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
public class Interface{
    public  static void main(String[]args){
        dog d = new dog();
        d.sound();
    }
}