import java.util.Scanner;

public class bai10_scanner {
    public static void main(String[] args) {
        /*//Khởi tạo đối tượng scanner
        Scanner sc = new Scanner(System.in);

        //Cho phép nhập chuỗi
        System.out.println("Vui lòng nhập mật khẩu cấp 1: ");
        String mk1 = sc.nextLine();
        System.out.println("Mật khẩu cấp 1 là: "+mk1);
        System.out.println();


        //nhập số nguyên
        System.out.println("Hãy nhập vào 1 số nguyên a = ");
        int a = sc.nextInt();
        System.out.println("a = "+a);
        System.out.println();


        //nhập số thực
        System.out.println("Hãy nhập vào 1 số thực b = ");
        float b = sc.nextFloat();
        System.out.println("b = "+b);
        System.out.println();

        //nhập chuỗi
        System.out.println("Vui lòng nhập mật khẩu cấp 2: ");
        String mk2 = sc.nextLine();
        System.out.println("Mật khẩu cấp 2 là: "+mk2);
        System.out.println();*/

        //nhập tên
        System.out.println("Hãy nhập tên của bạn: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Xin chào "+ten+"!");

        //nhập giới tính
        System.out.println("Giới tính của bạn là: ");
        String gt = new Scanner(System.in).nextLine();
        System.out.println("Bạn vừa nhập giới tính "+gt);

        //nhập float
        System.out.println("Hãy nhập chiều cao của bạn: ");
        float chieuCao = new Scanner(System.in).nextFloat();
        System.out.println("Chiều cao vừa nhập là: "+chieuCao);

        //nhập địa chỉ
        System.out.println("Hãy nhập địa chỉ: ");
        String diaChi = new Scanner(System.in).nextLine();
        System.out.println("Địa chỉ vừa nhập là "+diaChi);
    }
}
