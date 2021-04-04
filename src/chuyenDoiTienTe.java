import java.util.Scanner;

public class chuyenDoiTienTe {
    public static void main(String[] args) {
        int vnd = 22000;
        int result;
        System.out.print(" nhập tỉ giá USD ");
        int sc =new Scanner(System.in).nextInt();
        result = sc * vnd;
        System.out.print(sc + " bằng " + result  + " vnd");
    }
}
