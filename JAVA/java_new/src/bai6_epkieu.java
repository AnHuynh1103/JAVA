public class bai6_epkieu {
    public static void main(String[] args) {
        //ép kiểu rộng
        int a = 5, b=10;
        double kq = (double) a/b; //int >> double
        System.out.println("Kết quả phép tính là: " +kq);
        System.out.println();

        //ép kiểu hẹp
        int c = 128;
        byte  d = (byte) c;
        System.out.println("Giá trị của biến c: " +c);
        System.out.println("Kết quả sau khi ép kiểu là: " +d);
        System.out.println();


        int e = 15;
        byte f = (byte) e;
        System.out.println("Giá trị của biến e: " +e);
        System.out.println("Kết quả sau khi ép kiểu: " +f);
    }
}
