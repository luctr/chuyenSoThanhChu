import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Mời bạn nhập số muốn kiểm tra: ");
        int number = sc.nextInt();
        boolean check = true;
        if ( number < 2 ){
            check = false;
        }
        for ( int i = 2; i <= Math.sqrt(number); i++){
            if ( number % i == 0 ){
                check = false;
            }
        }
        if (check){
            System.out.println(number+" là số nguyên tố");

        }else {
            System.out.println(number+" không phải số nguyên tố");
        }
    }
}