package pointandmovablepoint;

public class main {
    public static void main(String[] args) {
//        Point point = new Point(3,4);
//        System.out.println(point);

        MovablePoint movPoint = new MovablePoint(2,2);
        System.out.println(movPoint);
        movPoint.move();
        System.out.println(movPoint);
    }
}
