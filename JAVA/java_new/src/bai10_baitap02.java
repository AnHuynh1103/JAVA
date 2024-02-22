import java.util.Scanner;

public class bai10_baitap02 {
    public static void main(String[] args) {
        System.out.println("Hãy nhập chiều dài hcn = ");
        double chieuDai = new Scanner(System.in).nextDouble();

        System.out.println("Hãy nhập chiều rộng hcn = ");
        double chieuRong = new Scanner(System.in).nextDouble();

        double s = chieuDai*chieuRong;
        double p = (chieuDai+chieuRong)*2;

        //kết quả
        System.out.println("Chu vi là: "+p);
        System.out.println("Diện tích là: "+s);
    }
}
