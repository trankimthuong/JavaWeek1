import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            System.out.printf("\n------Menu------\n");
            System.out.println("1. Display rectangle: ");
            System.out.println("2. Display square triangle: ");
            System.out.println("3. Display isosceles triangle ");
            System.out.println("4. Exit");

            System.out.println("Enter your choose: ");
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    displayRectangle(5,3);
                    break;
                case 2:
                    displaySquareTriangle(5);
                    break;
                case 3:
                    displayIsoscelesTriangle(5);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error, try again!!!");
            }
        }while (choose != 4);
    }

    public static void displayRectangle(int x, int y){
        System.out.printf("Display rectangle with width = %d, height = %d", x, y);
        for(int i = 0; i < y; i++){
            System.out.println();
            for(int j = 0; j < x; j++){
                System.out.print("* ");
            }
        }
    }

    public static void displaySquareTriangle(int x){
        System.out.println("Display square triangle with square at top-left");
        for(int i = 0; i < x; i++){
            System.out.println();
            for(int j = x - i; j > 0; j--){
                System.out.print("* ");
            }
        }

        System.out.printf("\n Display square triangle with square at top-right");
        for(int i = 0; i < x; i++){
            System.out.println();
            for(int k = 0; k <= i; k++){
                System.out.print("  ");
            }
            for(int j = x - i; j > 0; j--){
                System.out.print("* ");
            }
        }

        System.out.printf("\n Display square triangle with square at bottom-left");
        for(int i = 0; i < x; i++){
            System.out.println();
            for(int j = 0; j < i+1; j++){
                System.out.print("* ");
            }
        }

        System.out.printf("\n Display square triangle with square at bottom-right");
        for(int i = 0; i < x; i++){
            System.out.println();
            for(int k = x; k > i; k--){
                System.out.print("  ");
            }
            for(int j = 0; j <= i ; j++){
                System.out.print("* ");
            }
        }
    }

    public static void  displayIsoscelesTriangle(int row){
        System.out.println("Display isosceles triangle: ");
        for(int i = 0; i < row; i++){
            System.out.println();
            for(int j = 0; j < row - i - 1; j++){
                System.out.print("  ");
            }
            for(int k = 0 ; k < i * 2 + 1; k++){
                System.out.print("* ");
            }
        }
    }
}
