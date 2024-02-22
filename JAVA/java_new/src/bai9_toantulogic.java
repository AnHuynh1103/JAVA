public class bai9_toantulogic {
    public static void main(String[] args) {
        /*int i = -1;
        // kiểm tra i>0 và i<10
        System.out.println("i>0 && i<10: "+(i>0&&i<10));

        // kiểm tra i<0 hoặc i>10
        System.out.println("i<0 || i>10: "+(i<0||i>10));

        //phép phủ định
        System.out.println("!(i<0 || i>10:) "+(!(i<0||i>10)));
        System.out.println();
        //toán tử tiền tố hậu tố
        int x = 100;
        int y = 90;
        int z = 80;
        int t = 70;

        x++;
        ++y;
        z--;
        --t;

        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
        System.out.println("t = "+t);
        */
        int a = 1;
        int b = 2;
        int c = a++ - ++b +1;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}
