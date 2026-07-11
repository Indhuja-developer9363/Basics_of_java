// class Demo implements Runnable{
//     public void run(){
//         System.out.println("Runnable Thread");
//     }
// }
// public class Threadinterface{
//     public static void main(String[]args){
//         Demo d = new Demo();
//         Thread t = new Thread(d);
//         t.start();
//     }
// }

class MessageTask implements Runnable{
    public void run(){
        System.out.println("Learning Java Multithreading");
    }
}
public class Threadinterface{
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
        MessageTask d = new MessageTask();
        Thread t = new Thread(d);
        t.start();
        }
    }
}