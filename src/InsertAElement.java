import java.util.Scanner;

public class InsertAElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,0,0,0,0};
        int positionInsert, valueInsert;
        Scanner sc = new Scanner(System.in);
        System.out.println("Display the array before insert: ");
        for(int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] + "\t");
        }
        do {
            System.out.println("Enter a position you wanna insert: ");
            positionInsert = sc.nextInt();
            if(positionInsert < -1 || positionInsert > arr.length){
                System.out.println("Error, try again!!!");
            }
        }while (positionInsert < -1 || positionInsert > arr.length);
        System.out.println("Enter a value you wanna insert: ");
        valueInsert = sc.nextInt();
        for(int i = arr.length - 1; i > positionInsert; i--){
            arr[i] = arr[i-1];
        }
        arr[positionInsert] = valueInsert;
        System.out.println("Display the array after insert: ");
        for(int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] + "\t");
        }
    }
}
