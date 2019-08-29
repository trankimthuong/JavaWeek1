import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        name = sc.nextLine();
        System.out.println("Hello " + name + "!!!");
    }
}
