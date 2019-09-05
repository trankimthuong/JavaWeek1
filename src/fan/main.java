package fan;

public class main {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    public static void main(String[] args) {

        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");

        System.out.println("fan1: " + fan1.toString());
        System.out.println("fan2: " + fan2.toString());
    }
}
