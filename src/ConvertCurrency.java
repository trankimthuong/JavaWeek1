import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        final int exchangeRate = 23000;
        do {
            System.out.println("------Menu------");
            System.out.println("1. USD--->VND");
            System.out.println("2. VND--->USD");
            System.out.println("0. Exit");
            System.out.println("Enter your choose: ");
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    System.out.println("Enter value(USD): ");
                    double usd = sc.nextDouble();
                    System.out.printf("%.2f usd = %.2f vnd", usd, usd * 23000);
                    break;
                case 2:
                    System.out.println("Enter value(VND): ");
                    double vnd = sc.nextDouble();
                    System.out.printf("%.2f vnd = %.2f usd", vnd, vnd / 23000);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Error, try again!!!");
            }
        }while(choose != 0);
    }
}
