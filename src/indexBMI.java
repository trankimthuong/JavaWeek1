import java.util.Scanner;

public class indexBMI {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner sc = new Scanner(System.in);
        System.out.print("You weight (in kilograms): ");
        weight = sc.nextDouble();

        System.out.print("You height (in meters): ");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi" , "Interpretation\n");
        if(bmi < 18.5){
            System.out.printf("%-20.2f%s", bmi, "Underweight" );
        } else if(bmi < 25){
            System.out.printf("%-20.2f%s", bmi, "Normal" );
        }else if(bmi < 30){
            System.out.printf("%-20.2f%s", bmi, "Overweight" );
        }else {
            System.out.printf("%-20.2f%s", bmi, "Obese" );
        }
    }
}
