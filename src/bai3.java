import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.print(" nhập số kiểm tra : ");
        int number = new Scanner(System.in).nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.print("FIZZBUZZ");
        } else if (number % 5 == 0) {
            System.out.print(" BUZZ ");
        }else if (number % 3 == 0 ){
            System.out.print("FIZZ");
        }
    }
}

