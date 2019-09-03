import java.util.Scanner;

public class FindMaxInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthX, lengthY;
        do {
            System.out.println("Enter lengthX: ");
            lengthX = sc.nextInt();
            if(lengthX < 1){
                System.out.println("Error, try again!!!");
            }
            if(lengthX > 10){
                System.out.println("lengthX should not exceed 10, try again!!!");
            }
        }while(lengthX < 1 || lengthX > 10);

        do {
            System.out.println("Enter lengthY: ");
            lengthY = sc.nextInt();
            if(lengthY < 1){
                System.out.println("Error, try again!!!");
            }
            if(lengthY > 10){
                System.out.println("lengthY should not exceed 10, try again!!!");
            }
        }while(lengthY < 1 || lengthY > 10);

        double[][] arr = new double[lengthX][lengthY];

        for(int i = 0; i < lengthX; i++){
            for(int j = 0; j < lengthY; j++){
                System.out.println("Enter a value at position arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Display array: ");
        for(int i = 0; i < lengthX; i++){
            System.out.println("\n");
            for(int j = 0; j < lengthY; j++){
                System.out.printf(arr[i][j] + "\t");
            }
        }

        double max = arr[0][0];
        int valueX = 0, valueY = 0;
        for(int i = 0; i < lengthX; i++){
            for(int j = 0; j < lengthY; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    valueX = i;
                    valueY = j;
                }
            }
        }

        System.out.println("Max in this array is: " + arr[valueX][valueY] + " at position: x =" + valueX + " y = " + valueY);
    }
}
