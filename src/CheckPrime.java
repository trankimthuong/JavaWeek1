import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();

        if(number < 2){
            System.out.printf("Number: %d is not a prime!!!", number);
        }
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if(number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.printf("Number: %d is a prime!!!", number);
            }else{
                System.out.printf("Number: %d is not a prime!!!", number);
            }
        }
    }
}
