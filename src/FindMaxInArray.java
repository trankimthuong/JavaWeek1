import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.print("Enter element value at position " + (i + 1) + " :");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Display array: ");
        for(int j = 0; j < arr.length; j++){
            System.out.printf(arr[j] + "\t");
        }
        int max = arr[0];
        int index = 1;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("max = " + max + " at position: " + index);
    }
}
