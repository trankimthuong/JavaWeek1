package point2dandpoint3d;

public class main {
    public static void main(String[] args) {
//        Point2D point2d = new Point2D(2,5);
//        point2d.setXY(5,5);
//        System.out.println(point2d);

        Point3D point3d = new Point3D(1,4,5);
        point3d.setXYZ(2,5,6);
        System.out.println(point3d);
        for(int i = 0; i < 3; i++){
            System.out.println(point3d.getXYZ()[i]);
        }
    }
}
