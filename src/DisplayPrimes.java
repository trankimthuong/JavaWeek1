import java.util.Scanner;

public class DisplayPrimes {
    public static void main(String[] args) {
        int count = 0;
        int valueCount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong so nguyen to can in ra: ");
        valueCount = sc.nextInt();

        for(int i = 2;;i++){
            if(checkPrime(i)){
                count++;
                System.out.println(i);
            }
            if(count == valueCount){
                break;
            }
        }
    }

    public static boolean checkPrime(int number){
        boolean check = true;
        int i = 2;
        while (i <= Math.sqrt(number)){
            if(number % i == 0){
                check = false;
                break;
            }
            i++;
        }
        return check;
    }
}
