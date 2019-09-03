import java.util.Scanner;

public class FindAValue {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String inputName = sc.nextLine();
        boolean check = false;
        for(int i = 0; i < students.length; i++){
            if(students[i].equals(inputName)){
                check = true;
                System.out.println("Position of student in the list " + inputName + " is: " + (i + 1));
                break;
            }
        }
        if(check == false){
            System.out.println("not found the name: " + inputName);
        }
    }
}
