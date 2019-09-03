import java.util.Scanner;

public class ReverseElementInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while(size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.print("Enter the value of element at position " + (i + 1) + " :");
            array[i] = sc.nextInt();
        }

        System.out.println("Display array before reverse: ");
        for(int i = 0; i < array.length; i++){
            System.out.printf(array[i] + "\t");
        }

        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Display array after reverse: ");
        for(int i = 0; i < array.length; i++){
            System.out.printf(array[i] + "\t");
        }
    }
}
