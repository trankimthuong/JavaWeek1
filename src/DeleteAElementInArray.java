import java.util.Scanner;

public class DeleteAElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        int size;
        do{
            System.out.println("Enter a size: ");
            size = sc.nextInt();

            if(size > 10){
                System.out.println("Size should not exceed 10");
            }
        }while(size > 10);
        arr = new int[size];

        for(int i = 0; i < arr.length -1; i++){
            System.out.printf("Enter a value of arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
        arr[arr.length-1] = 0;

        int valueOfElement;
        System.out.println("Enter a value you wanna delete: ");
        valueOfElement = sc.nextInt();

        boolean check = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == valueOfElement){
                deleteElement(arr, i);
                check = true;
                i--;
            }
        }

        if(!check){
            System.out.println("Can not find element you wanna delete!");
        }else{
            System.out.println("Array after delete:");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]);
            }
        }

    }

    public static void deleteElement(int[] a, int position){
        for(int i = position ; i < a.length-1; i++){
           a[i] = a[i+1];
        }
    }
}
