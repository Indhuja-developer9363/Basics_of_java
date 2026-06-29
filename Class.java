// class Cart{
//     static int flatDiscount = 0;
//     static int minBill = 100;
// }
// class Class{
//     public static void main(String[]args){
//         System.out.println(Cart.flatDiscount);
//         System.out.println(Cart.minBill);
//     }
// }

//USING OBJECT

class Cart{
    static int flatDiscount = 0;
    static int minBill = 100;
}
class Class{
    public static void main(String[]args){
        Cart cart1 = new Cart();
        System.out.println(cart1.flatDiscount);
        System.out.println(cart1.minBill);
    }
}