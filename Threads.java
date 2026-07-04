// java.lang.Thread;

class MyThread extends Thread{
    public void run(){
        System.out.println("Threading");
    }
}

public class Threads{
    public static void main(String[]args){
        MyThread t = new MyThread();
        t.start();
    }
}