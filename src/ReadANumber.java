import java.util.Scanner;

public class ReadANumber {
    public static void main(String[] args) {
        String str;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        if(number < 10){
            str = oneNum(number);
        }else if(number < 100){
            str = twoNumber(number);
        }else if(number < 1000){
            str = threeNumber(number);
        }else{
            str = "out of ability";
        }
        System.out.printf("Number: %d reads: ", number);
        System.out.println(str);
    }

    public static String oneNum(int num){
        String str = "";
        switch (num){
            case 0:
                str = "zero";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
            default:
                str = "out of ability";
        }
        return str;
    }

    public static String twoNumber(int num){
        int tens = num / 10;
        int ones = num % 10;
        String str = "";
        if(tens == 0){
            if(ones == 0){
                return "";
            }else
                return oneNum(ones);
        }
        if(tens == 1){
            if(num == 10){
                return "ten";
            }
            if(num == 11){
                return "eleven";
            }
            if(num == 12){
                return "twelve";
            }
            if(num == 13){
                return "thirdteen";
            }
            str = oneNum(ones) + "teen";
            return str;
        }
        if(tens == 2){
            str = "twelty";
        }
        else if(tens == 3){
            str = "thirdty";
        }else if(tens == 5){
            str = "fifty";
        } else{
            str = oneNum(tens) + "ty";
        }

        if(ones != 0){
            str += oneNum(ones);
        }
        return str;
    }

    public static String threeNumber(int num){
        int hundreds = num / 100;
        int ones = num % 100;

        String str = "";
        str += oneNum(hundreds) + "hundred" + twoNumber(ones);
        return str;
    }
}
