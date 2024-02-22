public class bai8_baitap {
    public static void main(String[] args) {
        int a = 6;

        //A a+=3
        System.out.println("Result A: "+(a+=3));
        System.out.println();
        //a = 6;

        //B a-=5
        System.out.println("Result B: "+(a-=5));
        System.out.println();
        //a = 6;

        //C a*=2
        System.out.println("Result C: "+(a*=2));
        System.out.println();
        //a = 6;

        //D a%=5
        System.out.println("Result D: "+(a%=5));
        System.out.println();
        //a = 6;

        //E b = 2, rút gọn a = a - (b+7)
        int b = 2 ;
        System.out.println("Result E: "+(a-=(b+7)));
    }
}
