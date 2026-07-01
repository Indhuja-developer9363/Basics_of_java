class calculator{
    int mul(int a,int b){
        return a*b;
    }
    int mul(int a,int b,int c){
        return a*b*c;
    }
    double mul(double a,double b){
        return a*b;
    }
}
public class Poverloading{
    public static void main(String[]args){
        calculator ca = new calculator();
        System.out.println(ca.mul(2,3));
        System.out.println(ca.mul(2,3,4));
        System.out.println(ca.mul(2.0,3.0));
    }
}