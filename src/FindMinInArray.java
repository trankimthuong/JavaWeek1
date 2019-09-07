import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();

            if(size > 10) {
                System.out.println("Size should not exceed 10");
            }
        }while (size > 10);

        arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            System.out.printf("Enter a value of arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Min of array is: " + min);
    }
}
