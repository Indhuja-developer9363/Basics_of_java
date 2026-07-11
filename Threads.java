// java.lang.Thread;

// class MyThread extends Thread{
//     public void run(){
//         System.out.println("Threading");
//     }
// }

// public class Threads{
//     public static void main(String[]args){
//         MyThread t = new MyThread();
//         t.start();
//     }
// }

//class MyThread extends will created by us
//Thread - default so we cannot create class(parent) and also the Thread should start with capital letter
//run() start() - default

// class MyThread extends Thread{
//     public void run(){
//         System.out.println("Threading");
//     }
// }

// public class Threads{
//     public static void main(String[]args){
//         MyThread t = new MyThread();
//         t.start();//the output order is unpredictable
//         System.out.println("Main thread"); //its print the output simultaneously
//     }
// }

//  class NumberThread extends Thread{
//     public void run(){
//         for(int i=1;i<=10;i++){
//             System.out.println(i);
//         }
//     }
// }
// public class Threads{
//     public static void main(String[]args){
//         NumberThread t = new NumberThread();
//         t.start();
//     }
// }

class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
        System.out.println(i);
        try{
        Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        }
    }
}

public class Threads{
    public static void main(String[]args){
        MyThread t = new MyThread();
        t.start();
        t.setName("Counter Thread");
        System.out.println(get.getName());
        t.join("Execution Completed");
    }
}