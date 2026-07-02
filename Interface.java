// interface animal{
//     void sound();
// }
// class dog implements animal{
//     public void sound(){
//         System.out.println("Dog barks");
//     }
// }
// public class Interface{
//     public  static void main(String[]args){
//         // dog d = new dog();
//         // d.sound();

//         animal a = new dog();
//         a.sound();
//     }
// }

interface Camera{
    void click();
}

interface MusicPlayer{
    void  playMusic();
}
class Phone implements Camera,MusicPlayer{
    public void click(){
        System.out.println("Photo clicked");
    }
    public void playMusic(){
        System.out.println("Playing music");
    }
}
public class Interface{
    public static void main(String[]args){
        Phone p = new Phone();
        p.click();
        p.playMusic();
    }
}

