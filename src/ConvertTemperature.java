import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------Menu------");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choise: ");
            choice = sc.nextInt();

            if(choice == 1){
                double fahrenheit;
                System.out.println("Enter value Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                System.out.println("value by Celsius is: " + fahrenheitToCelsius(fahrenheit));
            }
            if(choice == 2){
                double celsius;
                System.out.println("Enter value Celsius: ");
                celsius = sc.nextDouble();
                System.out.println("value by Fahrenheit is: " + celsiusToFahrenheit(celsius));
            }

            if(choice == 0){
                System.exit(0);
            }
        }while (choice != 0);
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }
}
