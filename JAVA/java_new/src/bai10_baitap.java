import java.util.Scanner;

public class bai10_baitap {
    public static void main(String[] args) {
        System.out.println("Hãy nhập bán kính đường tròn r = ");
        double r = new Scanner(System.in).nextDouble();
        double cv = 2*Math.PI *r;
        double dt = Math.PI*Math.pow(r,2);
        //Kết quả
        System.out.println("Chu vi là: "+cv);
        System.out.println("Diện tích là: "+dt);
    }
}
