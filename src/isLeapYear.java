import java.util.Scanner;

public class isLeapYear {
    public static void main(String[] args) {
        int year;
        boolean checkLeapYear = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            checkLeapYear = true;
        }
        if(year % 400 == 0){
            checkLeapYear = true;
        }

        if(checkLeapYear){
            System.out.printf("year: %d is a leap year\n!!!", year);
        }else {
            System.out.printf("year: %d is not a leap year\n!!!", year);
        }
    }
}
