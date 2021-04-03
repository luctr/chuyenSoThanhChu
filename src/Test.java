import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();

        int tram = (a / 100) * 100;
        int chuc = ((a % 100) / 10) * 10;
        int donVi = ((a % 100) / 10) % 10;

        switch (tram) {
            case 100:
                System.out.print(" one hundred ");
                break;
            case 200:
                System.out.print(" two hundred ");
                break;
            case 300:
                System.out.print(" three hundred ");
                break;
            case 400:
                System.out.print(" four hundred ");
                break;
            case 500:
                System.out.print(" five hundred ");
                break;
            case 600:
                System.out.print(" six hundred ");
                break;
            case 700:
                System.out.print(" seven hundred ");
                break;
            case 800:
                System.out.print(" eight hundred ");
                break;
            case 900:
                System.out.print(" nine hundred ");
                break;
        }
        switch (chuc) {
            case 10:
                System.out.print(" ten ");
                break;
            case 20:
                System.out.print(" twenty ");
                break;
            case 30:
                System.out.print(" thirty ");
                break;
            case 40:
                System.out.print(" forty ");
                break;
            case 50:
                System.out.print(" fifty ");
                break;
            case 60:
                System.out.print(" sixties ");
                break;
            case 70:
                System.out.print(" seventies ");
                break;
            case 80:
                System.out.print(" eighty ");
                break;
            case 90:
                System.out.print(" ninety ");
                break;
        }
        switch (donVi){
            case 1:
                System.out.print(" one ");
                break;
            case 2:
                System.out.print(" two ");
                break;
            case 3:
                System.out.print(" three ");
                break;
            case 4:
                System.out.print(" four ");
                break;
            case 5:
                System.out.print(" five ");
                break;
            case 6:
                System.out.print(" six ");
                break;
            case 7:
                System.out.print(" seven ");
                break;
            case 8:
                System.out.print(" eight ");
                break;
            case 9:
                System.out.print(" nine ");
                break;

        }
    }
}




