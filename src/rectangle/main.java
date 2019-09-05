package rectangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double width, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a width: ");
        width = sc.nextDouble();
        System.out.println("Enter a height: ");
        height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle: " + rectangle.display());
        System.out.println("Perimeter of rectangle is: " + rectangle.getPerimeter());
        System.out.println("Area of rectangle is: " + rectangle.getArea());
    }
}
