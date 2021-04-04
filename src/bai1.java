import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {

        System.out.print("nhập số kiểm tra : ");
        int number = new Scanner(System.in).nextInt();
        if (number > 0) {
            System.out.print(number + " là số nguyên dương ");
        }else {
            System.out.print(number + " không phải là số nguyên dương ");
        }
    }
}
