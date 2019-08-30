public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        for(int i = 1; i < 100; i++)
        {
            if(checkPrime(i))
                System.out.println(i);
        }
    }

    public static boolean checkPrime(int number){
        int i = 2;
        boolean check = true;
        if(number == 1){
            check = false;
        }
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
