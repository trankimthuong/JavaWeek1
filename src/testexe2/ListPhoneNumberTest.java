package testexe2;

public class ListPhoneNumberTest {
    public static void main(String[] args) {
        ListPhoneNumber listphone = new ListPhoneNumber();
        String[] arr1 = {"he", "hi", "012"};
        listphone.addFirst(arr1);

        String[] arr2 = {"tran", "van", "011"};
        listphone.addFirst(arr2);

        String[] arr3 = {"nguyen", "thi", "013"};
        listphone.addLast(arr3);

//        String[] arr4 = {"cong", "phuong", "015"};
//        listphone.fix("he",arr4);
//        listphone.display();

        //listphone.remove("013");
        //listphone.display();

        listphone.findFollowFirstName("he");
        listphone.findFollowFirstName("hef");
        listphone.findFollowLastName("van");
        listphone.findFollowLastName("van1");
        listphone.findFollowPhoneNumber("012");
        listphone.findFollowPhoneNumber("0121");
    }
}
